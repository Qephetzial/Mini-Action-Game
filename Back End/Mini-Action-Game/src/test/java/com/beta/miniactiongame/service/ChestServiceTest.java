package com.beta.miniactiongame.service;

import com.beta.miniactiongame.exceptions.WrongValueException;
import com.beta.miniactiongame.factory.ArmorFactory;
import com.beta.miniactiongame.factory.WeaponFactory;
import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.Item;
import com.beta.miniactiongame.util.UtilityMethods;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.internal.util.Supplier;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class ChestServiceTest {

    @Mock
    private ArmorFactory armorFactory;
    @Mock
    private WeaponFactory weaponFactory;
    private ChestService chestService;
    private MockedStatic<UtilityMethods> mocked;
    private final Armor armor = new Armor();
    //Value can be between 0 and 996 but lower than UNCOMMON_ITEM_LOOT_CHANCE.
    private static final int COMMON_ITEM_LOOT_CHANCE = 200;
    //Value must be lower than COMMON_ITEM_LOOT_CHANCE.
    private static final int OPEN_COMMON_ITEM = COMMON_ITEM_LOOT_CHANCE-1;
    //Value can be between 1 and 997 but lower than RARE_ITEM_LOOT_CHANCE.
    private static final int UNCOMMON_ITEM_LOOT_CHANCE = 400;
    //Value must be lower than UNCOMMON_ITEM_LOOT_CHANCE but at least equal to COMMON_ITEM_LOOT_CHANCE.
    private static final int OPEN_UNCOMMON_ITEM = UNCOMMON_ITEM_LOOT_CHANCE-1;
    //Value can be between 2 and 998 but lower than EPIC_ITEM_LOOT_CHANCE.
    private static final int RARE_ITEM_LOOT_CHANCE = 600;
    //Value must be lower than RARE_ITEM_LOOT_CHANCE but at least equal to UNCOMMON_ITEM_LOOT_CHANCE.
    private static final int OPEN_RARE_ITEM = RARE_ITEM_LOOT_CHANCE-1;
    //Value can be between 3 and 999.
    private static final int EPIC_ITEM_LOOT_CHANCE = 800;
    //Value must be lower than EPIC_ITEM_LOOT_CHANCE but at least equal to RARE_ITEM_LOOT_CHANCE.
    private static final int OPEN_EPIC_ITEM = EPIC_ITEM_LOOT_CHANCE-1;
    //Value must be at least equal to EPIC_ITEM_LOOT_CHANCE but not higher than 999.
    private static final int OPEN_LEGENDARY_ITEM = EPIC_ITEM_LOOT_CHANCE;
    //Value can be between 0 and 999 but bonus loot only available if it set to 0.
    private static final int GET_BONUS_LOOT = 0;
    /*
    In the chestService.openChest method there are a switch cases where an item being chosen
    depending on the random number provided by UtilityMethods.getRandomInt(int). The provided int value
    to the getRandomInt method must be equal to the quantity of cases in the switch case. To identify
    the exact call of getRandomInt method this field value also should be equal to the quantity of cases in the switch case.
     */
    private static final int AMOUNT_OF_CASES = 12;
    /*
    There are several cases in each switch statement. To simplify the mocking,
    the test cases designed to call the same method each time.
    By changing the value of this field, the "openChest(OPEN_COMMON_ITEM, armorFactory::getCommonArmorOne, false);"
    part of each test cases must be changed accordingly.
     */
    private static final int CASE = 0;
    /*
    The game uses decimal numbers to calculate chances for items that's why a random int returned between 0 and 999
    instead of 0 and 99.
     */
    private static final int PERCENTAGE_MAX_RANGE = 1000;

    @BeforeEach
    void setup() {
        chestService = new ChestService(armorFactory, weaponFactory);
        mocked = mockStatic(UtilityMethods.class);
    }

    @AfterEach
    void tearDown() {
        mocked.close();
    }

    @Test
    void openChestGetCommonItem() {
        //It sets up everything to open a common item.
        List<Item> items = openChest(OPEN_COMMON_ITEM, armorFactory::getCommonArmorOne, false);
        //Verify that only the expected method was called and only one item is returned.
        checkMethodCalls(OPEN_COMMON_ITEM, 1, items);
    }

    @Test
    void openChestGetUnCommonItem() {
        //It sets up everything to open an unCommon item.
        List<Item> items = openChest(OPEN_UNCOMMON_ITEM, armorFactory::getUnCommonArmorOne, false);
        //Verify that only the expected method was called and only one item is returned.
        checkMethodCalls(OPEN_UNCOMMON_ITEM, 1, items);
    }


    @Test
    void openChestGetRareItem() {
        //It sets up everything to open a rare item.
        List<Item> items = openChest(OPEN_RARE_ITEM, armorFactory::getRareArmorOne, false);
        //Verify that only the expected method was called and only one item is returned.
        checkMethodCalls(OPEN_RARE_ITEM, 1, items);
    }


    @Test
    void openChestGetEpicItem() {
        //It sets up everything to open an epic item.
        List<Item> items = openChest(OPEN_EPIC_ITEM, armorFactory::getEpicArmorOne, false);
        //Verify that only the expected method was called and only one item is returned.
        checkMethodCalls(OPEN_EPIC_ITEM, 1, items);
    }


    @Test
    void openChestGetLegendaryItem() {
        //It sets up everything to open a legendary item.
        List<Item> items = openChest(OPEN_LEGENDARY_ITEM, armorFactory::getLegendaryArmorOne, false);
        //Verify that only the expected method was called and only one item is returned.
        checkMethodCalls(OPEN_LEGENDARY_ITEM, 1, items);
    }

    @Test
    void openChestGetBonusLoot() {
        //It sets up everything to get a bonus loot
        List<Item> items = openChest(GET_BONUS_LOOT, armorFactory::getCommonArmorOne, true);
        //Verify that only the expected method was called and two item are returned.
        checkMethodCalls(OPEN_COMMON_ITEM, 2, items);
    }

    @Test
    void openChestWrongItemValue() {
        //A wrong value is provided, so we can check if it throws the expected error.
        assertThrows(WrongValueException.class,
                ()-> openChestWithWrongValues(AMOUNT_OF_CASES));
    }

    @Test
    void openChestWrongRarityValue() {
        //A wrong value is provided, so we can check if it throws the expected error.
        assertThrows(WrongValueException.class,
                ()-> openChestWithWrongValues(PERCENTAGE_MAX_RANGE));
    }

    private void mock(int rarity, Supplier<Armor> factoryMethod) {
        /*
        Here, we specify that which rarity will be opened.
        Since the bonus loot is an identical call if rarity 0 and bonusLoot is true then bonus item will be opened.
         */
        mocked.when(() -> UtilityMethods.getRandomInt(PERCENTAGE_MAX_RANGE)).thenReturn(rarity);
        /*
        To be able to provide an item without writing cases for all possibilities,
        we can set which case will be chosen.
         */
        mocked.when(() -> UtilityMethods.getRandomInt(AMOUNT_OF_CASES)).thenReturn(CASE);
        Mockito.when(factoryMethod.get()).thenReturn(armor);
    }

    private List<Item> openChest(int rarity, Supplier<Armor> factoryMethod, boolean chanceForBonusLoot) {
        mock(rarity, factoryMethod);
        return chestService.openChest(COMMON_ITEM_LOOT_CHANCE, UNCOMMON_ITEM_LOOT_CHANCE,
                RARE_ITEM_LOOT_CHANCE, EPIC_ITEM_LOOT_CHANCE, chanceForBonusLoot);
    }

    private void openChestWithWrongValues(int value) {
        /*
        It sets up a wrong value from the getRandomInt method.
        The value expected to be the same as the real method called with.
        Those numbers are represented with AMOUNT_OF_CASES and PERCENTAGE_MAX_RANGE.
         */
        mocked.when(() -> UtilityMethods.getRandomInt(value)).thenReturn(value);
        chestService.openChest(COMMON_ITEM_LOOT_CHANCE, UNCOMMON_ITEM_LOOT_CHANCE,
                RARE_ITEM_LOOT_CHANCE, EPIC_ITEM_LOOT_CHANCE, false);
    }

    private void checkMethodCalls(int rarity, int expectedTimesCalled, List<Item> items) {
        int timesCommonMethodCalled = 0;
        int timesUnCommonMethodCalled = 0;
        int timesRareMethodCalled = 0;
        int timesEpicMethodCalled = 0;
        int timesLegendaryMethodCalled = 0;
        //This case changes the value of times<rarity>MethodCalled field by the expected times it was called.
        switch (rarity) {
            case OPEN_COMMON_ITEM -> timesCommonMethodCalled = expectedTimesCalled;
            case OPEN_UNCOMMON_ITEM -> timesUnCommonMethodCalled = expectedTimesCalled;
            case OPEN_RARE_ITEM -> timesRareMethodCalled = expectedTimesCalled;
            case OPEN_EPIC_ITEM -> timesEpicMethodCalled = expectedTimesCalled;
            case OPEN_LEGENDARY_ITEM -> timesLegendaryMethodCalled = expectedTimesCalled;
            default -> throw new RuntimeException("checkMethodCalls method called with wrong value:" + rarity);
        }
        //Check how many item was returned. It must be equal to the amount of method calls.
        assertEquals(expectedTimesCalled, items.size());
        //Verification which method was called and how many times.
        verify(armorFactory, times(timesCommonMethodCalled)).getCommonArmorOne();
        verify(armorFactory, times(timesUnCommonMethodCalled)).getUnCommonArmorOne();
        verify(armorFactory, times(timesRareMethodCalled)).getRareArmorOne();
        verify(armorFactory, times(timesEpicMethodCalled)).getEpicArmorOne();
        verify(armorFactory, times(timesLegendaryMethodCalled)).getLegendaryArmorOne();
    }
}
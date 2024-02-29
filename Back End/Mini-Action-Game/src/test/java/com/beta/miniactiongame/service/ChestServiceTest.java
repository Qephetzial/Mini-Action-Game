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
    //Value should be under COMMON_ITEM_LOOT_CHANCE.
    private static final int OPEN_COMMON_ITEM = COMMON_ITEM_LOOT_CHANCE-1;
    //Value can be between 1 and 997 but lower than RARE_ITEM_LOOT_CHANCE.
    private static final int UNCOMMON_ITEM_LOOT_CHANCE = 400;
    //Value should be under UNCOMMON_ITEM_LOOT_CHANCE but at least equal to COMMON_ITEM_LOOT_CHANCE.
    private static final int OPEN_UNCOMMON_ITEM = UNCOMMON_ITEM_LOOT_CHANCE-1;
    //Value can be between 2 and 998 but lower than EPIC_ITEM_LOOT_CHANCE.
    private static final int RARE_ITEM_LOOT_CHANCE = 600;
    //Value should be under RARE_ITEM_LOOT_CHANCE but at least equal to UNCOMMON_ITEM_LOOT_CHANCE.
    private static final int OPEN_RARE_ITEM = RARE_ITEM_LOOT_CHANCE-1;
    //Value can be between 3 and 999.
    private static final int EPIC_ITEM_LOOT_CHANCE = 800;
    //Value should be under EPIC_ITEM_LOOT_CHANCE but at least equal to RARE_ITEM_LOOT_CHANCE.
    private static final int OPEN_EPIC_ITEM = EPIC_ITEM_LOOT_CHANCE-1;
    //Value should be at least equal to EPIC_ITEM_LOOT_CHANCE but not higher than 999.
    private static final int OPEN_LEGENDARY_ITEM = EPIC_ITEM_LOOT_CHANCE;
    //Value can be between 0 and 999 but bonus loot only available if it set to 0.
    private static final int GET_BONUS_LOOT = 0;
    /*
    In the chestService.openChest method there is a switch case where an item being chosen
    depending on the random number provided by UtilityMethods.getRandomInt(int). The provided int value
    to the getRandomInt method must be equal to the quantity of cases in the switch case. To identify
    the exact call of this method this field value also should be equal to the quantity of cases in the switch case.
     */
    private static final int AMOUNT_OF_CASES = 12;
    /*
    There are several cases in each switch statement. To simplify the mocking,
    the test cases designed to call the same method each time.
    By changing the value of this field the "Mockito.when(armorFactory.getCommonArmorOne()).thenReturn(armor);"
    part of each test cases must be changed accordingly.
     */
    private static final int CASE = 0;

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
    void openChestAndGetCommonItem() {
        /*
        Here, we specify that we go to the "common" branch of the if statement by
        setting the OPEN_COMMON_ITEM value: value < COMMON_ITEM_LOOT_CHANCE.
         */
        mocked.when(() -> UtilityMethods.getRandomInt(1000)).thenReturn(OPEN_COMMON_ITEM);
        /*
        To be able to provide an item without writing 12 case for all possibilities,
        it set to 0, so every time the same method will be called.
         */
        mocked.when(() -> UtilityMethods.getRandomInt(AMOUNT_OF_CASES)).thenReturn(CASE);
        Mockito.when(armorFactory.getCommonArmorOne()).thenReturn(armor);

        List<Item> items = openChest(false);
        //Exactly one item expected since the bonusLoot is false.
        assertEquals(1, items.size());
        //Verify that only the expected method was called.
        verify(armorFactory, times(1)).getCommonArmorOne();
        verify(armorFactory, times(0)).getUnCommonArmorOne();
        verify(armorFactory, times(0)).getRareArmorOne();
        verify(armorFactory, times(0)).getEpicArmorOne();
        verify(armorFactory, times(0)).getLegendaryArmorOne();
    }

    @Test
    void openChestAndGetUnCommonItem() {
        /*
        Here, we specify that we go to the "unCommon" branch of the if statement by
        setting the OPEN_UNCOMMON_ITEM value: COMMON_ITEM_LOOT_CHANCE =< value < UNCOMMON_ITEM_LOOT_CHANCE.
         */
        mocked.when(() -> UtilityMethods.getRandomInt(1000)).thenReturn(OPEN_UNCOMMON_ITEM);
        /*
        To be able to provide an item without writing 12 case for all possibilities,
        it set to 0, so every time the same method will be called.
         */
        mocked.when(() -> UtilityMethods.getRandomInt(AMOUNT_OF_CASES)).thenReturn(CASE);
        Mockito.when(armorFactory.getUnCommonArmorOne()).thenReturn(armor);

        List<Item> items = openChest(false);
        //Exactly one item expected since the bonusLoot is false.
        assertEquals(1, items.size());
        //Verify that only the expected method was called.
        verify(armorFactory, times(0)).getCommonArmorOne();
        verify(armorFactory, times(1)).getUnCommonArmorOne();
        verify(armorFactory, times(0)).getRareArmorOne();
        verify(armorFactory, times(0)).getEpicArmorOne();
        verify(armorFactory, times(0)).getLegendaryArmorOne();
    }


    @Test
    void openChestAndGetRareItem() {
        /*
        Here, we specify that we go to the "unCommon" branch of the if statement by
        setting the OPEN_RARE_ITEM value: UNCOMMON_ITEM_LOOT_CHANCE =< value < RARE_ITEM_LOOT_CHANCE.
         */
        mocked.when(() -> UtilityMethods.getRandomInt(1000)).thenReturn(OPEN_RARE_ITEM);
        /*
        To be able to provide an item without writing 12 case for all possibilities,
        it set to 0, so every time the same method will be called.
         */
        mocked.when(() -> UtilityMethods.getRandomInt(AMOUNT_OF_CASES)).thenReturn(CASE);
        Mockito.when(armorFactory.getRareArmorOne()).thenReturn(armor);

        List<Item> items = openChest(false);
        //Exactly one item expected since the bonusLoot is false.
        assertEquals(1, items.size());
        //Verify that only the expected method was called.
        verify(armorFactory, times(0)).getCommonArmorOne();
        verify(armorFactory, times(0)).getUnCommonArmorOne();
        verify(armorFactory, times(1)).getRareArmorOne();
        verify(armorFactory, times(0)).getEpicArmorOne();
        verify(armorFactory, times(0)).getLegendaryArmorOne();
    }


    @Test
    void openChestAndGetEpicItem() {
        /*
        Here, we specify that we go to the "unCommon" branch of the if statement by
        setting the OPEN_EPIC_ITEM value: RARE_ITEM_LOOT_CHANCE =< value < EPIC_ITEM_LOOT_CHANCE.
         */
        mocked.when(() -> UtilityMethods.getRandomInt(1000)).thenReturn(OPEN_EPIC_ITEM);
        /*
        To be able to provide an item without writing 12 case for all possibilities,
        it set to 0, so every time the same method will be called.
         */
        mocked.when(() -> UtilityMethods.getRandomInt(AMOUNT_OF_CASES)).thenReturn(CASE);
        Mockito.when(armorFactory.getEpicArmorOne()).thenReturn(armor);

        List<Item> items = openChest(false);
        //Exactly one item expected since the bonusLoot is false.
        assertEquals(1, items.size());
        //Verify that only the expected method was called.
        verify(armorFactory, times(0)).getCommonArmorOne();
        verify(armorFactory, times(0)).getUnCommonArmorOne();
        verify(armorFactory, times(0)).getRareArmorOne();
        verify(armorFactory, times(1)).getEpicArmorOne();
        verify(armorFactory, times(0)).getLegendaryArmorOne();
    }


    @Test
    void openChestAndGetLegendaryItem() {
        /*
        Here, we specify that we go to the "unCommon" branch of the if statement by
        setting the OPEN_LEGENDARY_ITEM value: EPIC_ITEM_LOOT_CHANCE =< value.
         */
        mocked.when(() -> UtilityMethods.getRandomInt(1000)).thenReturn(OPEN_LEGENDARY_ITEM);
        /*
        To be able to provide an item without writing 12 case for all possibilities,
        it set to 0, so every time the same method will be called.
         */
        mocked.when(() -> UtilityMethods.getRandomInt(AMOUNT_OF_CASES)).thenReturn(CASE);
        Mockito.when(armorFactory.getLegendaryArmorOne()).thenReturn(armor);

        List<Item> items = openChest(false);
        //Exactly one item expected since the bonusLoot is false.
        assertEquals(1, items.size());
        //Verify that only the expected method was called.
        verify(armorFactory, times(0)).getCommonArmorOne();
        verify(armorFactory, times(0)).getUnCommonArmorOne();
        verify(armorFactory, times(0)).getRareArmorOne();
        verify(armorFactory, times(0)).getEpicArmorOne();
        verify(armorFactory, times(1)).getLegendaryArmorOne();
    }


    @Test
    void getBonusLoot() {
        /*
        Here, we set true one of the condition for the bonus loot what is that
        GET_BONUS_LOOT is 0.
         */
        mocked.when(() -> UtilityMethods.getRandomInt(1000)).thenReturn(GET_BONUS_LOOT);
        /*
        To be able to provide an item without writing 12 case for all possibilities,
        it set to 0, so every time the same method will be called.
         */
        mocked.when(() -> UtilityMethods.getRandomInt(AMOUNT_OF_CASES)).thenReturn(CASE);
        Mockito.when(armorFactory.getCommonArmorOne()).thenReturn(armor);

        List<Item> items = openChest(true);
        //Exactly two item expected since the bonusLoot is false.
        assertEquals(2, items.size());
    }

    @Test
    void wrongItemValue() {
        //A wrong value is provided, so we can check if it throws the expected error.
        mocked.when(() -> UtilityMethods.getRandomInt(AMOUNT_OF_CASES)).thenReturn(12);

        assertThrows(WrongValueException.class,
                ()-> openChest(false));
    }

    @Test
    void wrongRarityValue() {
        //A wrong value is provided, so we can check if it throws the expected error.
        mocked.when(() -> UtilityMethods.getRandomInt(1000)).thenReturn(1000);

        assertThrows(WrongValueException.class,
                ()-> openChest(false));
    }

    private List<Item> openChest(boolean chanceForBonusLoot) {
        return chestService.openChest(COMMON_ITEM_LOOT_CHANCE, UNCOMMON_ITEM_LOOT_CHANCE,
                RARE_ITEM_LOOT_CHANCE, EPIC_ITEM_LOOT_CHANCE, chanceForBonusLoot);
    }
}
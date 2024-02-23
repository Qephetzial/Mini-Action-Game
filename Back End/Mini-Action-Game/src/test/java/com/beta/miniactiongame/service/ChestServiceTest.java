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
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

;

@ExtendWith(MockitoExtension.class)
class ChestServiceTest {

    @Mock
    private ArmorFactory armorFactory;
    @Mock
    private WeaponFactory weaponFactory;
    private ChestService chestService;
    private MockedStatic<UtilityMethods> mocked;
    private final Armor armor = new Armor();

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
    void openChest() {
        mocked.when(() -> UtilityMethods.getRandomInt(anyInt())).thenReturn(0);
        Mockito.when(armorFactory.getCommonArmorOne()).thenReturn(armor);
        List<Item> item = chestService.openChest(800, 950, 990, 1000, false);
        assertEquals(1, item.size());
    }

    @Test
    void getBonusLoot() {
        mocked.when(() -> UtilityMethods.getRandomInt(anyInt())).thenReturn(0);
        Mockito.when(armorFactory.getCommonArmorOne()).thenReturn(armor);
        List<Item> items = chestService.openChest(200, 400, 600, 800, true);
        assertEquals(2, items.size());

    }

    @Test
    void wrongItemValue() {
        mocked.when(() -> UtilityMethods.getRandomInt(anyInt())).thenReturn(12);
        assertThrows(WrongValueException.class, ()-> chestService.openChest(200, 400, 600, 800, true));
    }

    @Test
    void wrongRarityValue() {
        mocked.when(() -> UtilityMethods.getRandomInt(anyInt())).thenReturn(1000);
        assertThrows(WrongValueException.class, ()-> chestService.openChest(200, 400, 600, 800, true));
    }
}
package com.beta.miniactiongame.service;

import com.beta.miniactiongame.exceptions.WrongValueException;
import com.beta.miniactiongame.factory.ArmorFactory;
import com.beta.miniactiongame.factory.WeaponFactory;
import com.beta.miniactiongame.model.item.Item;
import com.beta.miniactiongame.model.item.Rarity;
import com.beta.miniactiongame.util.UtilityMethods;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

@ExtendWith(MockitoExtension.class)
class ChestServiceTest {

    @Mock
    private ArmorFactory armorFactory;

    @Mock
    private WeaponFactory weaponFactory;

    private final ChestService chestService = new ChestService(armorFactory, weaponFactory);

    @Test
    void openChest() {
        List<Item> item = chestService.openChest(800, 950, 990, 1000, false);
        assertNotNull(item);
    }

    @Test
    void getCommonItem() {
        List<Item> item = chestService.openChest(1000, 0, 0, 0, false);
        assertEquals(Rarity.COMMON, item.get(0).getRarity());
    }

    @Test
    void getUnCommonItem() {
        List<Item> item = chestService.openChest(0, 1000, 0, 0, false);
        assertEquals(Rarity.UNCOMMON, item.get(0).getRarity());
    }

    @Test
    void getRareItem() {
        List<Item> item = chestService.openChest(0, 0, 1000, 0, false);
        assertEquals(Rarity.RARE, item.get(0).getRarity());
    }

    @Test
    void getEpicItem() {
        List<Item> item = chestService.openChest(0, 0, 0, 1000, false);
        assertEquals(Rarity.EPIC, item.get(0).getRarity());
    }

    @Test
    void getLegendaryItem() {
        List<Item> item = chestService.openChest(0, 0, 0, 0, false);
        assertEquals(Rarity.LEGENDARY, item.get(0).getRarity());
    }

    @Test
    void getBonusLoot() {
        try (MockedStatic<UtilityMethods> mocked = mockStatic(UtilityMethods.class)) {
            mocked.when(() -> UtilityMethods.getRandomInt(anyInt())).thenReturn(0);
            List<Item> items = chestService.openChest(200, 400, 600, 800, true);
            assertEquals(2, items.size());
        }
    }

    @Test
    void wrongItemValue() {
        try (MockedStatic<UtilityMethods> mocked = mockStatic(UtilityMethods.class)) {
            mocked.when(() -> UtilityMethods.getRandomInt(anyInt())).thenReturn(12);
            assertThrows(WrongValueException.class, ()-> chestService.openChest(200, 400, 600, 800, true));
        }
    }

    @Test
    void wrongRarityValue() {
        try (MockedStatic<UtilityMethods> mocked = mockStatic(UtilityMethods.class)) {
            mocked.when(() -> UtilityMethods.getRandomInt(anyInt())).thenReturn(1000);
            assertThrows(WrongValueException.class, ()-> chestService.openChest(200, 400, 600, 800, true));
        }
    }
}
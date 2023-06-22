package com.beta.miniactiongame.service;

import com.beta.miniactiongame.factory.ArmorFactory;
import com.beta.miniactiongame.factory.WeaponFactory;
import com.beta.miniactiongame.model.item.Item;
import com.beta.miniactiongame.model.item.Rarity;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChestServiceTest {

    private final ChestService chestService = new ChestService(new ArmorFactory(), new WeaponFactory());

    @Test
    void openChest() {
        List<Item> item = chestService.openChest(800, 950, 990, 1000, false);
        assertNotNull(item);
    }

    @Test
    void getCommonItem() {
        List<Item> item = chestService.openChest(1000,0,0,0,false);
        assertEquals(Rarity.COMMON, item.get(0).getRarity());
    }

    @Test
    void getUnCommonItem() {
        List<Item> item = chestService.openChest(0,1000,0,0,false);
        assertEquals(Rarity.UNCOMMON, item.get(0).getRarity());
    }

    @Test
    void getRareItem() {
        List<Item> item = chestService.openChest(0,0,1000,0,false);
        assertEquals(Rarity.RARE, item.get(0).getRarity());
    }

    @Test
    void getEpicItem() {
        List<Item> item = chestService.openChest(0,0,0,1000,false);
        assertEquals(Rarity.EPIC, item.get(0).getRarity());
    }

    @Test
    void getLegendaryItem() {
        List<Item> item = chestService.openChest(0,0,0,0,false);
        assertEquals(Rarity.LEGENDARY, item.get(0).getRarity());
    }

    @Test
    void getBonusLoot() {
        boolean needBonusLoot = true;
        int counter = 0;
        List<Item> items;
        while (needBonusLoot && counter < 100000) {
            items = chestService.openChest(200, 400, 600, 800, true);
            if (items.size() == 2) {
                needBonusLoot = false;
            }
            counter ++;
        }
        assertFalse(needBonusLoot);
    }
}
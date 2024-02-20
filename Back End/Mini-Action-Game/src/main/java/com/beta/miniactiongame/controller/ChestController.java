package com.beta.miniactiongame.controller;

import com.beta.miniactiongame.model.AppUser;
import com.beta.miniactiongame.model.item.ChestType;
import com.beta.miniactiongame.model.item.Item;
import com.beta.miniactiongame.model.item.LootChest;
import com.beta.miniactiongame.service.AppUserService;
import com.beta.miniactiongame.service.ChestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/chest")
public class ChestController {

    private final ChestService chestService;
    private final AppUserService appUserService;
    private final LootChest lootChest;


    @PostMapping
    public List<Item> openChest(@RequestParam("type") ChestType chestType, @RequestBody AppUser appUser) {
        LootChest.Chest chest = lootChest.getChest(chestType);
        List<Item> items = chestService.openChest(
                chest.commonLootChance(),
                chest.unCommonLootChance(),
                chest.rareLootChance(),
                chest.epicLootChance(),
                chest.hasChanceForBonusLoot());
        appUserService.addItem(items, appUser);
        return items;
    }
}

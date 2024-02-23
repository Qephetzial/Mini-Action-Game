package com.beta.miniactiongame.controller;

import com.beta.miniactiongame.model.AppUser;
import com.beta.miniactiongame.model.item.Item;
import com.beta.miniactiongame.service.AppUserService;
import com.beta.miniactiongame.service.ChestService;
import com.beta.miniactiongame.util.ChestType;
import com.beta.miniactiongame.util.LootChest;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.beta.miniactiongame.util.LootChest.getChest;

@Log4j2
@RestController
@AllArgsConstructor
@RequestMapping("/api/chest")
public class ChestController {

    private final ChestService chestService;
    private final AppUserService appUserService;

    @PostMapping
    public List<Item> openChest(@RequestParam("type") ChestType chestType, @RequestBody AppUser appUser) {
        log.trace("/api/chest endpoint");
        log.debug("The request parameter \"type\" is {}", chestType);
        log.debug("The appUser's id is {}", appUser.getId());
        LootChest.Chest chest = getChest(chestType);
        log.debug("The chest type is {}", chest.name());
        List<Item> items = chestService.openChest(
                chest.commonLootChance(),
                chest.unCommonLootChance(),
                chest.rareLootChance(),
                chest.epicLootChance(),
                chest.chanceForBonusLoot());
        appUserService.addItem(items, appUser);
        return items;
    }
}
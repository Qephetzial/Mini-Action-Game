package com.beta.miniactiongame.controller;

import com.beta.miniactiongame.model.AppUser;
import com.beta.miniactiongame.model.item.Items;
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

    //This route creates an item and add it to the AppUser's corresponding item list
    @PostMapping("/iron")
    public List<Items> openIronChest(@RequestBody AppUser appUser) {
        List<Items> items = chestService.openChest(800, 950, 990, 1000, false);
        appUserService.addItem(items, appUser);
        return items;
    }

    //This route creates an item and add it to the AppUser's corresponding item list
    @PostMapping("/bronze")
    public List<Items> openBronzeChest(@RequestBody AppUser appUser) {
        List<Items> items = chestService.openChest(703, 905, 977, 999, false);
        appUserService.addItem(items, appUser);
        return items;
    }

    //This route creates an item and add it to the AppUser's corresponding item list
    @PostMapping("/silver")
    public List<Items> openSilverChest(@RequestBody AppUser appUser) {
        List<Items> items = chestService.openChest(600, 850, 950, 995, false);
        appUserService.addItem(items, appUser);
        return items;
    }

    //This route creates an item and add it to the AppUser's corresponding item list
    @PostMapping("/golden")
    public List<Items> openGoldenChest(@RequestBody AppUser appUser) {
        List<Items> items = chestService.openChest(500, 750, 900, 990, true);
        appUserService.addItem(items, appUser);
        return items;
    }
}

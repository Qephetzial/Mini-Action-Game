package com.beta.miniactiongame.controller;

import com.beta.miniactiongame.model.AppUser;
import com.beta.miniactiongame.service.AppUserService;
import com.beta.miniactiongame.service.ChestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/chest")
public class ChestController {

    private final ChestService chestService;
    private final AppUserService appUserService;

    @PostMapping("/iron")
    public void openIronChest(@RequestBody AppUser appUser) {
        appUserService.addItem(chestService.openChest(800, 950, 990, 1000, false), appUser);
    }

    @PostMapping("/bronze")
    public void openBronzeChest(@RequestBody AppUser appUser) {
        appUserService.addItem(chestService.openChest(703, 905, 977, 999, false), appUser);
    }

    @PostMapping("/silver")
    public void openSilverChest(@RequestBody AppUser appUser) {
        appUserService.addItem(chestService.openChest(600, 850, 950, 995, false), appUser);
    }

    @PostMapping("/golden")
    public void openGoldenChest(@RequestBody AppUser appUser) {
        appUserService.addItem(chestService.openChest(500, 750, 900, 990, true), appUser);
    }
}

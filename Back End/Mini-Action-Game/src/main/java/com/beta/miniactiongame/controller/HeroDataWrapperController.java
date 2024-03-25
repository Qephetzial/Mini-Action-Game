package com.beta.miniactiongame.controller;

import com.beta.miniactiongame.model.AppUser;
import com.beta.miniactiongame.model.HeroDataWrapper;
import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.Weapon;
import com.beta.miniactiongame.service.AppUserService;
import com.beta.miniactiongame.service.HeroDataWrapperService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/herodatawrapper")
@RequiredArgsConstructor
public class HeroDataWrapperController {

    private final HeroDataWrapperService heroDataWrapperService;
    private final AppUserService appUserService;

    @PutMapping()
    public HeroDataWrapper equipItem(@RequestParam("hdwId") String hdwId,
                                     @RequestParam("itemId") String id,
                                     @RequestParam("itemType") String itemType,
                                     @RequestBody AppUser appUser) {
        UUID heroDataWrapperId = UUID.fromString(hdwId);
        UUID itemId = UUID.fromString(id);
        HeroDataWrapper heroDataWrapper = heroDataWrapperService.findHeroDataWrapperById(heroDataWrapperId, appUser);
        if (itemType.equalsIgnoreCase("armor")) {
            Armor armor = appUserService.getArmor(itemId, appUser);
            armor = heroDataWrapperService.changeArmor(heroDataWrapper, armor);
            appUserService.addItem(armor, appUser);
        } else {
            Weapon weapon = appUserService.getWeapon(itemId, appUser);
            weapon = heroDataWrapperService.changeWeapon(heroDataWrapper, weapon);
            appUserService.addItem(weapon, appUser);
        }
        return heroDataWrapper;
    }

}

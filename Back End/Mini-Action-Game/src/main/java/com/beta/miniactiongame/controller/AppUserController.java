package com.beta.miniactiongame.controller;

import com.beta.miniactiongame.model.AppUser;
import com.beta.miniactiongame.model.HeroDataWrapper;
import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.Weapon;
import com.beta.miniactiongame.service.AppUserService;
import com.beta.miniactiongame.service.HeroDataWrapperService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class AppUserController {

    private final AppUserService appUserService;
    private final HeroDataWrapperService heroDataWrapperService;

    @GetMapping("/get-{name}")
    public AppUser getAppUser(@PathVariable String name) {
        return appUserService.getAppUser(name);
    }

    @PutMapping("/{itemId}")
    public void sellItem(@PathVariable UUID itemId, @RequestBody AppUser appUser) {
        appUserService.updateAppUser(appUser);
    }

    @PutMapping
    public void updateAppUser(@RequestBody AppUser appUser) {
        appUserService.updateAppUser(appUser);
    }

    @PostMapping
    public void logOut(HttpServletRequest request,
                       HttpServletResponse response) {
        for (Cookie cookie : request.getCookies()) {
            cookie.setMaxAge(0);
            response.addCookie(cookie);

        }
    }

    @PutMapping("/equip")
    public AppUser equipItem(@RequestParam("hdwId") String hdwId,
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
        return appUser;
    }

    @PostMapping("/buy_hero")
    public AppUser buyHero(
            @RequestParam("heroId") String id,
            @RequestBody AppUser appUser) {
        UUID heroId = UUID.fromString(id);
        heroDataWrapperService.obtainHero(appUser.getHeroes(), heroId, appUser);
        return appUser;
    }

    @PostMapping("/select_hero")
    public AppUser selectHero(@RequestParam("heroId") String id,
                              @RequestBody AppUser appUser) {
        UUID heroId = UUID.fromString(id);
        heroDataWrapperService.selectHero(appUser.getHeroes(), heroId);
        return appUser;
    }
}
package com.beta.miniactiongame.service;

import com.beta.miniactiongame.model.AppUser;
import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.Item;
import com.beta.miniactiongame.model.item.ItemType;
import com.beta.miniactiongame.model.item.Weapon;
import com.beta.miniactiongame.repository.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AppUserService {

    private final AppUserRepository appUserRepository;

    public void updateAppUser (AppUser updatedAppUser) {
        AppUser appUser = getAppUser(updatedAppUser.getName());
        appUser.setCoin(updatedAppUser.getCoin());
        appUser.setHeroes(updatedAppUser.getHeroes());
        appUser.setArmors(updatedAppUser.getArmors());
        appUser.setWeapons(updatedAppUser.getWeapons());
        appUserRepository.save(appUser);
    }

    public void addItems(List<Item> items, AppUser appUser) {
        for (Item item: items) {
            addItem(item, appUser);
        }
    }

    public void addItem(Item item, AppUser appUser) {
        if (item.getItemType().equals(ItemType.ARMOR)) {
            Armor armor = (Armor) item;
            appUser.addArmor(armor);
        } else {
            Weapon weapon = (Weapon) item;
            appUser.addWeapon(weapon);
        }
        updateAppUser(appUser);
    }

    public AppUser getAppUser(String name) {
        return appUserRepository.findByName(name).orElseThrow(() -> new UsernameNotFoundException(name + " not found"));
    }

    public Armor getArmor(UUID uuid, AppUser appUser) {
        return appUser.getArmor(uuid);
    }

    public Weapon getWeapon(UUID uuid, AppUser appUser) {
        return appUser.getWeapon(uuid);
    }
}
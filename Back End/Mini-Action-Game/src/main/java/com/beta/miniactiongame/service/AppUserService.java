package com.beta.miniactiongame.service;

import com.beta.miniactiongame.exceptions.ArmorNotFoundException;
import com.beta.miniactiongame.exceptions.WeaponNotFoundException;
import com.beta.miniactiongame.model.AppUser;
import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.Item;
import com.beta.miniactiongame.model.item.ItemType;
import com.beta.miniactiongame.model.item.Weapon;
import com.beta.miniactiongame.repository.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Iterator;
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
            appUser.getArmors().add((Armor) item);
        } else {
            appUser.getWeapons().add((Weapon) item);
        }
        updateAppUser(appUser);
    }

    public AppUser getAppUser(String name) {
        return appUserRepository.findByName(name).orElseThrow(() -> new UsernameNotFoundException(name + " not found"));
    }

    public Armor getArmor(UUID uuid, AppUser appUser) {
        Iterator<Armor> iterator = appUser.getArmors().iterator();
        while (iterator.hasNext()) {
            Armor armor = iterator.next();
            if (armor.getId().equals(uuid)) {
                iterator.remove();
                return armor;
            }
        }
        throw new ArmorNotFoundException(
                "Armor(" + uuid + ") was not found in the user's(" + appUser.getId() + ") armors list!");
    }

    public Weapon getWeapon(UUID uuid, AppUser appUser) {
        Iterator<Weapon> iterator = appUser.getWeapons().iterator();
        while (iterator.hasNext()) {
            Weapon weapon = iterator.next();
            if (weapon.getId().equals(uuid)) {
                iterator.remove();
                return weapon;
            }
        }
        throw new WeaponNotFoundException(
                "Weapon(" + uuid + ") was not found in the user's(" + appUser.getId() + ") weapons list!");
    }
}
package com.beta.miniactiongame.service;

import com.beta.miniactiongame.model.AppUser;
import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.ItemType;
import com.beta.miniactiongame.model.item.Items;
import com.beta.miniactiongame.model.item.Weapon;
import com.beta.miniactiongame.repository.AppUserRepository;
import lombok.AllArgsConstructor;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class AppUserService {
    private final AppUserRepository appUserRepository;
    private final HeroService heroService;

    //This method initialises the necessary fields for the app user.
    public AppUser createAppUser(AppUser appUser) {
        appUser.setHeroes(heroService.createHeroes());
        appUser.setArmors(new ArrayList<>());
        appUser.setWeapons(new ArrayList<>());
        appUserRepository.save(appUser);
        return appUserRepository.findByName(appUser.getName());
    }

    //This method returns all the registered app user for the login. It's a temporary solution.
    public List<AppUser> getAppUsers() {
        return appUserRepository.findAll();
    }

    //This method updates any changes in the app user.
    public void updateAppUser (AppUser appUser) {
        appUserRepository.save(appUser);
    }

    public void addItem(List<Items> items, AppUser appUser) {
        for (Items item: items) {
            if (item.getItemType().equals(ItemType.ARMOR)) {
                Armor armor = (Armor) item;
                appUser.addArmor(armor);
            } else {
                Weapon weapon = (Weapon) item;
                appUser.addWeapon(weapon);
            }
        }
        updateAppUser(appUser);
    }
}

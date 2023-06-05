package com.beta.miniactiongame.service;

import com.beta.miniactiongame.model.AppUser;
import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.ItemType;
import com.beta.miniactiongame.model.item.Items;
import com.beta.miniactiongame.model.item.Weapon;
import com.beta.miniactiongame.repository.AppUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AppUserService {
    private final AppUserRepository appUserRepository;


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


    public AppUser getAppUser(String name) {
        return appUserRepository.findByName(name).orElseThrow();
    }
}

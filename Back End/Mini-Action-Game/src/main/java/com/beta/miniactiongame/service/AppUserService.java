package com.beta.miniactiongame.service;

import com.beta.miniactiongame.model.AppUser;
import com.beta.miniactiongame.model.item.*;
import com.beta.miniactiongame.repository.AppUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class AppUserService {
    private final AppUserRepository appUserRepository;


    //This method updates any changes in the app user.
    public void updateAppUser (AppUser updatedAppUser) {
        AppUser appUser = getAppUser(updatedAppUser.getName());
        appUser.setCoin(updatedAppUser.getCoin());
        appUser.setHeroes(updatedAppUser.getHeroes());
        appUser.setArmors(updatedAppUser.getArmors());
        appUser.setWeapons(updatedAppUser.getWeapons());
        appUserRepository.save(appUser);
    }

    //This method downcast the item and add it to the corresponding list of the user
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

    //This method find and return an AppUser by name
    public AppUser getAppUser(String name) {
        return appUserRepository.findByName(name).orElseThrow(() -> new UsernameNotFoundException(name + " not found"));
    }
}

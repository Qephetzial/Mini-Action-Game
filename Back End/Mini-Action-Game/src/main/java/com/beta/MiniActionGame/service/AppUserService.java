package com.beta.MiniActionGame.service;

import com.beta.MiniActionGame.model.AppUser;
import com.beta.MiniActionGame.repository.AppUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
}

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

    public void saveAppUser (AppUser appUser) {
        appUserRepository.save(appUser);
    }

    public List<AppUser> getAppUsers() {
        return appUserRepository.findAll();
    }

    public AppUser getAppUserById(UUID id) {
        return appUserRepository.findById(id).orElse(null);
    }

    public AppUser updateAppUser (AppUser appUser) {
        appUserRepository.save(appUser);
        return appUser;
    }

    public AppUser createAppUser(AppUser appUser) {
        appUser.setHeroes(heroService.createHeroes());
        appUser.setArmors(new ArrayList<>());
        appUserRepository.save(appUser);
        return appUserRepository.findByName(appUser.getName());
    }
}

package com.beta.MiniActionGame.service;


import com.beta.MiniActionGame.model.AppUser;
import com.beta.MiniActionGame.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AppUserService {
    private final AppUserRepository appUserRepository;
    private final ItemCollectorService itemCollectorService;
    private final HeroCollectorService heroCollectorService;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository, ItemCollectorService itemCollectorService, HeroCollectorService heroCollectorService) {
        this.appUserRepository = appUserRepository;
        this.itemCollectorService = itemCollectorService;
        this.heroCollectorService = heroCollectorService;
    }

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
        appUser.setHeroes(heroCollectorService.createHeroCollector());
        appUser.setItems(itemCollectorService.createItemCollector());
        appUserRepository.save(appUser);
        return appUserRepository.findByName(appUser.getName());
    }
}

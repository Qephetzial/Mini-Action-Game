package com.beta.MiniActionGame.service;

import com.beta.MiniActionGame.communicator.AppUserCommunicator;
import com.beta.MiniActionGame.model.AppUser;
import com.beta.MiniActionGame.model.entity.PlayableCharacter;
import com.beta.MiniActionGame.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AppUserService {
    private final AppUserRepository appUserRepository;
    private final PlayableCharacterService playableCharacterService;
    @Autowired
    public AppUserService(AppUserRepository appUserRepository, PlayableCharacterService playableCharacterService) {
        this.appUserRepository = appUserRepository;
        this.playableCharacterService = playableCharacterService;
    }

    public void saveAppUser (AppUser appUser) {
        appUser.setHeroes(playableCharacterService.createHeroes());
        appUserRepository.save(appUser);
    }

    public List<AppUser> getAppUsers() {
        return appUserRepository.findAll();
    }

    public AppUser getAppUserById(UUID id) {
        return appUserRepository.findById(id).orElse(null);
    }

    public AppUser updateAppUser (AppUserCommunicator appUserCommunicator) {
        AppUser appUser = getAppUserById(appUserCommunicator.getUuid());
        appUser.setGold(appUserCommunicator.getGold());
        List<PlayableCharacter> heroes = playableCharacterService.getHeroesById(appUserCommunicator.getHeroesId(), appUserCommunicator.getHeroesTypes());
        appUser.setHeroes(heroes);
        appUserRepository.save(appUser);
        return appUser;
    }

    public AppUser createAppUser(AppUser appUser) {
        appUser.setHeroes(playableCharacterService.createHeroes());
        appUserRepository.save(appUser);
        return appUserRepository.findByName(appUser.getName());
    }
}

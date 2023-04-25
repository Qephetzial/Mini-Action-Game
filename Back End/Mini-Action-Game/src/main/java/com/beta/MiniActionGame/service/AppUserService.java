package com.beta.MiniActionGame.service;

import com.beta.MiniActionGame.model.AppUser;
import com.beta.MiniActionGame.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {
    private final AppUserRepository appUserRepository;
    private final PlayableCharacterService playableCharacterService;
    @Autowired
    public AppUserService(AppUserRepository appUserRepository, PlayableCharacterService playableCharacterService) {
        this.appUserRepository = appUserRepository;
        this.playableCharacterService = playableCharacterService;
    }

    public void saveUser (AppUser appUser) {
        playableCharacterService.createHeroes();
        appUser.setHeroes(playableCharacterService.getHeroes());
        appUserRepository.save(appUser);
    }

    public List<AppUser> getUsers() {
        return appUserRepository.findAll();
    }
}

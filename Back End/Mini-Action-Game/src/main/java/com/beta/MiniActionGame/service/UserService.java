package com.beta.MiniActionGame.service;

import com.beta.MiniActionGame.model.AppUser;
import com.beta.MiniActionGame.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PlayableCharacterService playableCharacterService;
    @Autowired
    public UserService(UserRepository userRepository, PlayableCharacterService playableCharacterService) {
        this.userRepository = userRepository;
        this.playableCharacterService = playableCharacterService;
    }

    public void saveUser (AppUser appUser) {
        playableCharacterService.createHeroes();
        appUser.setHeroes(playableCharacterService.getHeroes());
        userRepository.save(appUser);
    }

    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }
}

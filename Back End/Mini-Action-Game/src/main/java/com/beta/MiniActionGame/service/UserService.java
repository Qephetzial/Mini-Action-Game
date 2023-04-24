package com.beta.MiniActionGame.service;

import com.beta.MiniActionGame.model.AppUser;
import com.beta.MiniActionGame.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser (AppUser appUser) {
        System.out.println("...");
        userRepository.save(appUser);
    }

    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }
}

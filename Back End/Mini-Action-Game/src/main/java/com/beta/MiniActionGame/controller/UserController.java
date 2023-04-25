package com.beta.MiniActionGame.controller;

import com.beta.MiniActionGame.model.AppUser;
import com.beta.MiniActionGame.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/user")
public class UserController {

    private final AppUserService appUserService;

    @Autowired
    public UserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @PostMapping("/save")
    public void saveUser(@RequestBody AppUser appUser){
        appUserService.saveUser(appUser);
    }

    @GetMapping("/get-users")
    public List<AppUser> getUsers(){
        return appUserService.getUsers();
    }
}

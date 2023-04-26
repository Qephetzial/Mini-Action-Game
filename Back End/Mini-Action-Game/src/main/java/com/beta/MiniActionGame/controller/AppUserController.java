package com.beta.MiniActionGame.controller;

import com.beta.MiniActionGame.communicator.AppUserCommunicator;
import com.beta.MiniActionGame.model.AppUser;
import com.beta.MiniActionGame.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/user")
public class AppUserController {

    private final AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @PostMapping("/save")
    public void saveAppUser(@RequestBody AppUser appUser){
        appUserService.saveAppUser(appUser);
    }

    @PostMapping("/update-appUser")
    public AppUser updateAppUser(@RequestBody AppUserCommunicator appUserCommunicator) {
        return appUserService.updateAppUser(appUserCommunicator);
    }

    @GetMapping("/get-appUsers")
    public List<AppUser> getAppUsers(){
        return appUserService.getAppUsers();
    }
}

package com.beta.MiniActionGame.controller;

import com.beta.MiniActionGame.model.AppUser;
import com.beta.MiniActionGame.service.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class AppUserController {

    private final AppUserService appUserService;

    //This route creates the app user after registering and returning it.
    @PostMapping("/create")
    public AppUser createAppUser(@RequestBody AppUser appUser) {
        return appUserService.createAppUser(appUser);
    }

    //This route returns the app users for login. It's a temporary solution before the proper log in system.
    @GetMapping("/get-appUsers")
    public List<AppUser> getAppUsers(){
        return appUserService.getAppUsers();
    }

    //This route updates any changes in app user
    @PostMapping("/update-appUser")
    public void updateAppUser(@RequestBody AppUser appUser) {
         appUserService.updateAppUser(appUser);
    }
}

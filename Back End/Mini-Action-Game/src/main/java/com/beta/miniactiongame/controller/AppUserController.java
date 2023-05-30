package com.beta.miniactiongame.controller;

import com.beta.miniactiongame.model.AppUser;
import com.beta.miniactiongame.service.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class AppUserController {

    private final AppUserService appUserService;

    //This route creates the app user after registering and returning it.
    @PostMapping
    public AppUser createAppUser(@RequestBody AppUser appUser) {
        return appUserService.createAppUser(appUser);
    }

    //This route returns the app users for login. It's a temporary solution before the proper log in system.
    @GetMapping
    public List<AppUser> getAppUsers(){
        return appUserService.getAppUsers();
    }

    //This route updates any changes in app user
    @PutMapping
    public void updateAppUser(@RequestBody AppUser appUser) {
         appUserService.updateAppUser(appUser);
    }

    @GetMapping("/{id}")
    public AppUser findAppUserById(@PathVariable UUID id) {return appUserService.findById(id);}
}

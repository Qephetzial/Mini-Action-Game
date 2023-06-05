package com.beta.miniactiongame.controller;

import com.beta.miniactiongame.model.AppUser;
import com.beta.miniactiongame.service.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class AppUserController {

    private final AppUserService appUserService;

    @GetMapping("/get-{name}")
    public AppUser getAppUser(@PathVariable String name) {
        return appUserService.getAppUser(name);
    }

    //This route updates any changes in app user
    @PutMapping
    public void updateAppUser(@RequestBody AppUser appUser) {
         appUserService.updateAppUser(appUser);
    }

}

package com.beta.MiniActionGame.controller;

import com.beta.MiniActionGame.model.AppUser;
import com.beta.MiniActionGame.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public void saveUser(@RequestBody AppUser appUser){
        userService.saveUser(appUser);
    }

    @GetMapping("/get-users")
    public List<AppUser> getUsers(){
        return userService.getUsers();
    }
}

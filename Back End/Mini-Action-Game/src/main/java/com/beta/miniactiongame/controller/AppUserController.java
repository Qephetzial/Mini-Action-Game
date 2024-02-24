package com.beta.miniactiongame.controller;

import com.beta.miniactiongame.model.AppUser;
import com.beta.miniactiongame.service.AppUserService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class AppUserController {

    private final AppUserService appUserService;

    @GetMapping("/get-{name}")
    public AppUser getAppUser(@PathVariable String name) {
        return appUserService.getAppUser(name);
    }

    @PutMapping("/{itemId}")
    public void sellItem(@PathVariable UUID itemId, @RequestBody AppUser appUser) {
        appUserService.updateAppUser(appUser);
    }

    @PutMapping
    public void updateAppUser(@RequestBody AppUser appUser) {
         appUserService.updateAppUser(appUser);
    }

    @PostMapping
    public void logOut(HttpServletRequest request,
                       HttpServletResponse response) {
        for (Cookie cookie:request.getCookies()) {
            cookie.setMaxAge(0);
            response.addCookie(cookie);

        }
    }
}
package com.beta.miniactiongame.controller;

import com.beta.miniactiongame.auth.JwtService;
import com.beta.miniactiongame.model.AppUser;
import com.beta.miniactiongame.service.AppUserService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class AppUserController {

    private final AppUserService appUserService;

    //This rout returns a user by name
    @GetMapping("/get-{name}")
    public AppUser getAppUser(@PathVariable String name) {
        return appUserService.getAppUser(name);
    }

    //This route updates any changes in app user
    @PutMapping
    public void updateAppUser(@RequestBody AppUser appUser) {
         appUserService.updateAppUser(appUser);
    }

    //This route delete the jwt token from cookies upon logging out
    @PostMapping
    public void logOut(HttpServletRequest request,
                       HttpServletResponse response) {
        for (Cookie cookie:request.getCookies()) {
            cookie.setMaxAge(0);
            response.addCookie(cookie);

        }
    }
}

package com.beta.miniactiongame.controller;

import com.beta.miniactiongame.auth.AuthenticationRequest;
import com.beta.miniactiongame.auth.AuthenticationResponse;
import com.beta.miniactiongame.auth.RegisterRequest;
import com.beta.miniactiongame.service.AuthService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/app-user/auth/")
@AllArgsConstructor
public class AuthController {

    private final AuthService authService;

    //This route create a user and a jwt token for later authentication saved by http-only cookie
    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request,
            HttpServletResponse response
    ) {
        AuthenticationResponse jwtToken = authService.register(request);
        Cookie cookie = new Cookie("appUser-token", jwtToken.getToken());
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        cookie.setMaxAge(60*60*24);

        response.addCookie(cookie);
        return ResponseEntity.ok(jwtToken);
    }

    //This route authenticate the user for log in and create a jwt token for later authentication saved by http-only cookie
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request,
            HttpServletResponse response
    ) {
        AuthenticationResponse jwtToken = authService.authenticate(request);
        Cookie cookie = new Cookie("appUser-token", jwtToken.getToken());
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        cookie.setMaxAge(60*60*24);
        response.addCookie(cookie);
        return ResponseEntity.ok(jwtToken);
    }
}

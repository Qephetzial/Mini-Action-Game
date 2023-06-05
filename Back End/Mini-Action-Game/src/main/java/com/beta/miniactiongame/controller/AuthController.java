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

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request,
            HttpServletResponse response
    ) {
        AuthenticationResponse jwtToken = authService.register(request);
        Cookie cookie = new Cookie("appUser-token", jwtToken.getToken());
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        response.addCookie(cookie);
        return ResponseEntity.ok(jwtToken);
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request,
            HttpServletResponse response
    ) {
        AuthenticationResponse jwtToken = authService.authenticate(request);
        Cookie cookie = new Cookie("appUser-token", jwtToken.getToken());
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        response.addCookie(cookie);
        return ResponseEntity.ok(jwtToken);
    }
}

package com.beta.miniactiongame.service;

import com.beta.miniactiongame.auth.*;
import com.beta.miniactiongame.model.AppUser;
import com.beta.miniactiongame.model.Role;
import com.beta.miniactiongame.repository.AppUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class AuthService {

    private final AppUserRepository appUserRepository;
    private final PasswordEncoder passwordEncoder;
    private final HeroDataWrapperService heroDataWrapperService;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest request) {
        var appUser = AppUser.builder()
                .name(request.getName())
                .password(passwordEncoder.encode(request.getPassword()))
                .coin(100000)
                .heroes(heroDataWrapperService.getUserHeroData())
                .armors(new ArrayList<>())
                .weapons(new ArrayList<>())
                .role(Role.USER)
                .build();
        appUserRepository.save(appUser);
        var jwtToken = jwtService.generateJwtToken(appUser);
        return AuthenticationResponse.builder().token(jwtToken).build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate( new UsernamePasswordAuthenticationToken(request.getName(), request.getPassword()));
        var appUser = appUserRepository.findByName(request.getName()).orElseThrow();
        var jwtToken = jwtService.generateJwtToken(appUser);
        return AuthenticationResponse.builder().token(jwtToken).build();
    }
}
package com.beta.MiniActionGame.controller;

import com.beta.MiniActionGame.communicator.PlayableCharacterCommunicator;
import com.beta.MiniActionGame.service.PlayableCharacterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hero")
public class PlayableCharacterController {
    private final PlayableCharacterService playableCharacterService;

    public PlayableCharacterController(PlayableCharacterService playableCharacterService) {
        this.playableCharacterService = playableCharacterService;
    }

    @PostMapping("/update-heroes")
    public void updateHeroes(@RequestBody PlayableCharacterCommunicator playableCharacterCommunicator) {
        playableCharacterService.updateHeroes(playableCharacterCommunicator.getUuids(), playableCharacterCommunicator.getConditions(), playableCharacterCommunicator.getTypes());
    }
}

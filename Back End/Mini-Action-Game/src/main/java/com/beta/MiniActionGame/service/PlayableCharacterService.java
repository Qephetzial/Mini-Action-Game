package com.beta.MiniActionGame.service;

import com.beta.MiniActionGame.factory.ArmorFactory;
import com.beta.MiniActionGame.repository.playableCharacter.DemonRepository;
import com.beta.MiniActionGame.repository.playableCharacter.FighterRepository;
import com.beta.MiniActionGame.repository.playableCharacter.MageRepository;
import com.beta.MiniActionGame.repository.playableCharacter.RangerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayableCharacterService {
    private final FighterRepository fighterRepository;
    private final RangerRepository rangerRepository;
    private final MageRepository mageRepository;
    private final DemonRepository demonRepository;

    @Autowired
    public PlayableCharacterService(FighterRepository fighterRepository, RangerRepository rangerRepository, MageRepository mageRepository, DemonRepository demonRepository, ArmorFactory armorService) {
        this.fighterRepository = fighterRepository;
        this.rangerRepository = rangerRepository;
        this.mageRepository = mageRepository;
        this.demonRepository = demonRepository;
    }
}

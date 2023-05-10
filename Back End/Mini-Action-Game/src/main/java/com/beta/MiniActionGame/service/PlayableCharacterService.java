package com.beta.MiniActionGame.service;

import com.beta.MiniActionGame.factory.ArmorFactory;
import com.beta.MiniActionGame.model.entity.*;
import com.beta.MiniActionGame.repository.playableCharacter.DemonRepository;
import com.beta.MiniActionGame.repository.playableCharacter.FighterRepository;
import com.beta.MiniActionGame.repository.playableCharacter.MageRepository;
import com.beta.MiniActionGame.repository.playableCharacter.RangerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
    
    public Fighter getFighterById(UUID id) {
        return fighterRepository.findById(id).orElse(null);
    }

    public void updateFighter(Fighter fighter) {
        fighterRepository.save(fighter);
    }

    public Ranger getRangerById(UUID id) {
        return rangerRepository.findById(id).orElse(null);
    }

    public void updateRanger(Ranger ranger) {
        rangerRepository.save(ranger);
    }

    public Mage getMageById(UUID id) {
        return mageRepository.findById(id).orElse(null);
    }

    public void updateMage(Mage mage) {
        mageRepository.save(mage);
    }

    public Demon getDemonById(UUID id) {
        return demonRepository.findById(id).orElse(null);
    }

    public void updateDemon(Demon demon) {
        demonRepository.save(demon);
    }

    public List<PlayableCharacter> getHeroesById(List<UUID> uuids, List<String> types){
        List<PlayableCharacter> heroes = new ArrayList<>();
        for (int i = 0; i < uuids.size(); i++) {
            switch (types.get(i)) {
                case "Fighter" -> {
                    heroes.add(getFighterById(uuids.get(i)));
                }
                case "Ranger" -> {
                    heroes.add(getRangerById(uuids.get(i)));
                }
                case "Mage" -> {
                    heroes.add(getMageById(uuids.get(i)));
                }
                case "Demon" -> {
                    heroes.add(getDemonById(uuids.get(i)));
                }
            }
        }
        return heroes;
    }
}

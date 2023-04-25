package com.beta.MiniActionGame.service;

import com.beta.MiniActionGame.model.entity.*;
import com.beta.MiniActionGame.repository.playableCharacter.FighterRepository;
import com.beta.MiniActionGame.repository.playableCharacter.MageRepository;
import com.beta.MiniActionGame.repository.playableCharacter.RangerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayableCharacterService {
    private final FighterRepository fighterRepository;
    private final RangerRepository rangerRepository;
    private final MageRepository mageRepository;

    @Autowired
    public PlayableCharacterService(FighterRepository fighterRepository, RangerRepository rangerRepository, MageRepository mageRepository) {
        this.fighterRepository = fighterRepository;
        this.rangerRepository = rangerRepository;
        this.mageRepository = mageRepository;
    }

    private Fighter createFighter() {
        Fighter fighter = new Fighter();
        fighter.setName("Fighter");
        fighter.setHealth(1000);
        fighter.setAlignment(Alignment.GOOD);
        fighter.setStrength(80);
        fighter.setDefence(40);
        fighter.setMovementSpeed(1);
        fighter.setValue(0);
        fighter.setCondition("SELECTED");
        fighter.setPng("fighter.png");
        fighter.setGif("fighter.gif");
        return fighter;
    }

    private Ranger createRanger() {
        Ranger ranger = new Ranger();
        ranger.setName("Ranger");
        ranger.setHealth(800);
        ranger.setAlignment(Alignment.GOOD);
        ranger.setStrength(100);
        ranger.setDefence(30);
        ranger.setMovementSpeed(2);
        ranger.setValue(1000);
        ranger.setCondition("BUY");
        ranger.setPng("ranger.png");
        ranger.setGif("ranger.gif");
        return ranger;
    }

    private Mage createMage() {
        Mage mage = new Mage();
        mage.setName("Mage");
        mage.setHealth(700);
        mage.setAlignment(Alignment.GOOD);
        mage.setStrength(130);
        mage.setDefence(20);
        mage.setMovementSpeed(1);
        mage.setValue(4000);
        mage.setCondition("BUY");
        mage.setPng("mage.png");
        mage.setGif("mage.gif");
        return mage;
    }

    public void createHeroes() {
        fighterRepository.save(createFighter());
        rangerRepository.save(createRanger());
        mageRepository.save(createMage());
    }

    public List<PlayableCharacter> getHeroes() {
        List<PlayableCharacter> heroes = new ArrayList<>();
        heroes.add(fighterRepository.findAll().get(0));
        heroes.add(rangerRepository.findAll().get(0));
        heroes.add(mageRepository.findAll().get(0));
        return heroes;
    }
}

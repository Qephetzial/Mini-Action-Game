package com.beta.MiniActionGame.service;

import com.beta.MiniActionGame.communicator.PlayableCharacterCommunicator;
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
    public PlayableCharacterService(FighterRepository fighterRepository, RangerRepository rangerRepository, MageRepository mageRepository, DemonRepository demonRepository) {
        this.fighterRepository = fighterRepository;
        this.rangerRepository = rangerRepository;
        this.mageRepository = mageRepository;
        this.demonRepository = demonRepository;
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

    private Demon createDemon() {
        Demon demon = new Demon();
        demon.setName("Demon");
        demon.setHealth(1500);
        demon.setAlignment(Alignment.GOOD);
        demon.setStrength(150);
        demon.setDefence(50);
        demon.setMovementSpeed(3);
        demon.setValue(10000);
        demon.setCondition("BUY");
        demon.setPng("demon.png");
        demon.setGif("demon.gif");
        return demon;
    }

    public List<PlayableCharacter> createHeroes() {
        Fighter fighter = createFighter();
        Ranger ranger = createRanger();
        Mage mage = createMage();
        Demon demon = createDemon();
        updateFighter(fighter);
        updateRanger(ranger);
        updateMage(mage);
        updateDemon(demon);
        List<PlayableCharacter> heroes = new ArrayList<>();
        heroes.add(fighter);
        heroes.add(ranger);
        heroes.add(demon);
        heroes.add(mage);
        return heroes;
    }

    public void updateHeroes(PlayableCharacterCommunicator playableCharacterCommunicator){
        fighterRepository.save(playableCharacterCommunicator.getFighter());
        rangerRepository.save(playableCharacterCommunicator.getRanger());
        mageRepository.save(playableCharacterCommunicator.getMage());
        demonRepository.save(playableCharacterCommunicator.getDemon());
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

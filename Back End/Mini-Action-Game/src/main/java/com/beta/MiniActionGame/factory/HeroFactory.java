package com.beta.MiniActionGame.factory;

import com.beta.MiniActionGame.model.creature.*;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
//This class contains a blueprint for every playable characters.
public class HeroFactory {

    //Blueprint of a fighter hero.
    public Hero createFighter() {
        Hero fighter = new Hero();
        fighter.setName(CreatureType.FIGHTER);
        fighter.setHealth(1000);
        fighter.setAlignment(Alignment.GOOD);
        fighter.setStrength(80);
        fighter.setDefence(40);
        fighter.setMovementSpeed(1);
        fighter.setValue(0);
        fighter.setObtained(true);
        fighter.setSelected(true);
        fighter.setPng("fighter.png");
        fighter.setGif("fighter.gif");
        return fighter;
    }

    //Blueprint of a ranger hero.
    public Hero createRanger() {
        Hero ranger = new Hero();
        ranger.setName(CreatureType.RANGER);
        ranger.setHealth(800);
        ranger.setAlignment(Alignment.GOOD);
        ranger.setStrength(100);
        ranger.setDefence(30);
        ranger.setMovementSpeed(2);
        ranger.setValue(1000);
        ranger.setObtained(false);
        ranger.setSelected(false);
        ranger.setPng("ranger.png");
        ranger.setGif("ranger.gif");
        return ranger;
    }

    //Blueprint of a mage hero.
    public Hero createMage() {
        Hero mage = new Hero();
        mage.setName(CreatureType.MAGE);
        mage.setHealth(700);
        mage.setAlignment(Alignment.GOOD);
        mage.setStrength(130);
        mage.setDefence(20);
        mage.setMovementSpeed(1);
        mage.setValue(4000);
        mage.setObtained(false);
        mage.setSelected(false);
        mage.setPng("mage.png");
        mage.setGif("mage.gif");
        return mage;
    }

    //Blueprint of a demon hero.
    public Hero createDemon() {
        Hero demon = new Hero();
        demon.setName(CreatureType.DEMON);
        demon.setHealth(1500);
        demon.setAlignment(Alignment.GOOD);
        demon.setStrength(150);
        demon.setDefence(50);
        demon.setMovementSpeed(3);
        demon.setValue(10000);
        demon.setObtained(false);
        demon.setSelected(false);
        demon.setPng("demon.png");
        demon.setGif("demon.gif");
        return demon;
    }
}


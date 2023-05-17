package com.beta.MiniActionGame.factory;

import com.beta.MiniActionGame.model.entity.*;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class HeroFactory {

    public Hero createFighter() {
        Hero fighter = new Hero();
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

    public Hero createRanger() {
        Hero ranger = new Hero();
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

    public Hero createMage() {
        Hero mage = new Hero();
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

    public Hero createDemon() {
        Hero demon = new Hero();
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
}


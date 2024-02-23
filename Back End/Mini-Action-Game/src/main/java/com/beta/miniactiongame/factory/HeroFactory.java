package com.beta.miniactiongame.factory;

import com.beta.miniactiongame.model.creature.Alignment;
import com.beta.miniactiongame.model.creature.CreatureType;
import com.beta.miniactiongame.model.creature.Hero;
import com.beta.miniactiongame.repository.hero.HeroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HeroFactory {

    private final HeroRepository heroRepository;

    //Blueprint of a fighter hero.
    public Hero getFighter() {
        Hero hero = heroRepository.findHeroByName(CreatureType.FIGHTER).orElse(null);
        if (hero == null) {
            hero = new Hero();
            hero.setName(CreatureType.FIGHTER);
            hero.setHealth(1000);
            hero.setAlignment(Alignment.GOOD);
            hero.setStrength(80);
            hero.setDefence(40);
            hero.setMovementSpeed(1);
            hero.setValue(0);
            hero.setObtained(true);
            hero.setSelected(true);
            hero.setPng("heroes/fighter.png");
            hero.setGif("heroes/fighter.gif");
            heroRepository.save(hero);
        }
        return hero;
    }

    //Blueprint of a ranger hero.
    public Hero getRanger() {
        Hero hero = heroRepository.findHeroByName(CreatureType.RANGER).orElse(null);
        if (hero == null) {
            hero = new Hero();
            hero.setName(CreatureType.RANGER);
            hero.setHealth(800);
            hero.setAlignment(Alignment.GOOD);
            hero.setStrength(100);
            hero.setDefence(30);
            hero.setMovementSpeed(2);
            hero.setValue(1000);
            hero.setObtained(false);
            hero.setSelected(false);
            hero.setPng("heroes/ranger.png");
            hero.setGif("heroes/ranger.gif");
            heroRepository.save(hero);
        }
        return hero;
    }

    //Blueprint of a mage hero.
    public Hero getMage() {
        Hero hero = heroRepository.findHeroByName(CreatureType.MAGE).orElse(null);
        if (hero == null) {
            hero = new Hero();
            hero.setName(CreatureType.MAGE);
            hero.setHealth(700);
            hero.setAlignment(Alignment.GOOD);
            hero.setStrength(130);
            hero.setDefence(20);
            hero.setMovementSpeed(1);
            hero.setValue(4000);
            hero.setObtained(false);
            hero.setSelected(false);
            hero.setPng("heroes/mage.png");
            hero.setGif("heroes/mage.gif");
            heroRepository.save(hero);
        }
        return hero;
    }

    //Blueprint of a demon hero.
    public Hero getDemon() {
        Hero hero = heroRepository.findHeroByName(CreatureType.DEMON).orElse(null);
        if (hero == null) {
            hero = new Hero();
            hero.setName(CreatureType.DEMON);
            hero.setHealth(1500);
            hero.setAlignment(Alignment.GOOD);
            hero.setStrength(150);
            hero.setDefence(50);
            hero.setMovementSpeed(3);
            hero.setValue(10000);
            hero.setObtained(false);
            hero.setSelected(false);
            hero.setPng("heroes/demon.png");
            hero.setGif("heroes/demon.gif");
            heroRepository.save(hero);
        }
        return hero;
    }
}


package com.beta.miniactiongame.service;

import com.beta.miniactiongame.factory.HeroFactory;
import com.beta.miniactiongame.model.creature.Hero;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.beta.miniactiongame.factory.ArmorFactory.commonArmorOne;
import static com.beta.miniactiongame.factory.WeaponFactory.commonBowOne;
import static com.beta.miniactiongame.factory.WeaponFactory.commonStaffOne;
import static com.beta.miniactiongame.factory.WeaponFactory.commonSwordOne;

@Service
@AllArgsConstructor
public class HeroService {
    private final HeroFactory heroFactory;

    //This method creates heroes and return them in a list
    public List<Hero> createHeroes() {
        List<Hero> heroes = new ArrayList<>();
        Hero fighter = heroFactory.createFighter();
        fighter.setArmor(commonArmorOne);
        fighter.setWeapon(commonSwordOne);
        heroes.add(fighter);
        Hero ranger = heroFactory.createRanger();
        ranger.setArmor(commonArmorOne);
        ranger.setWeapon(commonBowOne);
        heroes.add(ranger);
        Hero demon = heroFactory.createDemon();
        demon.setArmor(commonArmorOne);
        demon.setWeapon(commonStaffOne);
        heroes.add(demon);
        Hero mage = heroFactory.createMage();
        mage.setArmor(commonArmorOne);
        mage.setWeapon(commonStaffOne);
        heroes.add(mage);
        return heroes;
    }
}

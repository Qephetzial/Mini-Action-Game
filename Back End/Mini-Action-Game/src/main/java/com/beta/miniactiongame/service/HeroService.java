package com.beta.miniactiongame.service;

import com.beta.miniactiongame.factory.ArmorFactory;
import com.beta.miniactiongame.factory.HeroFactory;
import com.beta.miniactiongame.factory.WeaponFactory;
import com.beta.miniactiongame.model.creature.Hero;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class HeroService {
    private final HeroFactory heroFactory;
    private final ArmorFactory armorFactory;
    private final WeaponFactory weaponFactory;

    //This method creates heroes and return them in a list
    public List<Hero> createHeroes() {
        List<Hero> heroes = new ArrayList<>();
        Hero fighter = heroFactory.createFighter();
        fighter.setArmor(armorFactory.createCommonArmorOne());
        fighter.setWeapon(weaponFactory.createCommonSwordOne());
        heroes.add(fighter);
        Hero ranger = heroFactory.createRanger();
        ranger.setArmor(armorFactory.createCommonArmorOne());
        ranger.setWeapon(weaponFactory.createCommonBowOne());
        heroes.add(ranger);
        Hero demon = heroFactory.createDemon();
        demon.setArmor(armorFactory.createCommonArmorOne());
        demon.setWeapon(weaponFactory.createCommonStaffOne());
        heroes.add(demon);
        Hero mage = heroFactory.createMage();
        mage.setArmor(armorFactory.createCommonArmorOne());
        mage.setWeapon(weaponFactory.createCommonStaffOne());
        heroes.add(mage);
        return heroes;
    }
}

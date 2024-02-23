package com.beta.miniactiongame.service;

import com.beta.miniactiongame.factory.ArmorFactory;
import com.beta.miniactiongame.factory.HeroFactory;
import com.beta.miniactiongame.factory.WeaponFactory;
import com.beta.miniactiongame.model.creature.CreatureType;
import com.beta.miniactiongame.model.creature.Hero;
import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.repository.hero.HeroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class HeroService {
    private final HeroRepository heroRepository;
    private final HeroFactory heroFactory;
    private final ArmorFactory armorFactory;
    private final WeaponFactory weaponFactory;

    public void saveHero(Hero hero) {
        heroRepository.save(hero);
    }

    public Hero getHeroByName(CreatureType name) {
        return heroRepository.findByName(name).orElse(null);
    }

    //This method creates heroes and return them in a list
    public List<Hero> createHeroes() {
        List<Hero> heroes = new ArrayList<>();
        Hero fighter = heroFactory.getFighter();
        fighter.setArmor(armorFactory.getCommonArmorOne());
        fighter.setWeapon(weaponFactory.getCommonSwordOne());
        heroes.add(fighter);
        Hero ranger = heroFactory.getRanger();
        ranger.setArmor(armorFactory.getCommonArmorOne());
        ranger.setWeapon(weaponFactory.getCommonBowOne());
        heroes.add(ranger);
        Hero demon = heroFactory.getDemon();
        demon.setArmor(armorFactory.getCommonArmorOne());
        demon.setWeapon(weaponFactory.getCommonStaffOne());
        heroes.add(demon);
        Hero mage = heroFactory.getMage();
        mage.setArmor(armorFactory.getCommonArmorOne());
        mage.setWeapon(weaponFactory.getRareStaffOne());
        heroes.add(mage);
        return heroes;
    }
}

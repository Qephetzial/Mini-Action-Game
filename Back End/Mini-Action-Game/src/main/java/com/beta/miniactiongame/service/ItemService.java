package com.beta.miniactiongame.service;

import com.beta.miniactiongame.model.creature.Hero;
import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.Spell;
import com.beta.miniactiongame.model.item.Weapon;
import com.beta.miniactiongame.repository.hero.HeroRepository;
import com.beta.miniactiongame.repository.item.ArmorRepository;
import com.beta.miniactiongame.repository.item.SpellRepository;
import com.beta.miniactiongame.repository.item.WeaponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ArmorRepository armorRepository;
    private final WeaponRepository weaponRepository;
    private final SpellRepository spellRepository;
    private final HeroRepository heroRepository;

    public void saveArmor(Armor armor) {
        armorRepository.save(armor);
    }

    public void saveWeapon(Weapon weapon) {
        weaponRepository.save(weapon);
    }

    public void saveSpell(Spell spell) {
        spellRepository.save(spell);
    }

    public void saveHero(Hero hero) {
        heroRepository.save(hero);
    }

    public Armor getArmorByName(String name) {
        return armorRepository.findByName(name).orElse(null);
    }

    public Weapon getWeaponByName(String name) {
        return weaponRepository.findByName(name).orElse(null);
    }

    public Spell getSpellByName(String name) {
        return spellRepository.findByName(name).orElse(null);
    }

    public Hero getHeroByName(String name) {
        return heroRepository.findByName(name).orElse(null);
    }
}

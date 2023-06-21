package com.beta.miniactiongame.service;

import com.beta.miniactiongame.factory.ArmorFactory;
import com.beta.miniactiongame.factory.HeroFactory;
import com.beta.miniactiongame.factory.WeaponFactory;
import com.beta.miniactiongame.model.creature.Hero;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


class HeroServiceTest {

    private final HeroService heroService = new HeroService(new HeroFactory(), new ArmorFactory(), new WeaponFactory());

    @Test
    void createHeroes() {
        List<Hero> heroes = heroService.createHeroes();
        assertNotNull(heroes);
        assertEquals(4, heroes.size());
        assertNotNull(heroes.get(0).getArmor());
        assertNotNull(heroes.get(0).getWeapon());
        assertNotNull(heroes.get(1).getArmor());
        assertNotNull(heroes.get(1).getWeapon());
        assertNotNull(heroes.get(2).getArmor());
        assertNotNull(heroes.get(2).getWeapon());
        assertNotNull(heroes.get(3).getArmor());
        assertNotNull(heroes.get(3).getWeapon());
    }
}
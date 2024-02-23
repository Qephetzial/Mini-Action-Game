package com.beta.miniactiongame.service;

import com.beta.miniactiongame.model.creature.CreatureType;
import com.beta.miniactiongame.model.creature.Hero;
import com.beta.miniactiongame.repository.hero.HeroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class HeroService {
    private final HeroRepository heroRepository;

    public void saveHero(Hero hero) {
        heroRepository.save(hero);
    }

    public Hero getHeroByName(CreatureType name) {
        return heroRepository.findByName(name).orElse(null);
    }
}
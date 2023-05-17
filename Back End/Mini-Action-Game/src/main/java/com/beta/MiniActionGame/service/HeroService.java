package com.beta.MiniActionGame.service;

import com.beta.MiniActionGame.factory.HeroFactory;
import com.beta.MiniActionGame.model.entity.Hero;
import com.beta.MiniActionGame.repository.hero.HeroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class HeroService {
    private final HeroRepository heroRepository;
    private final HeroFactory heroFactory;


    public List<Hero> createHeroes() {
        List<Hero> heroes = new ArrayList<>();
        heroes.add(heroFactory.createFighter());
        heroes.add(heroFactory.createRanger());
        heroes.add(heroFactory.createMage());
        heroes.add(heroFactory.createDemon());
        return heroes;
    }
}

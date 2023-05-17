package com.beta.MiniActionGame.service;

import com.beta.MiniActionGame.factory.HeroFactory;
import com.beta.MiniActionGame.model.creature.Hero;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class HeroService {
    private final HeroFactory heroFactory;


    public List<Hero> createHeroes() {
        List<Hero> heroes = new ArrayList<>();
        heroes.add(heroFactory.createFighter());
        heroes.add(heroFactory.createRanger());
        heroes.add(heroFactory.createDemon());
        heroes.add(heroFactory.createMage());
        return heroes;
    }
}

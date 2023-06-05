package com.beta.miniactiongame.service;

import com.beta.miniactiongame.factory.HeroFactory;
import com.beta.miniactiongame.model.creature.Hero;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class HeroService {
    private final HeroFactory heroFactory;

    //This method creates heroes and return them in a list
    public List<Hero> createHeroes() {
        List<Hero> heroes = new ArrayList<>();
        heroes.add(heroFactory.createFighter());
        heroes.add(heroFactory.createRanger());
        heroes.add(heroFactory.createDemon());
        heroes.add(heroFactory.createMage());
        return heroes;
    }
}

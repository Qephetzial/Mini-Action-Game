package com.beta.MiniActionGame.service;

import com.beta.MiniActionGame.factory.HeroFactory;
import com.beta.MiniActionGame.model.collector.HeroCollector;
import org.springframework.stereotype.Service;

@Service
public class HeroCollectorService {
    private final HeroFactory heroFactory;

    public HeroCollectorService(HeroFactory heroFactory) {
        this.heroFactory = heroFactory;
    }

    public HeroCollector createHeroCollector() {
        HeroCollector heroCollector = new HeroCollector();
        heroCollector.setFighter(heroFactory.createFighter());
        heroCollector.setRanger(heroFactory.createRanger());
        heroCollector.setMage(heroFactory.createMage());
        heroCollector.setDemon(heroFactory.createDemon());
        return heroCollector;
    }
}

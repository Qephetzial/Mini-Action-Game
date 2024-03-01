package com.beta.miniactiongame.repository.hero;

import com.beta.miniactiongame.model.creature.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface HeroRepository extends JpaRepository<Hero, UUID> {
    Optional<Hero> findByName(String name);
}
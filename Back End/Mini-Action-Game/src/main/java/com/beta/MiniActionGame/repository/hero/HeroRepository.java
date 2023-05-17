package com.beta.MiniActionGame.repository.hero;

import com.beta.MiniActionGame.model.creature.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface HeroRepository extends JpaRepository<Hero, UUID> {
}

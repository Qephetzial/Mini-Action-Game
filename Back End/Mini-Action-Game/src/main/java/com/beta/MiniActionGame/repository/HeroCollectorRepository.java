package com.beta.MiniActionGame.repository;

import com.beta.MiniActionGame.model.collector.HeroCollector;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HeroCollectorRepository extends JpaRepository<HeroCollector, UUID> {
}

package com.beta.MiniActionGame.repository;

import com.beta.MiniActionGame.model.collector.ItemCollector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ItemCollectorRepository extends JpaRepository<ItemCollector, UUID> {
}

package com.beta.miniactiongame.repository.item;

import com.beta.miniactiongame.model.item.Armor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ArmorRepository extends JpaRepository<Armor, UUID> {
    Optional<Armor> findByName(String name);
}
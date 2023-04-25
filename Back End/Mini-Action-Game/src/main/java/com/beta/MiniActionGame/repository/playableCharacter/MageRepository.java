package com.beta.MiniActionGame.repository.playableCharacter;

import com.beta.MiniActionGame.model.entity.Mage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MageRepository extends JpaRepository<Mage, UUID> {
}

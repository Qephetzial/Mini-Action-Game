package com.beta.MiniActionGame.repository.playableCharacter;

import com.beta.MiniActionGame.model.entity.Demon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DemonRepository extends JpaRepository<Demon, UUID> {
}

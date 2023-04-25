package com.beta.MiniActionGame.repository.playableCharacter;

import com.beta.MiniActionGame.model.entity.Ranger;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RangerRepository extends JpaRepository<Ranger, UUID> {
}

package com.beta.MiniActionGame.repository.playableCharacter;

import com.beta.MiniActionGame.model.entity.Fighter;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface FighterRepository extends JpaRepository<Fighter, UUID> {
}

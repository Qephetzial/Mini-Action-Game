package com.beta.MiniActionGame.repository.playableCharacter;

import com.beta.MiniActionGame.model.entity.Ranger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RangerRepository extends JpaRepository<Ranger, UUID> {
}

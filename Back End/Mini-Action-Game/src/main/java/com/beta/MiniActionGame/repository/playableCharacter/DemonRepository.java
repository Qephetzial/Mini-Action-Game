package com.beta.MiniActionGame.repository.playableCharacter;

import com.beta.MiniActionGame.model.entity.Demon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DemonRepository extends JpaRepository<Demon, UUID> {
}

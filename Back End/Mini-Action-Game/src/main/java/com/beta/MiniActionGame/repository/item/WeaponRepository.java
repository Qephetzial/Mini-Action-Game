package com.beta.MiniActionGame.repository.item;

import com.beta.MiniActionGame.model.item.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, UUID> {
}

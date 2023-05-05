package com.beta.MiniActionGame.repository.item;

import com.beta.MiniActionGame.model.item.armor.RareAndEpicArmor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RareAndEpicArmorRepository extends JpaRepository<RareAndEpicArmor, UUID> {
}

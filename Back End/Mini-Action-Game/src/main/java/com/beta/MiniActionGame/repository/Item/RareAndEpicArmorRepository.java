package com.beta.MiniActionGame.repository.Item;

import com.beta.MiniActionGame.model.item.RareAndEpicArmor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RareAndEpicArmorRepository extends JpaRepository<RareAndEpicArmor, UUID> {
}

package com.beta.MiniActionGame.repository.item;

import com.beta.MiniActionGame.model.item.armor.LegendaryArmor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LegendaryArmorRepository extends JpaRepository<LegendaryArmor, UUID> {
}

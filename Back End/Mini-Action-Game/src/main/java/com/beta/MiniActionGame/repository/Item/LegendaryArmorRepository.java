package com.beta.MiniActionGame.repository.Item;

import com.beta.MiniActionGame.model.item.LegendaryArmor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LegendaryArmorRepository extends JpaRepository<LegendaryArmor, UUID> {
}

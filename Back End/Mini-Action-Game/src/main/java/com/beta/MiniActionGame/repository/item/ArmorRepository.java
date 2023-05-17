package com.beta.MiniActionGame.repository.item;


import com.beta.MiniActionGame.model.item.Armor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ArmorRepository extends JpaRepository<Armor, UUID> {
}

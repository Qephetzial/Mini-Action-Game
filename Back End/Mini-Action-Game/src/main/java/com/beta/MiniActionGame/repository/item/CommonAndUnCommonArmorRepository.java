package com.beta.MiniActionGame.repository.item;


import com.beta.MiniActionGame.model.item.armor.CommonAndUnCommonArmor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CommonAndUnCommonArmorRepository extends JpaRepository<CommonAndUnCommonArmor, UUID> {
}

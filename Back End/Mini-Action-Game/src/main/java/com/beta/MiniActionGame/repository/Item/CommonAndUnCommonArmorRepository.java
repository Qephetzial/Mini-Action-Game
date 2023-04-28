package com.beta.MiniActionGame.repository.Item;


import com.beta.MiniActionGame.model.item.CommonAndUnCommonArmor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CommonAndUnCommonArmorRepository extends JpaRepository<CommonAndUnCommonArmor, UUID> {
}

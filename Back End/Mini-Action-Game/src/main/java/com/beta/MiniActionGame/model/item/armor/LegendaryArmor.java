package com.beta.MiniActionGame.model.item.armor;

import com.beta.MiniActionGame.model.item.*;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class LegendaryArmor extends Items {
    private DamageType resistance;
    private DamageType secondaryResistance;
    private int movementSpeed;
}

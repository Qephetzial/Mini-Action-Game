package com.beta.MiniActionGame.model.item.armor;

import com.beta.MiniActionGame.model.item.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RareAndEpicArmor extends Armor {
    private DamageType resistance;
}

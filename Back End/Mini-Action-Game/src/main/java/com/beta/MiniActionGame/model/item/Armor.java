package com.beta.MiniActionGame.model.item;

import com.beta.MiniActionGame.model.item.DamageType;
import com.beta.MiniActionGame.model.item.Items;
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
public class Armor extends Items {
    private int health;
    private int defence;
    private DamageType resistance;
    private DamageType secondaryResistance;
    private int movementSpeed;
}

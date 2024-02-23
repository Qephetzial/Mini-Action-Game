package com.beta.miniactiongame.model.item;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Armor extends Item {

    private int health;
    private int defence;
    private DamageType resistance;
    private DamageType secondaryResistance;
    private int movementSpeed;
}
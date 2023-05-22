package com.beta.miniactiongame.model.item;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
//This class for the armors what can be equipped to the hero and increase the survival chance.
public class Armor extends Items {

    //This field determines how much bonus hit points the armor gives.
    private int health;

    //This field determines how much bonus defence the armor gives.
    private int defence;

    //This field determines from which type of damage receive less damage.
    private DamageType resistance;

    //This field determines from which type of damage receive less damage.
    private DamageType secondaryResistance;

    //This field determines how much bonus movement speed the armor gives.
    private int movementSpeed;
}

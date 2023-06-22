package com.beta.miniactiongame.model.item;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
//This class for the weapons what can be equipped to the hero and increase the damage output.
public class Weapon extends Item {

    //This field determines how much bonus damage the weapon gives.
    private int damage;

    //This field determines what type of damage it deals.
    private DamageType damageType;

    //This field determines how much chance the weapon has to deal extra damage.
    private int critChance;

    //This field determines how much extra damage it deals when crit is applied.
    private int critDamage;

    //This field determines how fast the hero can attack with this weapon.
    private int attackSpeed;

    //This field determines if the weapon deals damage to a single target or deals damage in the area.
    private Boolean aoeDamage;
}

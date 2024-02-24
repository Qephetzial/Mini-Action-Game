package com.beta.miniactiongame.model.item;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Weapon extends Item {

    private int damage;
    private DamageType damageType;
    private int criticalChance;
    private int criticalDamage;
    private int attackSpeed;
    private AOEDamageType aoeDamage;
    //TODO: add Spell class
}
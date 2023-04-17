package com.beta.MiniActionGame.model.item;

import com.beta.MiniActionGame.model.map.Cell;

public class Ammo {
    //private final Cell destination;
    private final Integer damage;
    private final Integer radius;
    private final DamageType damageType;

    public Ammo(/*Cell destination, */Integer damage, Integer radius, DamageType damageType) {
        //this.destination = destination;
        this.damage = damage;
        this.radius = radius;
        this.damageType = damageType;
    }
}

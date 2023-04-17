package com.beta.MiniActionGame.model.entity;

public class CanAttack extends Entity {
    private final int strength;
    private final int defence;

    public CanAttack(String name, int health, Alignment alignment, int strength, int defence) {
        super(name, health, alignment);
        this.strength = strength;
        this.defence = defence;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefence() {
        return defence;
    }
}



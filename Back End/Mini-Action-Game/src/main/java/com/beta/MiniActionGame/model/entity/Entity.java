package com.beta.MiniActionGame.model.entity;

public abstract class Entity {
    private final String name;
    private int health;
    private final Alignment alignment;

    public Entity(String name, int health, Alignment alignment) {
        this.name = name;
        this.health = health;
        this.alignment = alignment;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    protected void receiveDamage(int damage) {
        this.health -= damage;
    }
}

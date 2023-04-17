package com.beta.MiniActionGame.model.item;

public class Armor extends Item {
    private final Integer health;
    private final Integer defence;
    private final Integer movementSpeed;
    private final DamageType resistance;

    public Armor(String name, Rarity rarity, String imageLink, ItemType itemType, Integer health, Integer defence, Integer movementSpeed, DamageType resistance) {
        super(name, rarity, imageLink, itemType);
        this.health = health;
        this.defence = defence;
        this.movementSpeed = movementSpeed;
        this.resistance = resistance;
    }

    public Integer getHealth() {
        return health;
    }

    public Integer getDefence() {
        return defence;
    }

    public Integer getMovementSpeed() {
        return movementSpeed;
    }

    public DamageType getResistance() {
        return resistance;
    }
}

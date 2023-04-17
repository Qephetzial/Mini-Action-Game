package com.beta.MiniActionGame.model.entity;

import com.beta.MiniActionGame.model.item.Armor;
import com.beta.MiniActionGame.model.item.DamageType;


public abstract class PlayableCharacter extends CanAttack implements Movement {
    private Armor armor;
    private final int movementSpeed;
    private final int value;
    private String condition;

    public PlayableCharacter(String name, int health, Alignment alignment, int strength, int defence, Armor armor, int movementSpeed, int value, String condition) {
        super(name, health+armor.getHealth(), alignment, strength, defence);
        this.armor = armor;
        this.movementSpeed = movementSpeed;
        this.value = value;
        this.condition = condition;
    }

    public Armor getArmor() {
        return armor;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public int getValue() {
        return value;
    }

    public String getCondition() {
        return condition;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public void move() {}

    public void calculateDamage(int damage, DamageType damageType) {
        int finalDamage = damage - getDefence() - armor.getDefence();
        if (damageType == armor.getResistance()) {
            finalDamage = finalDamage/2;
        }
        if (finalDamage > 0) {
            receiveDamage(finalDamage);
        }
    }
}

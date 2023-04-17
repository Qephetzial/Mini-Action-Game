package com.beta.MiniActionGame.model.item;

public class Weapon extends Item {
    private final Integer damage;
    private final Integer attackSpeed;
    private final Integer critChance;
    private final Integer critDamage;
    private final DamageType damageType;


    public Weapon(String name, Rarity rarity, String imageLink, ItemType itemType, Integer damage, Integer attackSpeed, Integer critChance, Integer critDamage, DamageType damageType) {
        super(name, rarity, imageLink, itemType);
        this.damage = damage;
        this.attackSpeed = attackSpeed;
        this.critChance = critChance;
        this.critDamage = critDamage;
        this.damageType = damageType;
    }

    public Integer getDamage() {
        return getARandomInteger(999) <= critChance ? damage + critDamage : damage;
    }

    public Integer getAttackSpeed() {
        return attackSpeed;
    }

    public Integer getCritChance() {
        return critChance;
    }

    public Integer getCritDamage() {
        return critDamage;
    }

    public DamageType getDamageType() {
        return damageType;
    }
}

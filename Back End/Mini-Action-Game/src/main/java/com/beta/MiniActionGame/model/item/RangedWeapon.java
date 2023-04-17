package com.beta.MiniActionGame.model.item;

public class RangedWeapon extends Weapon {
    private final Integer range;
    private final Integer damageRadius;

    public RangedWeapon(String name, Rarity rarity, String imageLink, ItemType itemType, Integer damage, Integer attackSpeed, Integer critChance, Integer critDamage, DamageType damageType, Integer range, Integer damageRadius) {
        super(name, rarity, imageLink, itemType, damage, attackSpeed, critChance, critDamage, damageType);
        this.range = range;
        this.damageRadius = damageRadius;
    }

    public Ammo createAmmo() {
        return new Ammo(getDamage(), damageRadius, getDamageType());
    }
}

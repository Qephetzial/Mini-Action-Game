package com.beta.MiniActionGame.factory;

import com.beta.MiniActionGame.model.item.DamageType;
import com.beta.MiniActionGame.model.item.ItemType;
import com.beta.MiniActionGame.model.item.Rarity;
import com.beta.MiniActionGame.model.item.Armor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
//This class is the collection of armors blueprints.
public class ArmorFactory {

    //Blueprint of common armor.
    public Armor createCommonArmorOne() {
        Armor armor = new Armor();
        armor.setName("Brigandine Armor");
        armor.setRarity(Rarity.COMMON);
        armor.setImage("armors/common-brigandine-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(60);
        armor.setDefence(8);
        armor.setResistance(null);
        armor.setSecondaryResistance(null);
        armor.setMovementSpeed(0);
        return armor;
    }

    //Blueprint of common armor.
    public Armor createCommonArmorTwo() {
        Armor armor = new Armor();
        armor.setName("Hide Armor");
        armor.setRarity(Rarity.COMMON);
        armor.setImage("armors/common-hide-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(55);
        armor.setDefence(11);
        armor.setResistance(null);
        armor.setSecondaryResistance(null);
        armor.setMovementSpeed(0);
        return armor;
    }

    //Blueprint of common armor.
    public Armor createCommonArmorThree() {
        Armor armor = new Armor();
        armor.setName("Shadow Sakura Armor");
        armor.setRarity(Rarity.COMMON);
        armor.setImage("armors/common-shadowSakura-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(120);
        armor.setDefence(6);
        armor.setResistance(null);
        armor.setSecondaryResistance(null);
        armor.setMovementSpeed(0);
        return armor;
    }


    //Blueprint of uncommon armor.
    public Armor createUnCommonArmorOne() {
        Armor armor = new Armor();
        armor.setName("Studded Survival Armor");
        armor.setRarity(Rarity.UNCOMMON);
        armor.setImage("armors/uncommon-studdedSurvival-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(180);
        armor.setDefence(13);
        armor.setResistance(null);
        armor.setSecondaryResistance(null);
        armor.setMovementSpeed(0);
        return armor;
    }

    //Blueprint of uncommon armor.
    public Armor createUnCommonArmorTwo() {
        Armor armor = new Armor();
        armor.setName("Conquistador Armor");
        armor.setRarity(Rarity.UNCOMMON);
        armor.setImage("armors/common-conquistador-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(220);
        armor.setDefence(20);
        armor.setResistance(null);
        armor.setSecondaryResistance(null);
        armor.setMovementSpeed(0);
        return armor;
    }

    //Blueprint of uncommon armor.
    public Armor createUnCommonArmorThree() {
        Armor armor = new Armor();
        armor.setName("Indomitable Samurai Armor");
        armor.setRarity(Rarity.UNCOMMON);
        armor.setImage("armors/common-indomitableSamurai-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(400);
        armor.setDefence(1);
        armor.setResistance(null);
        armor.setSecondaryResistance(null);
        armor.setMovementSpeed(0);
        return armor;
    }

    //Blueprint of rare armor.
    public Armor createRareArmorOne() {
        Armor armor = new Armor();
        armor.setName("Knight Banneret Armor");
        armor.setRarity(Rarity.RARE);
        armor.setImage("armors/rare-knightBanneret-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(700);
        armor.setDefence(50);
        armor.setResistance(DamageType.POISON);
        armor.setSecondaryResistance(null);
        armor.setMovementSpeed(0);
        return armor;
    }

    //Blueprint of rare armor.
    public Armor createRareArmorTwo() {
        Armor armor = new Armor();
        armor.setName("Wide Mantle Robe");
        armor.setRarity(Rarity.RARE);
        armor.setImage("armors/rare-wideMantle-robe.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(800);
        armor.setDefence(45);
        armor.setResistance(DamageType.COLD);
        armor.setSecondaryResistance(null);
        armor.setMovementSpeed(0);
        return armor;
    }

    //Blueprint of rare armor.
    public Armor createRareArmorThree() {
        Armor armor = new Armor();
        armor.setName("Splint Armor");
        armor.setRarity(Rarity.RARE);
        armor.setImage("armors/rare-splint-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(600);
        armor.setDefence(65);
        armor.setResistance(DamageType.FIRE);
        armor.setSecondaryResistance(null);
        armor.setMovementSpeed(0);
        return armor;
    }

    //Blueprint of epic armor.
    public Armor createEpicArmorOne() {
        Armor armor = new Armor();
        armor.setName("Knight Challenger Armor");
        armor.setRarity(Rarity.EPIC);
        armor.setImage("armors/epic-knightChallenger-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(2000);
        armor.setDefence(80);
        armor.setResistance(DamageType.POISON);
        armor.setSecondaryResistance(null);
        armor.setMovementSpeed(0);
        return armor;
    }

    //Blueprint of epic armor.
    public Armor createEpicArmorTwo() {
        Armor armor = new Armor();
        armor.setName("Dragon Knight Armor");
        armor.setRarity(Rarity.EPIC);
        armor.setImage("armors/epic-dragonKnight-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(1800);
        armor.setDefence(90);
        armor.setResistance(DamageType.COLD);
        armor.setSecondaryResistance(null);
        armor.setMovementSpeed(0);
        return armor;
    }

    //Blueprint of epic armor.
    public Armor createEpicArmorThree() {
        Armor armor = new Armor();
        armor.setName("Power Armor");
        armor.setRarity(Rarity.EPIC);
        armor.setImage("armors/epic-power-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(1500);
        armor.setDefence(150);
        armor.setResistance(DamageType.FIRE);
        armor.setSecondaryResistance(null);
        armor.setMovementSpeed(0);
        return armor;
    }

    //Blueprint of legendary armor.
    public Armor createLegendaryArmorOne() {
        Armor armor = new Armor();
        armor.setName("Devil's Armor");
        armor.setRarity(Rarity.LEGENDARY);
        armor.setImage("armors/legendary-devilS-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(10000);
        armor.setDefence(400);
        armor.setResistance(DamageType.COLD);
        armor.setSecondaryResistance(DamageType.SLASHING);
        armor.setMovementSpeed(2);
        return armor;
    }

    //Blueprint of legendary armor.
    public Armor createLegendaryArmorTwo() {
        Armor armor = new Armor();
        armor.setName("Hired Gun Armor");
        armor.setRarity(Rarity.LEGENDARY);
        armor.setImage("armors/legendary-hiredGun-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(12000);
        armor.setDefence(450);
        armor.setResistance(DamageType.POISON);
        armor.setSecondaryResistance(DamageType.BLUDGEONING);
        armor.setMovementSpeed(1);
        return armor;
    }

    //Blueprint of legendary armor.
    public Armor createLegendaryArmorThree() {
        Armor armor = new Armor();
        armor.setName("Combat Uniform");
        armor.setRarity(Rarity.LEGENDARY);
        armor.setImage("armors/legendary-combat-uniform.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(12000);
        armor.setDefence(450);
        armor.setResistance(DamageType.FIRE);
        armor.setSecondaryResistance(DamageType.SLASHING);
        armor.setMovementSpeed(1);
        return armor;
    }
}

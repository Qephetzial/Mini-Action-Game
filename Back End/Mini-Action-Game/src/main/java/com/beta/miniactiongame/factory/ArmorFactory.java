package com.beta.miniactiongame.factory;

import com.beta.miniactiongame.model.item.*;
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
        armor.setPng("armors/common-brigandine-armor.png");
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
        armor.setPng("armors/common-hide-armor.png");
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
        armor.setPng("armors/common-shadowSakura-armor.png");
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
        armor.setPng("armors/uncommon-studdedSurvival-armor.png");
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
        armor.setPng("armors/uncommon-conquistador-armor.png");
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
        armor.setPng("armors/uncommon-indomitableSamurai-armor.png");
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
        armor.setPng("armors/rare-knightBanneret-armor.png");
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
        armor.setPng("armors/rare-wideMantle-robe.png");
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
        armor.setPng("armors/rare-splint-armor.png");
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
        armor.setPng("armors/epic-knightChallenger-armor.png");
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
        armor.setPng("armors/epic-dragonKnight-armor.png");
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
        armor.setPng("armors/epic-power-armor.png");
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
        armor.setPng("armors/legendary-devilS-armor.png");
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
        armor.setPng("armors/legendary-hiredGun-armor.png");
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
        armor.setPng("armors/legendary-combat-uniform.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(12000);
        armor.setDefence(450);
        armor.setResistance(DamageType.FIRE);
        armor.setSecondaryResistance(DamageType.SLASHING);
        armor.setMovementSpeed(1);
        return armor;
    }
}

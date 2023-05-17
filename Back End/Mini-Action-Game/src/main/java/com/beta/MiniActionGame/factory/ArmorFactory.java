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

    //Blueprint of common light armor.
    public Armor createCommonLightArmor() {
        Armor armor = new Armor();
        armor.setName("Light Armor");
        armor.setRarity(Rarity.COMMON);
        armor.setImage("armors/common-light-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(60);
        armor.setDefence(10);
        return armor;
    }

    //Blueprint of common medium armor.
    public Armor createCommonMediumArmor() {
        Armor armor = new Armor();
        armor.setName("Medium Armor");
        armor.setRarity(Rarity.COMMON);
        armor.setImage("armors/common-medium-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(55);
        armor.setDefence(15);
        return armor;
    }

    //Blueprint of common heavy armor.
    public Armor createCommonHeavyArmor() {
        Armor armor = new Armor();
        armor.setName("Heavy Armor");
        armor.setRarity(Rarity.COMMON);
        armor.setImage("armors/common-heavy-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(120);
        armor.setDefence(2);
        return armor;
    }


    //Blueprint of uncommon light armor.
    public Armor createUnCommonLightArmor() {
        Armor armor = new Armor();
        armor.setName("Light Armor");
        armor.setRarity(Rarity.UNCOMMON);
        armor.setImage("armors/uncommon-light-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(70);
        armor.setDefence(13);
        return armor;
    }

    //Blueprint of uncommon medium armor.
    public Armor createUnCommonMediumArmor() {
        Armor armor = new Armor();
        armor.setName("Medium Armor");
        armor.setRarity(Rarity.UNCOMMON);
        armor.setImage("armors/common-medium-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(60);
        armor.setDefence(20);
        return armor;
    }

    //Blueprint of uncommon heavy armor.
    public Armor createUnCommonHeavyArmor() {
        Armor armor = new Armor();
        armor.setName("Health Armor");
        armor.setRarity(Rarity.UNCOMMON);
        armor.setImage("armors/common-heavy-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(180);
        armor.setDefence(1);
        return armor;
    }

    //Blueprint of rare light armor.
    public Armor createRareLightArmor() {
        Armor armor = new Armor();
        armor.setName("Light Armor");
        armor.setRarity(Rarity.RARE);
        armor.setImage("armors/rare-light-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(300);
        armor.setDefence(50);
        armor.setResistance(DamageType.POISON);
        return armor;
    }

    //Blueprint of rare medium armor.
    public Armor createRareMediumArmor() {
        Armor armor = new Armor();
        armor.setName("Medium Armor");
        armor.setRarity(Rarity.RARE);
        armor.setImage("armors/rare-medium-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(350);
        armor.setDefence(45);
        armor.setResistance(DamageType.COLD);
        return armor;
    }

    //Blueprint of rare heavy armor.
    public Armor createRareHeavyArmor() {
        Armor armor = new Armor();
        armor.setName("Heavy Armor");
        armor.setRarity(Rarity.RARE);
        armor.setImage("armors/rare-heavy-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(250);
        armor.setDefence(65);
        armor.setResistance(DamageType.FIRE);
        return armor;
    }

    //Blueprint of epic light armor.
    public Armor createEpicLightArmor() {
        Armor armor = new Armor();
        armor.setName("Light Armor");
        armor.setRarity(Rarity.EPIC);
        armor.setImage("armors/epic-light-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(600);
        armor.setDefence(80);
        armor.setResistance(DamageType.POISON);
        return armor;
    }

    //Blueprint of epic medium armor.
    public Armor createEpicMediumArmor() {
        Armor armor = new Armor();
        armor.setName("Medium Armor");
        armor.setRarity(Rarity.EPIC);
        armor.setImage("armors/epic-medium-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(550);
        armor.setDefence(90);
        armor.setResistance(DamageType.COLD);
        return armor;
    }

    //Blueprint of epic heavy armor.
    public Armor createEpicHeavyArmor() {
        Armor armor = new Armor();
        armor.setName("Heavy Armor");
        armor.setRarity(Rarity.EPIC);
        armor.setImage("armors/epic-heavy-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(400);
        armor.setDefence(150);
        armor.setResistance(DamageType.FIRE);
        return armor;
    }

    //Blueprint of legendary light armor.
    public Armor createLegendaryLightArmor() {
        Armor armor = new Armor();
        armor.setName("Light Armor");
        armor.setRarity(Rarity.LEGENDARY);
        armor.setImage("armors/legendary-light-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(1300);
        armor.setDefence(400);
        armor.setResistance(DamageType.POISON);
        armor.setSecondaryResistance(DamageType.SLASHING);
        armor.setMovementSpeed(2);
        return armor;
    }

    //Blueprint of legendary medium armor.
    public Armor createLegendaryMediumArmor() {
        Armor armor = new Armor();
        armor.setName("Medium Armor");
        armor.setRarity(Rarity.LEGENDARY);
        armor.setImage("armors/legendary-medium-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(1200);
        armor.setDefence(450);
        armor.setResistance(DamageType.COLD);
        armor.setSecondaryResistance(DamageType.SLASHING);
        armor.setMovementSpeed(1);
        return armor;
    }

    //Blueprint of legendary heavy armor.
    public Armor createLegendaryHeavyArmor() {
        Armor armor = new Armor();
        armor.setName("Heavy Armor");
        armor.setRarity(Rarity.LEGENDARY);
        armor.setImage("armors/legendary-heavy-armor.png");
        armor.setItemType(ItemType.ARMOR);
        armor.setHealth(1400);
        armor.setDefence(450);
        armor.setResistance(DamageType.FIRE);
        armor.setSecondaryResistance(DamageType.PIERCING);
        armor.setMovementSpeed(1);
        return armor;
    }
}

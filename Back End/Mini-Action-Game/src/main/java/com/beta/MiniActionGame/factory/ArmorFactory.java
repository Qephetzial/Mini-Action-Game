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
        Armor commonLightArmor = new Armor();
        commonLightArmor.setName("Light Armor");
        commonLightArmor.setRarity(Rarity.COMMON);
        commonLightArmor.setImage("armors/common-light-armor.png");
        commonLightArmor.setItemType(ItemType.ARMOR);
        commonLightArmor.setHealth(60);
        commonLightArmor.setDefence(10);
        return commonLightArmor;
    }

    //Blueprint of common medium armor.
    public Armor createCommonMediumArmor() {
        Armor commonMediumArmor = new Armor();
        commonMediumArmor.setName("Medium Armor");
        commonMediumArmor.setRarity(Rarity.COMMON);
        commonMediumArmor.setImage("armors/common-medium-armor.png");
        commonMediumArmor.setItemType(ItemType.ARMOR);
        commonMediumArmor.setHealth(55);
        commonMediumArmor.setDefence(15);
        return commonMediumArmor;
    }

    //Blueprint of common heavy armor.
    public Armor createCommonHeavyArmor() {
        Armor commonHeavyArmor = new Armor();
        commonHeavyArmor.setName("Heavy Armor");
        commonHeavyArmor.setRarity(Rarity.COMMON);
        commonHeavyArmor.setImage("armors/common-heavy-armor.png");
        commonHeavyArmor.setItemType(ItemType.ARMOR);
        commonHeavyArmor.setHealth(120);
        commonHeavyArmor.setDefence(2);
        return commonHeavyArmor;
    }


    //Blueprint of uncommon light armor.
    public Armor createUnCommonLightArmor() {
        Armor unCommonAssassinArmor = new Armor();
        unCommonAssassinArmor.setName("Light Armor");
        unCommonAssassinArmor.setRarity(Rarity.UNCOMMON);
        unCommonAssassinArmor.setImage("armors/uncommon-light-armor.png");
        unCommonAssassinArmor.setItemType(ItemType.ARMOR);
        unCommonAssassinArmor.setHealth(70);
        unCommonAssassinArmor.setDefence(13);
        return unCommonAssassinArmor;
    }

    //Blueprint of uncommon medium armor.
    public Armor createUnCommonMediumArmor() {
        Armor unCommonChestPlateArmor = new Armor();
        unCommonChestPlateArmor.setName("Medium Armor");
        unCommonChestPlateArmor.setRarity(Rarity.UNCOMMON);
        unCommonChestPlateArmor.setImage("armors/common-medium-armor.png");
        unCommonChestPlateArmor.setItemType(ItemType.ARMOR);
        unCommonChestPlateArmor.setHealth(60);
        unCommonChestPlateArmor.setDefence(20);
        return unCommonChestPlateArmor;
    }

    //Blueprint of uncommon heavy armor.
    public Armor createUnCommonHeavyArmor() {
        Armor unCommonHealthArmor = new Armor();
        unCommonHealthArmor.setName("Health Armor");
        unCommonHealthArmor.setRarity(Rarity.UNCOMMON);
        unCommonHealthArmor.setImage("armors/common-heavy-armor.png");
        unCommonHealthArmor.setItemType(ItemType.ARMOR);
        unCommonHealthArmor.setHealth(180);
        unCommonHealthArmor.setDefence(1);
        return unCommonHealthArmor;
    }

    //Blueprint of rare light armor.
    public Armor createRareLightArmor() {
        Armor rareAndEpicArmor = new Armor();
        rareAndEpicArmor.setName("Light Armor");
        rareAndEpicArmor.setRarity(Rarity.RARE);
        rareAndEpicArmor.setImage("armors/rare-light-armor.png");
        rareAndEpicArmor.setItemType(ItemType.ARMOR);
        rareAndEpicArmor.setHealth(300);
        rareAndEpicArmor.setDefence(50);
        rareAndEpicArmor.setResistance(DamageType.POISON);
        return rareAndEpicArmor;
    }

    //Blueprint of rare medium armor.
    public Armor createRareMediumArmor() {
        Armor rareAndEpicArmor = new Armor();
        rareAndEpicArmor.setName("Medium Armor");
        rareAndEpicArmor.setRarity(Rarity.RARE);
        rareAndEpicArmor.setImage("armors/rare-medium-armor.png");
        rareAndEpicArmor.setItemType(ItemType.ARMOR);
        rareAndEpicArmor.setHealth(350);
        rareAndEpicArmor.setDefence(45);
        rareAndEpicArmor.setResistance(DamageType.COLD);
        return rareAndEpicArmor;
    }

    //Blueprint of rare heavy armor.
    public Armor createRareHeavyArmor() {
        Armor rareAndEpicArmor = new Armor();
        rareAndEpicArmor.setName("Heavy Armor");
        rareAndEpicArmor.setRarity(Rarity.RARE);
        rareAndEpicArmor.setImage("armors/rare-heavy-armor.png");
        rareAndEpicArmor.setItemType(ItemType.ARMOR);
        rareAndEpicArmor.setHealth(250);
        rareAndEpicArmor.setDefence(65);
        rareAndEpicArmor.setResistance(DamageType.FIRE);
        return rareAndEpicArmor;
    }

    //Blueprint of epic light armor.
    public Armor createEpicLightArmor() {
        Armor rareAndEpicArmor = new Armor();
        rareAndEpicArmor.setName("Light Armor");
        rareAndEpicArmor.setRarity(Rarity.EPIC);
        rareAndEpicArmor.setImage("armors/epic-light-armor.png");
        rareAndEpicArmor.setItemType(ItemType.ARMOR);
        rareAndEpicArmor.setHealth(600);
        rareAndEpicArmor.setDefence(80);
        rareAndEpicArmor.setResistance(DamageType.POISON);
        return rareAndEpicArmor;
    }

    //Blueprint of epic medium armor.
    public Armor createEpicMediumArmor() {
        Armor rareAndEpicArmor = new Armor();
        rareAndEpicArmor.setName("Medium Armor");
        rareAndEpicArmor.setRarity(Rarity.EPIC);
        rareAndEpicArmor.setImage("armors/epic-medium-armor.png");
        rareAndEpicArmor.setItemType(ItemType.ARMOR);
        rareAndEpicArmor.setHealth(550);
        rareAndEpicArmor.setDefence(90);
        rareAndEpicArmor.setResistance(DamageType.COLD);
        return rareAndEpicArmor;
    }

    //Blueprint of epic heavy armor.
    public Armor createEpicHeavyArmor() {
        Armor rareAndEpicArmor = new Armor();
        rareAndEpicArmor.setName("Heavy Armor");
        rareAndEpicArmor.setRarity(Rarity.EPIC);
        rareAndEpicArmor.setImage("armors/epic-heavy-armor.png");
        rareAndEpicArmor.setItemType(ItemType.ARMOR);
        rareAndEpicArmor.setHealth(400);
        rareAndEpicArmor.setDefence(150);
        rareAndEpicArmor.setResistance(DamageType.FIRE);
        return rareAndEpicArmor;
    }

    //Blueprint of legendary light armor.
    public Armor createLegendaryLightArmor() {
        Armor legendaryArmor = new Armor();
        legendaryArmor.setName("Light Armor");
        legendaryArmor.setRarity(Rarity.LEGENDARY);
        legendaryArmor.setImage("armors/legendary-light-armor.png");
        legendaryArmor.setItemType(ItemType.ARMOR);
        legendaryArmor.setHealth(1300);
        legendaryArmor.setDefence(400);
        legendaryArmor.setResistance(DamageType.POISON);
        legendaryArmor.setSecondaryResistance(DamageType.SLASHING);
        legendaryArmor.setMovementSpeed(2);
        return legendaryArmor;
    }

    //Blueprint of legendary medium armor.
    public Armor createLegendaryMediumArmor() {
        Armor legendaryArmor = new Armor();
        legendaryArmor.setName("Medium Armor");
        legendaryArmor.setRarity(Rarity.LEGENDARY);
        legendaryArmor.setImage("armors/legendary-medium-armor.png");
        legendaryArmor.setItemType(ItemType.ARMOR);
        legendaryArmor.setHealth(1200);
        legendaryArmor.setDefence(450);
        legendaryArmor.setResistance(DamageType.COLD);
        legendaryArmor.setSecondaryResistance(DamageType.SLASHING);
        legendaryArmor.setMovementSpeed(1);
        return legendaryArmor;
    }

    //Blueprint of legendary heavy armor.
    public Armor createLegendaryHeavyArmor() {
        Armor legendaryArmor = new Armor();
        legendaryArmor.setName("Heavy Armor");
        legendaryArmor.setRarity(Rarity.LEGENDARY);
        legendaryArmor.setImage("armors/legendary-heavy-armor.png");
        legendaryArmor.setItemType(ItemType.ARMOR);
        legendaryArmor.setHealth(1400);
        legendaryArmor.setDefence(450);
        legendaryArmor.setResistance(DamageType.FIRE);
        legendaryArmor.setSecondaryResistance(DamageType.PIERCING);
        legendaryArmor.setMovementSpeed(1);
        return legendaryArmor;
    }
}

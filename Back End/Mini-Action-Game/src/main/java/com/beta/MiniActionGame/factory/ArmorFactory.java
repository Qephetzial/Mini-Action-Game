package com.beta.MiniActionGame.factory;

import com.beta.MiniActionGame.model.item.DamageType;
import com.beta.MiniActionGame.model.item.armor.CommonAndUnCommonArmor;
import com.beta.MiniActionGame.model.item.ItemType;
import com.beta.MiniActionGame.model.item.Rarity;
import com.beta.MiniActionGame.model.item.armor.LegendaryArmor;
import com.beta.MiniActionGame.model.item.armor.RareAndEpicArmor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class ArmorFactory {

    public CommonAndUnCommonArmor createCommonLightArmor() {
        CommonAndUnCommonArmor commonLightArmor = new CommonAndUnCommonArmor();
        commonLightArmor.setName("Light Armor");
        commonLightArmor.setRarity(Rarity.COMMON);
        commonLightArmor.setImageLink("armors/common-light-armor.png");
        commonLightArmor.setItemType(ItemType.ARMOR);
        commonLightArmor.setHealth(60);
        commonLightArmor.setDefence(10);
        return commonLightArmor;
    }

    public CommonAndUnCommonArmor createCommonMediumArmor() {
        CommonAndUnCommonArmor commonMediumArmor = new CommonAndUnCommonArmor();
        commonMediumArmor.setName("Medium Armor");
        commonMediumArmor.setRarity(Rarity.COMMON);
        commonMediumArmor.setImageLink("armors/common-medium-armor.png");
        commonMediumArmor.setItemType(ItemType.ARMOR);
        commonMediumArmor.setHealth(55);
        commonMediumArmor.setDefence(15);
        return commonMediumArmor;
    }

    public CommonAndUnCommonArmor createCommonHeavyArmor() {
        CommonAndUnCommonArmor commonHeavyArmor = new CommonAndUnCommonArmor();
        commonHeavyArmor.setName("Heavy Armor");
        commonHeavyArmor.setRarity(Rarity.COMMON);
        commonHeavyArmor.setImageLink("armors/common-heavy-armor.png");
        commonHeavyArmor.setItemType(ItemType.ARMOR);
        commonHeavyArmor.setHealth(120);
        commonHeavyArmor.setDefence(2);
        return commonHeavyArmor;
    }

    public CommonAndUnCommonArmor createUnCommonLightArmor() {
        CommonAndUnCommonArmor unCommonAssassinArmor = new CommonAndUnCommonArmor();
        unCommonAssassinArmor.setName("Light Armor");
        unCommonAssassinArmor.setRarity(Rarity.UNCOMMON);
        unCommonAssassinArmor.setImageLink("armors/uncommon-light-armor.png");
        unCommonAssassinArmor.setItemType(ItemType.ARMOR);
        unCommonAssassinArmor.setHealth(70);
        unCommonAssassinArmor.setDefence(13);
        return unCommonAssassinArmor;
    }

    public CommonAndUnCommonArmor createUnCommonMediumArmor() {
        CommonAndUnCommonArmor unCommonChestPlateArmor = new CommonAndUnCommonArmor();
        unCommonChestPlateArmor.setName("Medium Armor");
        unCommonChestPlateArmor.setRarity(Rarity.UNCOMMON);
        unCommonChestPlateArmor.setImageLink("armors/common-medium-armor.png");
        unCommonChestPlateArmor.setItemType(ItemType.ARMOR);
        unCommonChestPlateArmor.setHealth(60);
        unCommonChestPlateArmor.setDefence(20);
        return unCommonChestPlateArmor;
    }

    public CommonAndUnCommonArmor createUnCommonHeavyArmor() {
        CommonAndUnCommonArmor unCommonHealthArmor = new CommonAndUnCommonArmor();
        unCommonHealthArmor.setName("Health Armor");
        unCommonHealthArmor.setRarity(Rarity.UNCOMMON);
        unCommonHealthArmor.setImageLink("armors/common-heavy-armor.png");
        unCommonHealthArmor.setItemType(ItemType.ARMOR);
        unCommonHealthArmor.setHealth(180);
        unCommonHealthArmor.setDefence(1);
        return unCommonHealthArmor;
    }

    public RareAndEpicArmor createRareLightArmor() {
        RareAndEpicArmor rareAndEpicArmor = new RareAndEpicArmor();
        rareAndEpicArmor.setName("Light Armor");
        rareAndEpicArmor.setRarity(Rarity.RARE);
        rareAndEpicArmor.setImageLink("armors/rare-light-armor.png");
        rareAndEpicArmor.setItemType(ItemType.ARMOR);
        rareAndEpicArmor.setHealth(300);
        rareAndEpicArmor.setDefence(50);
        rareAndEpicArmor.setResistance(DamageType.POISON);
        return rareAndEpicArmor;
    }

    public RareAndEpicArmor createRareMediumArmor() {
        RareAndEpicArmor rareAndEpicArmor = new RareAndEpicArmor();
        rareAndEpicArmor.setName("Medium Armor");
        rareAndEpicArmor.setRarity(Rarity.RARE);
        rareAndEpicArmor.setImageLink("armors/rare-medium-armor.png");
        rareAndEpicArmor.setItemType(ItemType.ARMOR);
        rareAndEpicArmor.setHealth(350);
        rareAndEpicArmor.setDefence(45);
        rareAndEpicArmor.setResistance(DamageType.COLD);
        return rareAndEpicArmor;
    }

    public RareAndEpicArmor createRareHeavyArmor() {
        RareAndEpicArmor rareAndEpicArmor = new RareAndEpicArmor();
        rareAndEpicArmor.setName("Heavy Armor");
        rareAndEpicArmor.setRarity(Rarity.RARE);
        rareAndEpicArmor.setImageLink("armors/rare-heavy-armor.png");
        rareAndEpicArmor.setItemType(ItemType.ARMOR);
        rareAndEpicArmor.setHealth(250);
        rareAndEpicArmor.setDefence(65);
        rareAndEpicArmor.setResistance(DamageType.FIRE);
        return rareAndEpicArmor;
    }

    public RareAndEpicArmor createEpicLightArmor() {
        RareAndEpicArmor rareAndEpicArmor = new RareAndEpicArmor();
        rareAndEpicArmor.setName("Light Armor");
        rareAndEpicArmor.setRarity(Rarity.EPIC);
        rareAndEpicArmor.setImageLink("armors/epic-light-armor.png");
        rareAndEpicArmor.setItemType(ItemType.ARMOR);
        rareAndEpicArmor.setHealth(600);
        rareAndEpicArmor.setDefence(80);
        rareAndEpicArmor.setResistance(DamageType.POISON);
        return rareAndEpicArmor;
    }

    public RareAndEpicArmor createEpicMediumArmor() {
        RareAndEpicArmor rareAndEpicArmor = new RareAndEpicArmor();
        rareAndEpicArmor.setName("Medium Armor");
        rareAndEpicArmor.setRarity(Rarity.EPIC);
        rareAndEpicArmor.setImageLink("armors/epic-medium-armor.png");
        rareAndEpicArmor.setItemType(ItemType.ARMOR);
        rareAndEpicArmor.setHealth(550);
        rareAndEpicArmor.setDefence(90);
        rareAndEpicArmor.setResistance(DamageType.COLD);
        return rareAndEpicArmor;
    }

    public RareAndEpicArmor createEpicHeavyArmor() {
        RareAndEpicArmor rareAndEpicArmor = new RareAndEpicArmor();
        rareAndEpicArmor.setName("Heavy Armor");
        rareAndEpicArmor.setRarity(Rarity.EPIC);
        rareAndEpicArmor.setImageLink("armors/epic-heavy-armor.png");
        rareAndEpicArmor.setItemType(ItemType.ARMOR);
        rareAndEpicArmor.setHealth(400);
        rareAndEpicArmor.setDefence(150);
        rareAndEpicArmor.setResistance(DamageType.FIRE);
        return rareAndEpicArmor;
    }

    public LegendaryArmor createLegendaryLightArmor() {
        LegendaryArmor legendaryArmor = new LegendaryArmor();
        legendaryArmor.setName("Light Armor");
        legendaryArmor.setRarity(Rarity.LEGENDARY);
        legendaryArmor.setImageLink("armors/legendary-light-armor.png");
        legendaryArmor.setItemType(ItemType.ARMOR);
        legendaryArmor.setHealth(1300);
        legendaryArmor.setDefence(400);
        legendaryArmor.setResistance(DamageType.POISON);
        legendaryArmor.setSecondaryResistance(DamageType.SLASHING);
        legendaryArmor.setMovementSpeed(2);
        return legendaryArmor;
    }

    public LegendaryArmor createLegendaryMediumArmor() {
        LegendaryArmor legendaryArmor = new LegendaryArmor();
        legendaryArmor.setName("Medium Armor");
        legendaryArmor.setRarity(Rarity.LEGENDARY);
        legendaryArmor.setImageLink("armors/legendary-medium-armor.png");
        legendaryArmor.setItemType(ItemType.ARMOR);
        legendaryArmor.setHealth(1200);
        legendaryArmor.setDefence(450);
        legendaryArmor.setResistance(DamageType.COLD);
        legendaryArmor.setSecondaryResistance(DamageType.SLASHING);
        legendaryArmor.setMovementSpeed(1);
        return legendaryArmor;
    }

    public LegendaryArmor createLegendaryHeavyArmor() {
        LegendaryArmor legendaryArmor = new LegendaryArmor();
        legendaryArmor.setName("Heavy Armor");
        legendaryArmor.setRarity(Rarity.LEGENDARY);
        legendaryArmor.setImageLink("armors/legendary-heavy-armor.png");
        legendaryArmor.setItemType(ItemType.ARMOR);
        legendaryArmor.setHealth(1400);
        legendaryArmor.setDefence(450);
        legendaryArmor.setResistance(DamageType.FIRE);
        legendaryArmor.setSecondaryResistance(DamageType.PIERCING);
        legendaryArmor.setMovementSpeed(1);
        return legendaryArmor;
    }
}

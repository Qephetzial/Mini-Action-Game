package com.beta.miniactiongame.factory;

import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.DamageType;
import com.beta.miniactiongame.model.item.ItemType;
import com.beta.miniactiongame.model.item.Rarity;
import com.beta.miniactiongame.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ArmorFactory {

    private final ItemService itemService;

    public Armor getCommonArmorOne() {
        Armor armor = itemService.getArmorByName("Brigandine Armor");
        if (armor == null) {
            armor = new Armor();
            armor.setName("Brigandine Armor");
            armor.setRarity(Rarity.COMMON);
            armor.setPng("armors/common-brigandine-armor.png");
            armor.setItemType(ItemType.ARMOR);
            armor.setValue(15);
            armor.setHealth(60);
            armor.setDefence(8);
            armor.setResistance(null);
            armor.setSecondaryResistance(null);
            armor.setMovementSpeed(0);
            itemService.saveArmor(armor);
        }
        return armor;
    }

    public Armor getCommonArmorTwo() {
        Armor armor = itemService.getArmorByName("Hide Armor");
        if(armor == null) {
            armor = new Armor();
            armor.setName("Hide Armor");
            armor.setRarity(Rarity.COMMON);
            armor.setPng("armors/common-hide-armor.png");
            armor.setItemType(ItemType.ARMOR);
            armor.setValue(15);
            armor.setHealth(55);
            armor.setDefence(11);
            armor.setResistance(null);
            armor.setSecondaryResistance(null);
            armor.setMovementSpeed(0);
            itemService.saveArmor(armor);
        }
        return armor;
    }

    public Armor getCommonArmorThree() {
        Armor armor = itemService.getArmorByName("Shadow Sakura Armor");
        if(armor == null) {
            armor = new Armor();
            armor.setName("Shadow Sakura Armor");
            armor.setRarity(Rarity.COMMON);
            armor.setPng("armors/common-shadowSakura-armor.png");
            armor.setItemType(ItemType.ARMOR);
            armor.setValue(15);
            armor.setHealth(120);
            armor.setDefence(6);
            armor.setResistance(null);
            armor.setSecondaryResistance(null);
            armor.setMovementSpeed(0);
            itemService.saveArmor(armor);
        }
        return armor;
    }

    public Armor getUnCommonArmorOne() {
        Armor armor = itemService.getArmorByName("Studded Survival Armor");
        if(armor == null) {
            armor = new Armor();
            armor.setName("Studded Survival Armor");
            armor.setRarity(Rarity.UNCOMMON);
            armor.setPng("armors/uncommon-studdedSurvival-armor.png");
            armor.setItemType(ItemType.ARMOR);
            armor.setValue(45);
            armor.setHealth(180);
            armor.setDefence(13);
            armor.setResistance(null);
            armor.setSecondaryResistance(null);
            armor.setMovementSpeed(0);
            itemService.saveArmor(armor);
        }
        return armor;
    }

    public Armor getUnCommonArmorTwo() {
        Armor armor = itemService.getArmorByName("Conquistador Armor");
        if(armor == null) {
            armor = new Armor();
            armor.setName("Conquistador Armor");
            armor.setRarity(Rarity.UNCOMMON);
            armor.setPng("armors/uncommon-conquistador-armor.png");
            armor.setItemType(ItemType.ARMOR);
            armor.setValue(45);
            armor.setHealth(220);
            armor.setDefence(20);
            armor.setResistance(null);
            armor.setSecondaryResistance(null);
            armor.setMovementSpeed(0);
            itemService.saveArmor(armor);
        }
        return armor;
    }

    public Armor getUnCommonArmorThree() {
        Armor armor = itemService.getArmorByName("Indomitable Samurai Armor");
        if(armor == null) {
            armor = new Armor();
            armor.setName("Indomitable Samurai Armor");
            armor.setRarity(Rarity.UNCOMMON);
            armor.setPng("armors/uncommon-indomitableSamurai-armor.png");
            armor.setItemType(ItemType.ARMOR);
            armor.setValue(45);
            armor.setHealth(400);
            armor.setDefence(1);
            armor.setResistance(null);
            armor.setSecondaryResistance(null);
            armor.setMovementSpeed(0);
            itemService.saveArmor(armor);
        }
        return armor;
    }

    public Armor getRareArmorOne() {
        Armor armor = itemService.getArmorByName("Knight Banneret Armor");
        if(armor == null) {
            armor = new Armor();
            armor.setName("Knight Banneret Armor");
            armor.setRarity(Rarity.RARE);
            armor.setPng("armors/rare-knightBanneret-armor.png");
            armor.setItemType(ItemType.ARMOR);
            armor.setValue(150);
            armor.setHealth(700);
            armor.setDefence(50);
            armor.setResistance(DamageType.POISON);
            armor.setSecondaryResistance(null);
            armor.setMovementSpeed(0);
            itemService.saveArmor(armor);
        }
        return armor;
    }

    public Armor getRareArmorTwo() {
        Armor armor = itemService.getArmorByName("Wide Mantle Robe");
        if(armor == null) {
            armor = new Armor();
            armor.setName("Wide Mantle Robe");
            armor.setRarity(Rarity.RARE);
            armor.setPng("armors/rare-wideMantle-robe.png");
            armor.setItemType(ItemType.ARMOR);
            armor.setValue(150);
            armor.setHealth(800);
            armor.setDefence(45);
            armor.setResistance(DamageType.COLD);
            armor.setSecondaryResistance(null);
            armor.setMovementSpeed(0);
            itemService.saveArmor(armor);
        }
        return armor;
    }

    public Armor getRareArmorThree() {
        Armor armor = itemService.getArmorByName("Splint Armor");
        if(armor == null) {
            armor = new Armor();
            armor.setName("Splint Armor");
            armor.setRarity(Rarity.RARE);
            armor.setPng("armors/rare-splint-armor.png");
            armor.setItemType(ItemType.ARMOR);
            armor.setValue(150);
            armor.setHealth(600);
            armor.setDefence(65);
            armor.setResistance(DamageType.FIRE);
            armor.setSecondaryResistance(null);
            armor.setMovementSpeed(0);
            itemService.saveArmor(armor);
        }
        return armor;
    }

    public Armor getEpicArmorOne() {
        Armor armor = itemService.getArmorByName("Knight Challenger Armor");
        if(armor == null) {
            armor = new Armor();
            armor.setName("Knight Challenger Armor");
            armor.setRarity(Rarity.EPIC);
            armor.setPng("armors/epic-knightChallenger-armor.png");
            armor.setItemType(ItemType.ARMOR);
            armor.setValue(450);
            armor.setHealth(2000);
            armor.setDefence(80);
            armor.setResistance(DamageType.POISON);
            armor.setSecondaryResistance(null);
            armor.setMovementSpeed(0);
            itemService.saveArmor(armor);
        }
        return armor;
    }

    public Armor getEpicArmorTwo() {
        Armor armor = itemService.getArmorByName("Dragon Knight Armor");
        if(armor == null) {
            armor = new Armor();
            armor.setName("Dragon Knight Armor");
            armor.setRarity(Rarity.EPIC);
            armor.setPng("armors/epic-dragonKnight-armor.png");
            armor.setItemType(ItemType.ARMOR);
            armor.setValue(450);
            armor.setHealth(1800);
            armor.setDefence(90);
            armor.setResistance(DamageType.COLD);
            armor.setSecondaryResistance(null);
            armor.setMovementSpeed(0);
            itemService.saveArmor(armor);
        }
        return armor;
    }

    public Armor getEpicArmorThree() {
        Armor armor = itemService.getArmorByName("Power Armor");
        if(armor == null) {
            armor = new Armor();
            armor.setName("Power Armor");
            armor.setRarity(Rarity.EPIC);
            armor.setPng("armors/epic-power-armor.png");
            armor.setItemType(ItemType.ARMOR);
            armor.setValue(450);
            armor.setHealth(1500);
            armor.setDefence(150);
            armor.setResistance(DamageType.FIRE);
            armor.setSecondaryResistance(null);
            armor.setMovementSpeed(0);
            itemService.saveArmor(armor);
        }
        return armor;
    }

    public Armor getLegendaryArmorOne() {
        Armor armor = itemService.getArmorByName("Devil's Armor");
        if(armor == null) {
            armor = new Armor();
            armor.setName("Devil's Armor");
            armor.setRarity(Rarity.LEGENDARY);
            armor.setPng("armors/legendary-devilS-armor.png");
            armor.setItemType(ItemType.ARMOR);
            armor.setValue(900);
            armor.setHealth(10000);
            armor.setDefence(400);
            armor.setResistance(DamageType.COLD);
            armor.setSecondaryResistance(DamageType.SLASHING);
            armor.setMovementSpeed(2);
            itemService.saveArmor(armor);
        }
        return armor;
    }

    public Armor getLegendaryArmorTwo() {
        Armor armor = itemService.getArmorByName("Hired Gun Armor");
        if(armor == null) {
            armor = new Armor();
            armor.setName("Hired Gun Armor");
            armor.setRarity(Rarity.LEGENDARY);
            armor.setPng("armors/legendary-hiredGun-armor.png");
            armor.setItemType(ItemType.ARMOR);
            armor.setValue(900);
            armor.setHealth(12000);
            armor.setDefence(450);
            armor.setResistance(DamageType.POISON);
            armor.setSecondaryResistance(DamageType.BLUDGEONING);
            armor.setMovementSpeed(1);
            itemService.saveArmor(armor);
        }
        return armor;
    }

    public Armor getLegendaryArmorThree() {
        Armor armor = itemService.getArmorByName("Combat Uniform");
        if(armor == null) {
            armor = new Armor();
            armor.setName("Combat Uniform");
            armor.setRarity(Rarity.LEGENDARY);
            armor.setPng("armors/legendary-combat-uniform.png");
            armor.setItemType(ItemType.ARMOR);
            armor.setValue(900);
            armor.setHealth(12000);
            armor.setDefence(450);
            armor.setResistance(DamageType.FIRE);
            armor.setSecondaryResistance(DamageType.SLASHING);
            armor.setMovementSpeed(1);
            itemService.saveArmor(armor);
        }
        return armor;
    }
}
package com.beta.miniactiongame.factory;

import com.beta.miniactiongame.model.item.BonusProperty;
import com.beta.miniactiongame.model.item.DamageType;
import com.beta.miniactiongame.model.item.ItemType;
import com.beta.miniactiongame.model.item.Rarity;
import com.beta.miniactiongame.model.item.Weapon;
import com.beta.miniactiongame.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WeaponFactory {

    private final ItemService itemService;
    private final SpellFactory spellFactory;

    public Weapon getCommonSwordOne() {
        Weapon weapon = itemService.getWeaponByName("Black sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Black sword");
            weapon.setRarity(Rarity.COMMON);
            weapon.setPng("swords/common-black-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setValue(15);
            weapon.setDamage(14);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCriticalChance(0);
            weapon.setCriticalDamage(0);
            weapon.setAttackSpeed(10);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getCommonSwordTwo() {
        Weapon weapon = itemService.getWeaponByName("Bear sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Bear sword");
            weapon.setRarity(Rarity.COMMON);
            weapon.setPng("swords/common-bear-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setValue(15);
            weapon.setDamage(27);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCriticalChance(10);
            weapon.setCriticalDamage(20);
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getCommonSwordThree() {
        Weapon weapon = itemService.getWeaponByName("Red metal sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Red metal sword");
            weapon.setRarity(Rarity.COMMON);
            weapon.setPng("swords/common-redMetal-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setValue(15);
            weapon.setDamage(14);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCriticalChance(3);
            weapon.setCriticalDamage(15);
            weapon.setAttackSpeed(10);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
            }
        return weapon;
    }

    public Weapon getUnCommonSwordOne() {
        Weapon weapon = itemService.getWeaponByName("Ancient sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Ancient sword");
            weapon.setRarity(Rarity.UNCOMMON);
            weapon.setPng("swords/uncommon-ancient-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setValue(45);
            weapon.setDamage(45);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCriticalChance(20);
            weapon.setCriticalDamage(20);
            weapon.setAttackSpeed(10);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getUnCommonSwordTwo() {
        Weapon weapon = itemService.getWeaponByName("Bone sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Bone sword");
            weapon.setRarity(Rarity.UNCOMMON);
            weapon.setPng("swords/uncommon-bone-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setValue(45);
            weapon.setDamage(31);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCriticalChance(10);
            weapon.setCriticalDamage(15);
            weapon.setAttackSpeed(15);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getUnCommonSwordThree() {
        Weapon weapon = itemService.getWeaponByName("Eagle sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Eagle sword");
            weapon.setRarity(Rarity.UNCOMMON);
            weapon.setPng("swords/uncommon-eagle-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setValue(45);
            weapon.setDamage(30);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCriticalChance(10);
            weapon.setCriticalDamage(25);
            weapon.setAttackSpeed(15);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getRareSwordOne() {
        Weapon weapon = itemService.getWeaponByName("Cursed sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Cursed sword");
            weapon.setRarity(Rarity.RARE);
            weapon.setPng("swords/rare-cursed-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setValue(150);
            weapon.setDamage(90);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCriticalChance(25);
            weapon.setCriticalDamage(40);
            weapon.setAttackSpeed(15);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getRareSwordTwo() {
        Weapon weapon = itemService.getWeaponByName("Executioner sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Executioner sword");
            weapon.setRarity(Rarity.RARE);
            weapon.setPng("swords/rare-executioner-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setValue(150);
            weapon.setDamage(130);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCriticalChance(25);
            weapon.setCriticalDamage(80);
            weapon.setAttackSpeed(10);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getRareSwordThree() {
        Weapon weapon = itemService.getWeaponByName("Necrotic sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Necrotic sword");
            weapon.setRarity(Rarity.RARE);
            weapon.setPng("swords/rare-necrotic-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setValue(150);
            weapon.setDamage(135);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCriticalChance(30);
            weapon.setCriticalDamage(50);
            weapon.setAttackSpeed(10);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getEpicSwordOne() {
        Weapon weapon = itemService.getWeaponByName("Head splashing Hammer");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Head splashing Hammer");
            weapon.setRarity(Rarity.EPIC);
            weapon.setPng("swords/epic-headSplashing-hammer.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setValue(450);
            weapon.setDamage(750);
            weapon.setDamageType(DamageType.BLUDGEONING);
            weapon.setCriticalChance(35);
            weapon.setCriticalDamage(450);
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getEpicSwordTwo() {
        Weapon weapon = itemService.getWeaponByName("Heroic Axe");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Heroic Axe");
            weapon.setRarity(Rarity.EPIC);
            weapon.setPng("swords/epic-heroic-axe.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setValue(450);
            weapon.setDamage(260);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCriticalChance(40);
            weapon.setCriticalDamage(100);
            weapon.setAttackSpeed(10);
            weapon.setBonusProperty(BonusProperty.MINOR_SWEEPING_EDGE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getEpicSwordThree() {
        Weapon weapon = itemService.getWeaponByName("Magma Axe");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Magma Axe");
            weapon.setRarity(Rarity.EPIC);
            weapon.setPng("swords/epic-magma-axe.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setValue(450);
            weapon.setDamage(255);
            weapon.setDamageType(DamageType.FIRE);
            weapon.setCriticalChance(15);
            weapon.setCriticalDamage(255);
            weapon.setAttackSpeed(10);
            weapon.setBonusProperty(BonusProperty.MINOR_SWEEPING_EDGE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getLegendarySwordOne() {
        Weapon weapon = itemService.getWeaponByName("Demonic Spear");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Demonic Spear");
            weapon.setRarity(Rarity.LEGENDARY);
            weapon.setPng("swords/legendary-demonic-spear.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setValue(900);
            weapon.setDamage(700);
            weapon.setDamageType(DamageType.POISON);
            weapon.setCriticalChance(85);
            weapon.setCriticalDamage(600);
            weapon.setAttackSpeed(20);
            weapon.setBonusProperty(BonusProperty.PIERCE_THROUGH);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getLegendarySwordTwo() {
        Weapon weapon = itemService.getWeaponByName("Samurai Sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Samurai Sword");
            weapon.setRarity(Rarity.LEGENDARY);
            weapon.setPng("swords/legendary-samurai-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setValue(900);
            weapon.setDamage(1000);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCriticalChance(90);
            weapon.setCriticalDamage(350);
            weapon.setAttackSpeed(30);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getLegendarySwordThree() {
        Weapon weapon = itemService.getWeaponByName("Demonic Scythe");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Demonic Scythe");
            weapon.setRarity(Rarity.LEGENDARY);
            weapon.setPng("swords/legendary-demonic-scythe.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setValue(900);
            weapon.setDamage(1650);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCriticalChance(99);
            weapon.setCriticalDamage(950);
            weapon.setAttackSpeed(10);
            weapon.setBonusProperty(BonusProperty.MAJOR_SWEEPING_EDGE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getCommonBowOne() {
        Weapon weapon = itemService.getWeaponByName("Bone Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Bone Bow");
            weapon.setRarity(Rarity.COMMON);
            weapon.setPng("bows/common-bone-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setValue(15);
            weapon.setDamage(36);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCriticalChance(0);
            weapon.setCriticalDamage(0);
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getCommonBowTwo() {
        Weapon weapon = itemService.getWeaponByName("Old Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Old Bow");
            weapon.setRarity(Rarity.COMMON);
            weapon.setPng("bows/common-old-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setValue(15);
            weapon.setDamage(37);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCriticalChance(5);
            weapon.setCriticalDamage(20);
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getCommonBowThree() {
        Weapon weapon = itemService.getWeaponByName("Birch Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Birch Bow");
            weapon.setRarity(Rarity.COMMON);
            weapon.setPng("bows/common-birch-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setValue(15);
            weapon.setDamage(18);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCriticalChance(8);
            weapon.setCriticalDamage(15);
            weapon.setAttackSpeed(10);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getUnCommonBowOne() {
        Weapon weapon = itemService.getWeaponByName("Fast Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Fast Bow");
            weapon.setRarity(Rarity.UNCOMMON);
            weapon.setPng("bows/uncommon-fast-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setValue(45);
            weapon.setDamage(33);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCriticalChance(10);
            weapon.setCriticalDamage(18);
            weapon.setAttackSpeed(15);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getUnCommonBowTwo() {
        Weapon weapon = itemService.getWeaponByName("Curved Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Curved Bow");
            weapon.setRarity(Rarity.UNCOMMON);
            weapon.setPng("bows/uncommon-curved-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setValue(45);
            weapon.setDamage(50);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCriticalChance(10);
            weapon.setCriticalDamage(20);
            weapon.setAttackSpeed(10);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getUnCommonBowThree() {
        Weapon weapon = itemService.getWeaponByName("Strong Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Strong Bow");
            weapon.setRarity(Rarity.UNCOMMON);
            weapon.setPng("bows/uncommon-strong-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setValue(45);
            weapon.setDamage(85);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCriticalChance(30);
            weapon.setCriticalDamage(65);
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getRareBowOne() {
        Weapon weapon = itemService.getWeaponByName("Curling Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Curling Bow");
            weapon.setRarity(Rarity.RARE);
            weapon.setPng("bows/rare-curling-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setValue(150);
            weapon.setDamage(120);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCriticalChance(20);
            weapon.setCriticalDamage(70);
            weapon.setAttackSpeed(15);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getRareBowTwo() {
        Weapon weapon = itemService.getWeaponByName("Piercing Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Piercing Bow");
            weapon.setRarity(Rarity.RARE);
            weapon.setPng("bows/rare-piercing-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setValue(150);
            weapon.setDamage(250);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCriticalChance(45);
            weapon.setCriticalDamage(90);
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.MINOR_PIERCE_THROUGH);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getRareBowThree() {
        Weapon weapon = itemService.getWeaponByName("Skeleton Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Skeleton Bow");
            weapon.setRarity(Rarity.RARE);
            weapon.setPng("bows/rare-skeleton-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setValue(150);
            weapon.setDamage(160);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCriticalChance(27);
            weapon.setCriticalDamage(150);
            weapon.setAttackSpeed(10);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getEpicBowOne() {
        Weapon weapon = itemService.getWeaponByName("Crossbow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Crossbow");
            weapon.setRarity(Rarity.EPIC);
            weapon.setPng("bows/epic-crossbow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setValue(450);
            weapon.setDamage(650);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCriticalChance(50);
            weapon.setCriticalDamage(350);
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.MINOR_PIERCE_THROUGH);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getEpicBowTwo() {
        Weapon weapon = itemService.getWeaponByName("Frost Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Frost Bow");
            weapon.setRarity(Rarity.EPIC);
            weapon.setPng("bows/epic-frost-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setValue(450);
            weapon.setDamage(300);
            weapon.setDamageType(DamageType.COLD);
            weapon.setCriticalChance(45);
            weapon.setCriticalDamage(220);
            weapon.setAttackSpeed(15);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getEpicBowThree() {
        Weapon weapon = itemService.getWeaponByName("Poison Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Poison Bow");
            weapon.setRarity(Rarity.EPIC);
            weapon.setPng("bows/epic-poison-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setValue(450);
            weapon.setDamage(320);
            weapon.setDamageType(DamageType.POISON);
            weapon.setCriticalChance(40);
            weapon.setCriticalDamage(200);
            weapon.setAttackSpeed(15);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getLegendaryBowOne() {
        Weapon weapon = itemService.getWeaponByName("Grasp Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Grasp Bow");
            weapon.setRarity(Rarity.LEGENDARY);
            weapon.setPng("bows/legendary-grasp-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setValue(900);
            weapon.setDamage(1400);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCriticalChance(80);
            weapon.setCriticalDamage(600);
            weapon.setAttackSpeed(25);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getLegendaryBowTwo() {
        Weapon weapon = itemService.getWeaponByName("Magma Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Magma Bow");
            weapon.setRarity(Rarity.LEGENDARY);
            weapon.setPng("bows/legendary-magma-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setValue(900);
            weapon.setDamage(1200);
            weapon.setDamageType(DamageType.FIRE);
            weapon.setCriticalChance(75);
            weapon.setCriticalDamage(550);
            weapon.setAttackSpeed(20);
            weapon.setBonusProperty(BonusProperty.MAJOR_PIERCE_THROUGH);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getLegendaryBowThree() {
        Weapon weapon = itemService.getWeaponByName("Precision Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Precision Bow");
            weapon.setRarity(Rarity.LEGENDARY);
            weapon.setPng("bows/legendary-precision-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setValue(900);
            weapon.setDamage(1600);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCriticalChance(95);
            weapon.setCriticalDamage(750);
            weapon.setAttackSpeed(15);
            weapon.setBonusProperty(BonusProperty.MAJOR_PIERCE_THROUGH);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getCommonStaffOne() {
        Weapon weapon = itemService.getWeaponByName("Leafy Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Leafy Staff");
            weapon.setRarity(Rarity.COMMON);
            weapon.setPng("staffs/common-leafy-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setValue(15);
            weapon.setSpell(spellFactory.createBaseSpell(50, 1, DamageType.FIRE));
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getCommonStaffTwo() {
        Weapon weapon = itemService.getWeaponByName("Sickle Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Sickle Staff");
            weapon.setRarity(Rarity.COMMON);
            weapon.setPng("staffs/common-sickle-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setValue(15);
            weapon.setSpell(spellFactory.createBaseSpell(55, 1, DamageType.COLD));
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getCommonStaffThree() {
        Weapon weapon = itemService.getWeaponByName("Steel Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Steel Staff");
            weapon.setRarity(Rarity.COMMON);
            weapon.setPng("staffs/common-steel-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setValue(15);
            weapon.setSpell(spellFactory.createBaseSpell(55, 1, DamageType.NECROTIC));
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getUnCommonStaffOne() {
        Weapon weapon = itemService.getWeaponByName("Light and Dark Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Light and Dark Staff");
            weapon.setRarity(Rarity.UNCOMMON);
            weapon.setPng("staffs/uncommon-light&dark-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setValue(45);
            weapon.setSpell(spellFactory.createBaseSpell(150, 2, DamageType.DARK));
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getUnCommonStaffTwo() {
        Weapon weapon = itemService.getWeaponByName("Orb Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Orb Staff");
            weapon.setRarity(Rarity.UNCOMMON);
            weapon.setPng("staffs/uncommon-orb-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setValue(45);
            weapon.setSpell(spellFactory.smallExplosiveSpell(180, 1, DamageType.ACID));
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getUnCommonStaffThree() {
        Weapon weapon = itemService.getWeaponByName("Winged Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Winged Staff");
            weapon.setRarity(Rarity.UNCOMMON);
            weapon.setPng("staffs/uncommon-winged-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setValue(45);
            weapon.setSpell(spellFactory.smallConeSpell(200, 1, DamageType.RADIANT));
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getRareStaffOne() {
        Weapon weapon = itemService.getWeaponByName("Gem Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Gem Staff");
            weapon.setRarity(Rarity.RARE);
            weapon.setPng("staffs/rare-gem-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setValue(150);
            weapon.setDamage(40);
            weapon.setSpell(spellFactory.smallChainSpell(170, 1, DamageType.PSYCHIC));
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getRareStaffTwo() {
        Weapon weapon = itemService.getWeaponByName("Holy Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Holy Staff");
            weapon.setRarity(Rarity.RARE);
            weapon.setPng("staffs/rare-holy-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setValue(150);
            weapon.setDamage(40);
            weapon.setSpell(spellFactory.smallInlineSpell(300, 1, DamageType.FIRE));
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getRareStaffThree() {
        Weapon weapon = itemService.getWeaponByName("Sea Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Sea Staff");
            weapon.setRarity(Rarity.RARE);
            weapon.setPng("staffs/rare-sea-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setValue(150);
            weapon.setSpell(spellFactory.smallExplosiveSpell(260, 1, DamageType.COLD));
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getEpicStaffOne() {
        Weapon weapon = itemService.getWeaponByName("Cobra Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Cobra Staff");
            weapon.setRarity(Rarity.EPIC);
            weapon.setPng("staffs/epic-cobra-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setValue(450);
            weapon.setSpell(spellFactory.largeConeSpell(550, 1, DamageType.POISON));
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getEpicStaffTwo() {
        Weapon weapon = itemService.getWeaponByName("Elder Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Elder Staff");
            weapon.setRarity(Rarity.EPIC);
            weapon.setPng("staffs/epic-elder-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setValue(450);
            weapon.setSpell(spellFactory.smallChainSpell(400, 4, DamageType.LIGHTNING));
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getEpicStaffThree() {
        Weapon weapon = itemService.getWeaponByName("Necrotic Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Necrotic Staff");
            weapon.setRarity(Rarity.EPIC);
            weapon.setPng("staffs/epic-necrotic-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setValue(450);
            weapon.setSpell(spellFactory.largeExplosiveSpell(550, 1, DamageType.NECROTIC));
            weapon.setAttackSpeed(5);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getLegendaryStaffOne() {
        Weapon weapon = itemService.getWeaponByName("Fire Tentacle Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Fire Tentacle Staff");
            weapon.setRarity(Rarity.LEGENDARY);
            weapon.setPng("staffs/legendary-fireTentacle-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setValue(900);
            weapon.setSpell(spellFactory.largeInlineSpell(1800, 2, DamageType.FIRE));
            weapon.setAttackSpeed(10);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getLegendaryStaffTwo() {
        Weapon weapon = itemService.getWeaponByName("Naga Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Naga Staff");
            weapon.setRarity(Rarity.LEGENDARY);
            weapon.setPng("staffs/legendary-naga-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setValue(900);
            weapon.setSpell(spellFactory.largeChainSpell(1400, 3, DamageType.ACID));
            weapon.setAttackSpeed(10);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }

    public Weapon getLegendaryStaffThree() {
        Weapon weapon = itemService.getWeaponByName("Syphon Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Syphon Staff");
            weapon.setRarity(Rarity.LEGENDARY);
            weapon.setPng("staffs/legendary-syphon-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setValue(900);
            weapon.setSpell(spellFactory.createBaseSpell(1600, 5, DamageType.NECROTIC));
            weapon.setAttackSpeed(10);
            weapon.setBonusProperty(BonusProperty.NONE);
            itemService.saveWeapon(weapon);
        }
        return weapon;
    }
}
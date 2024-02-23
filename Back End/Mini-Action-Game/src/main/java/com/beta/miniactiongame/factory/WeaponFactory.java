package com.beta.miniactiongame.factory;

import com.beta.miniactiongame.model.item.DamageType;
import com.beta.miniactiongame.model.item.ItemType;
import com.beta.miniactiongame.model.item.Rarity;
import com.beta.miniactiongame.model.item.Weapon;
import com.beta.miniactiongame.service.WeaponService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WeaponFactory {

    private final WeaponService weaponService;

    //Blueprint of common sword(dps=14.00).
    public Weapon getCommonSwordOne() {
        Weapon weapon = weaponService.getWeaponByName("Black sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Black sword");
            weapon.setRarity(Rarity.COMMON);
            weapon.setPng("swords/common-black-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setDamage(14);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCritChance(0);
            weapon.setCritDamage(0);
            weapon.setAttackSpeed(10);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of common sword(dps=14.50).
    public Weapon getCommonSwordTwo() {
        Weapon weapon = weaponService.getWeaponByName("Bear sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Bear sword");
            weapon.setRarity(Rarity.COMMON);
            weapon.setPng("swords/common-bear-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setDamage(27);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCritChance(10);
            weapon.setCritDamage(20);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of common sword(dps=14.45).
    public Weapon getCommonSwordThree() {
        Weapon weapon = weaponService.getWeaponByName("Red metal sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Red metal sword");
            weapon.setRarity(Rarity.COMMON);
            weapon.setPng("swords/common-redMetal-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setDamage(14);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCritChance(3);
            weapon.setCritDamage(15);
            weapon.setAttackSpeed(10);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
            }
        return weapon;
    }

    //Blueprint of uncommon sword(dps=49.00).
    public Weapon getUnCommonSwordOne() {
        Weapon weapon = weaponService.getWeaponByName("Ancient sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Ancient sword");
            weapon.setRarity(Rarity.UNCOMMON);
            weapon.setPng("swords/uncommon-ancient-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setDamage(45);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCritChance(20);
            weapon.setCritDamage(20);
            weapon.setAttackSpeed(10);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of uncommon sword(dps=48.75).
    public Weapon getUnCommonSwordTwo() {
        Weapon weapon = weaponService.getWeaponByName("Bone sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Bone sword");
            weapon.setRarity(Rarity.UNCOMMON);
            weapon.setPng("swords/uncommon-bone-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setDamage(31);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCritChance(10);
            weapon.setCritDamage(15);
            weapon.setAttackSpeed(15);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of uncommon sword(dps=48.75).
    public Weapon getUnCommonSwordThree() {
        Weapon weapon = weaponService.getWeaponByName("Eagle sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Eagle sword");
            weapon.setRarity(Rarity.UNCOMMON);
            weapon.setPng("swords/uncommon-eagle-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setDamage(30);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCritChance(10);
            weapon.setCritDamage(25);
            weapon.setAttackSpeed(15);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of rare sword(dps=150.00).
    public Weapon getRareSwordOne() {
        Weapon weapon = weaponService.getWeaponByName("Cursed sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Cursed sword");
            weapon.setRarity(Rarity.RARE);
            weapon.setPng("swords/rare-cursed-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setDamage(90);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCritChance(25);
            weapon.setCritDamage(40);
            weapon.setAttackSpeed(15);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of rare sword(dps=150.00).
    public Weapon getRareSwordTwo() {
        Weapon weapon = weaponService.getWeaponByName("Executioner sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Executioner sword");
            weapon.setRarity(Rarity.RARE);
            weapon.setPng("swords/rare-executioner-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setDamage(130);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCritChance(25);
            weapon.setCritDamage(80);
            weapon.setAttackSpeed(10);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of rare sword(dps=150.00).
    public Weapon getRareSwordThree() {
        Weapon weapon = weaponService.getWeaponByName("Necrotic sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Necrotic sword");
            weapon.setRarity(Rarity.RARE);
            weapon.setPng("swords/rare-necrotic-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setDamage(135);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCritChance(30);
            weapon.setCritDamage(50);
            weapon.setAttackSpeed(10);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of epic sword(dps=453.75).
    public Weapon getEpicSwordOne() {
        Weapon weapon = weaponService.getWeaponByName("Head splashing Hammer");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Head splashing Hammer");
            weapon.setRarity(Rarity.EPIC);
            weapon.setPng("swords/epic-headSplashing-hammer.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setDamage(750);
            weapon.setDamageType(DamageType.BLUDGEONING);
            weapon.setCritChance(35);
            weapon.setCritDamage(450);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of epic sword(dps=300.00*).
    public Weapon getEpicSwordTwo() {
        Weapon weapon = weaponService.getWeaponByName("Heroic Axe");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Heroic Axe");
            weapon.setRarity(Rarity.EPIC);
            weapon.setPng("swords/epic-heroic-axe.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setDamage(260);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCritChance(40);
            weapon.setCritDamage(100);
            weapon.setAttackSpeed(10);
            weapon.setAoeDamage(true);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of epic sword(dps=293.25*).
    public Weapon getEpicSwordThree() {
        Weapon weapon = weaponService.getWeaponByName("Magma Axe");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Magma Axe");
            weapon.setRarity(Rarity.EPIC);
            weapon.setPng("swords/epic-magma-axe.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setDamage(255);
            weapon.setDamageType(DamageType.FIRE);
            weapon.setCritChance(15);
            weapon.setCritDamage(255);
            weapon.setAttackSpeed(10);
            weapon.setAoeDamage(true);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of legendary sword(dps=2420.00*).
    public Weapon getLegendarySwordOne() {
        Weapon weapon = weaponService.getWeaponByName("Demonic Spear");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Demonic Spear");
            weapon.setRarity(Rarity.LEGENDARY);
            weapon.setPng("swords/legendary-demonic-spear.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setDamage(700);
            weapon.setDamageType(DamageType.POISON);
            weapon.setCritChance(85);
            weapon.setCritDamage(600);
            weapon.setAttackSpeed(20);
            weapon.setAoeDamage(true);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of legendary sword(dps=3945.00).
    public Weapon getLegendarySwordTwo() {
        Weapon weapon = weaponService.getWeaponByName("Samurai Sword");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Samurai Sword");
            weapon.setRarity(Rarity.LEGENDARY);
            weapon.setPng("swords/legendary-samurai-sword.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setDamage(1000);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCritChance(90);
            weapon.setCritDamage(350);
            weapon.setAttackSpeed(30);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of legendary sword(dps=2590.50*).
    public Weapon getLegendarySwordThree() {
        Weapon weapon = weaponService.getWeaponByName("Demonic Scythe");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Demonic Scythe");
            weapon.setRarity(Rarity.LEGENDARY);
            weapon.setPng("swords/legendary-demonic-scythe.png");
            weapon.setItemType(ItemType.SWORD);
            weapon.setDamage(1650);
            weapon.setDamageType(DamageType.SLASHING);
            weapon.setCritChance(99);
            weapon.setCritDamage(950);
            weapon.setAttackSpeed(10);
            weapon.setAoeDamage(true);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of common bow(dps=18,00).
    public Weapon getCommonBowOne() {
        Weapon weapon = weaponService.getWeaponByName("Bone Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Bone Bow");
            weapon.setRarity(Rarity.COMMON);
            weapon.setPng("bows/common-bone-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setDamage(36);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCritChance(0);
            weapon.setCritDamage(0);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of common bow(dps=19.00).
    public Weapon getCommonBowTwo() {
        Weapon weapon = weaponService.getWeaponByName("Old Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Old Bow");
            weapon.setRarity(Rarity.COMMON);
            weapon.setPng("bows/common-old-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setDamage(37);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCritChance(5);
            weapon.setCritDamage(20);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of common bow(dps=19.20).
    public Weapon getCommonBowThree() {
        Weapon weapon = weaponService.getWeaponByName("Birch Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Birch Bow");
            weapon.setRarity(Rarity.COMMON);
            weapon.setPng("bows/common-birch-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setDamage(18);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCritChance(8);
            weapon.setCritDamage(15);
            weapon.setAttackSpeed(10);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of uncommon bow(dps=52.20).
    public Weapon getUnCommonBowOne() {
        Weapon weapon = weaponService.getWeaponByName("Fast Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Fast Bow");
            weapon.setRarity(Rarity.UNCOMMON);
            weapon.setPng("bows/uncommon-fast-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setDamage(33);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCritChance(10);
            weapon.setCritDamage(18);
            weapon.setAttackSpeed(15);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of uncommon bow(dps=52.00).
    public Weapon getUnCommonBowTwo() {
        Weapon weapon = weaponService.getWeaponByName("Curved Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Curved Bow");
            weapon.setRarity(Rarity.UNCOMMON);
            weapon.setPng("bows/uncommon-curved-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setDamage(50);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCritChance(10);
            weapon.setCritDamage(20);
            weapon.setAttackSpeed(10);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of uncommon bow(dps=52.25).
    public Weapon getUnCommonBowThree() {
        Weapon weapon = weaponService.getWeaponByName("Strong Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Strong Bow");
            weapon.setRarity(Rarity.UNCOMMON);
            weapon.setPng("bows/uncommon-strong-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setDamage(85);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCritChance(30);
            weapon.setCritDamage(65);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of rare bow(dps=201.00).
    public Weapon getRareBowOne() {
        Weapon weapon = weaponService.getWeaponByName("Curling Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Curling Bow");
            weapon.setRarity(Rarity.RARE);
            weapon.setPng("bows/rare-curling-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setDamage(120);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCritChance(20);
            weapon.setCritDamage(70);
            weapon.setAttackSpeed(15);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of rare bow(dps=145.25*).
    public Weapon getRareBowTwo() {
        Weapon weapon = weaponService.getWeaponByName("Piercing Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Piercing Bow");
            weapon.setRarity(Rarity.RARE);
            weapon.setPng("bows/rare-piercing-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setDamage(250);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCritChance(45);
            weapon.setCritDamage(90);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(true);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of rare bow(dps=200.50).
    public Weapon getRareBowThree() {
        Weapon weapon = weaponService.getWeaponByName("Skeleton Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Skeleton Bow");
            weapon.setRarity(Rarity.RARE);
            weapon.setPng("bows/rare-skeleton-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setDamage(160);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCritChance(27);
            weapon.setCritDamage(150);
            weapon.setAttackSpeed(10);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of epic bow(dps=412.50*).
    public Weapon getEpicBowOne() {
        Weapon weapon = weaponService.getWeaponByName("Crossbow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Crossbow");
            weapon.setRarity(Rarity.EPIC);
            weapon.setPng("bows/epic-crossbow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setDamage(650);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCritChance(50);
            weapon.setCritDamage(350);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(true);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of epic bow(dps=598.50).
    public Weapon getEpicBowTwo() {
        Weapon weapon = weaponService.getWeaponByName("Frost Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Frost Bow");
            weapon.setRarity(Rarity.EPIC);
            weapon.setPng("bows/epic-frost-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setDamage(300);
            weapon.setDamageType(DamageType.COLD);
            weapon.setCritChance(45);
            weapon.setCritDamage(220);
            weapon.setAttackSpeed(15);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of epic bow(dps=600.00).
    public Weapon getEpicBowThree() {
        Weapon weapon = weaponService.getWeaponByName("Poison Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Poison Bow");
            weapon.setRarity(Rarity.EPIC);
            weapon.setPng("bows/epic-poison-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setDamage(320);
            weapon.setDamageType(DamageType.POISON);
            weapon.setCritChance(40);
            weapon.setCritDamage(200);
            weapon.setAttackSpeed(15);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of legendary bow(dps=4700.00).
    public Weapon getLegendaryBowOne() {
        Weapon weapon = weaponService.getWeaponByName("Grasp Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Grasp Bow");
            weapon.setRarity(Rarity.LEGENDARY);
            weapon.setPng("bows/legendary-grasp-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setDamage(1400);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCritChance(80);
            weapon.setCritDamage(600);
            weapon.setAttackSpeed(25);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of legendary bow(dps=3225.00*).
    public Weapon getLegendaryBowTwo() {
        Weapon weapon = weaponService.getWeaponByName("Magma Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Magma Bow");
            weapon.setRarity(Rarity.LEGENDARY);
            weapon.setPng("bows/legendary-magma-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setDamage(1200);
            weapon.setDamageType(DamageType.FIRE);
            weapon.setCritChance(75);
            weapon.setCritDamage(550);
            weapon.setAttackSpeed(20);
            weapon.setAoeDamage(true);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of legendary bow(dps=3468.75*).
    public Weapon getLegendaryBowThree() {
        Weapon weapon = weaponService.getWeaponByName("Precision Bow");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Precision Bow");
            weapon.setRarity(Rarity.LEGENDARY);
            weapon.setPng("bows/legendary-precision-bow.png");
            weapon.setItemType(ItemType.BOW);
            weapon.setDamage(1600);
            weapon.setDamageType(DamageType.PIERCING);
            weapon.setCritChance(95);
            weapon.setCritDamage(750);
            weapon.setAttackSpeed(15);
            weapon.setAoeDamage(true);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of common staff(dps=20.00).
    public Weapon getCommonStaffOne() {
        Weapon weapon = weaponService.getWeaponByName("Leafy Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Leafy Staff");
            weapon.setRarity(Rarity.COMMON);
            weapon.setPng("staffs/common-leafy-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setDamage(40);
            weapon.setDamageType(DamageType.BLUDGEONING);
            weapon.setCritChance(0);
            weapon.setCritDamage(0);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of common staff(dps=20.00).
    public Weapon getCommonStaffTwo() {
        Weapon weapon = weaponService.getWeaponByName("Sickle Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Sickle Staff");
            weapon.setRarity(Rarity.COMMON);
            weapon.setPng("staffs/common-sickle-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setDamage(40);
            weapon.setDamageType(DamageType.BLUDGEONING);
            weapon.setCritChance(0);
            weapon.setCritDamage(0);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of common staff(dps=20.00).
    public Weapon getCommonStaffThree() {
        Weapon weapon = weaponService.getWeaponByName("Steel Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Steel Staff");
            weapon.setRarity(Rarity.COMMON);
            weapon.setPng("staffs/common-steel-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setDamage(40);
            weapon.setDamageType(DamageType.BLUDGEONING);
            weapon.setCritChance(0);
            weapon.setCritDamage(0);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of uncommon staff(dps=20.20).
    public Weapon getUnCommonStaffOne() {
        Weapon weapon = weaponService.getWeaponByName("Light and Dark Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Light and Dark Staff");
            weapon.setRarity(Rarity.UNCOMMON);
            weapon.setPng("staffs/uncommon-light&dark-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setDamage(40);
            weapon.setDamageType(DamageType.BLUDGEONING);
            weapon.setCritChance(1);
            weapon.setCritDamage(40);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of uncommon staff(dps=20.20).
    public Weapon getUnCommonStaffTwo() {
        Weapon weapon = weaponService.getWeaponByName("Orb Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Orb Staff");
            weapon.setRarity(Rarity.UNCOMMON);
            weapon.setPng("staffs/uncommon-orb-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setDamage(40);
            weapon.setDamageType(DamageType.BLUDGEONING);
            weapon.setCritChance(1);
            weapon.setCritDamage(40);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of uncommon staff(dps=20.20).
    public Weapon getUnCommonStaffThree() {
        Weapon weapon = weaponService.getWeaponByName("Winged Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Winged Staff");
            weapon.setRarity(Rarity.UNCOMMON);
            weapon.setPng("staffs/uncommon-winged-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setDamage(40);
            weapon.setDamageType(DamageType.BLUDGEONING);
            weapon.setCritChance(1);
            weapon.setCritDamage(40);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of rare staff(dps=21.00).
    public Weapon getRareStaffOne() {
        Weapon weapon = weaponService.getWeaponByName("Gem Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Gem Staff");
            weapon.setRarity(Rarity.RARE);
            weapon.setPng("staffs/rare-gem-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setDamage(40);
            weapon.setDamageType(DamageType.BLUDGEONING);
            weapon.setCritChance(5);
            weapon.setCritDamage(40);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of rare staff(dps=21.00).
    public Weapon getRareStaffTwo() {
        Weapon weapon = weaponService.getWeaponByName("Holy Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Holy Staff");
            weapon.setRarity(Rarity.RARE);
            weapon.setPng("staffs/rare-holy-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setDamage(40);
            weapon.setDamageType(DamageType.BLUDGEONING);
            weapon.setCritChance(5);
            weapon.setCritDamage(40);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of rare staff(dps=).
    public Weapon getRareStaffThree() {
        Weapon weapon = weaponService.getWeaponByName("Sea Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Sea Staff");
            weapon.setRarity(Rarity.RARE);
            weapon.setPng("staffs/rare-sea-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setDamage(40);
            weapon.setDamageType(DamageType.BLUDGEONING);
            weapon.setCritChance(5);
            weapon.setCritDamage(40);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of epic staff(dps=30.00).
    public Weapon getEpicStaffOne() {
        Weapon weapon = weaponService.getWeaponByName("Cobra Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Cobra Staff");
            weapon.setRarity(Rarity.EPIC);
            weapon.setPng("staffs/epic-cobra-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setDamage(40);
            weapon.setDamageType(DamageType.BLUDGEONING);
            weapon.setCritChance(50);
            weapon.setCritDamage(40);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of epic staff(dps=30.00).
    public Weapon getEpicStaffTwo() {
        Weapon weapon = weaponService.getWeaponByName("Elder Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Elder Staff");
            weapon.setRarity(Rarity.EPIC);
            weapon.setPng("staffs/epic-elder-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setDamage(40);
            weapon.setDamageType(DamageType.BLUDGEONING);
            weapon.setCritChance(50);
            weapon.setCritDamage(40);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of epic staff(dps=30.00).
    public Weapon getEpicStaffThree() {
        Weapon weapon = weaponService.getWeaponByName("Necrotic Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Necrotic Staff");
            weapon.setRarity(Rarity.EPIC);
            weapon.setPng("staffs/epic-necrotic-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setDamage(40);
            weapon.setDamageType(DamageType.BLUDGEONING);
            weapon.setCritChance(50);
            weapon.setCritDamage(40);
            weapon.setAttackSpeed(5);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of legendary staff(dps=80.00).
    public Weapon getLegendaryStaffOne() {
        Weapon weapon = weaponService.getWeaponByName("Fire Tentacle Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Fire Tentacle Staff");
            weapon.setRarity(Rarity.LEGENDARY);
            weapon.setPng("staffs/legendary-fireTentacle-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setDamage(40);
            weapon.setDamageType(DamageType.FIRE);
            weapon.setCritChance(100);
            weapon.setCritDamage(40);
            weapon.setAttackSpeed(10);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of legendary staff(dps=80.00).
    public Weapon getLegendaryStaffTwo() {
        Weapon weapon = weaponService.getWeaponByName("Naga Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Naga Staff");
            weapon.setRarity(Rarity.LEGENDARY);
            weapon.setPng("staffs/legendary-naga-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setDamage(40);
            weapon.setDamageType(DamageType.FIRE);
            weapon.setCritChance(100);
            weapon.setCritDamage(40);
            weapon.setAttackSpeed(10);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }

    //Blueprint of legendary staff(dps=30.00).
    public Weapon getLegendaryStaffThree() {
        Weapon weapon = weaponService.getWeaponByName("Syphon Staff");
        if (weapon == null) {
            weapon = new Weapon();
            weapon.setName("Syphon Staff");
            weapon.setRarity(Rarity.LEGENDARY);
            weapon.setPng("staffs/legendary-syphon-staff.png");
            weapon.setItemType(ItemType.STAFF);
            weapon.setDamage(40);
            weapon.setDamageType(DamageType.POISON);
            weapon.setCritChance(100);
            weapon.setCritDamage(40);
            weapon.setAttackSpeed(10);
            weapon.setAoeDamage(false);
            weaponService.saveWeapon(weapon);
        }
        return weapon;
    }
}

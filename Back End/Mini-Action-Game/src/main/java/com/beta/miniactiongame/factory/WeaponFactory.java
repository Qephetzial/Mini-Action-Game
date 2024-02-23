package com.beta.miniactiongame.factory;

import com.beta.miniactiongame.model.item.DamageType;
import com.beta.miniactiongame.model.item.ItemType;
import com.beta.miniactiongame.model.item.Rarity;
import com.beta.miniactiongame.model.item.Weapon;
import lombok.experimental.UtilityClass;

@UtilityClass
/*This class is the collection of weapon blueprints.
(dps=damage per second, it's an estimated value that how much damage the weapon will cause as an average.
The formula is "(100 * damage + crit chance * crit damage) / 100 * (attack speed / 10)."
*The value calculated as a single target so weapons with aoe damage in game can cause way more damage)*/
public final class WeaponFactory {
    public static final Weapon commonSwordOne = createCommonSwordOne();
    public static final Weapon commonSwordTwo = createCommonSwordTwo();
    public static final Weapon commonSwordThree = createCommonSwordThree();
    public static final Weapon commonBowOne = createCommonBowOne();
    public static final Weapon commonBowTwo = createCommonBowTwo();
    public static final Weapon commonBowThree = createCommonBowThree();
    public static final Weapon commonStaffOne = createCommonStaffOne();
    public static final Weapon commonStaffTwo = createCommonStaffTwo();
    public static final Weapon commonStaffThree = createCommonStaffThree();
    public static final Weapon unCommonSwordOne = createUnCommonSwordOne();
    public static final Weapon unCommonSwordTwo = createUnCommonSwordTwo();
    public static final Weapon unCommonSwordThree = createUnCommonSwordThree();
    public static final Weapon unCommonBowOne = createUnCommonBowOne();
    public static final Weapon unCommonBowTwo = createUnCommonBowTwo();
    public static final Weapon unCommonBowThree = createUnCommonBowThree();
    public static final Weapon unCommonStaffOne = createUnCommonStaffOne();
    public static final Weapon unCommonStaffTwo = createUnCommonStaffTwo();
    public static final Weapon unCommonStaffThree = createUnCommonStaffThree();
    public static final Weapon rareSwordOne = createRareSwordOne();
    public static final Weapon rareSwordTwo = createRareSwordTwo();
    public static final Weapon rareSwordThree = createRareSwordThree();
    public static final Weapon rareBowOne = createRareBowOne();
    public static final Weapon rareBowTwo = createRareBowTwo();
    public static final Weapon rareBowThree = createRareBowThree();
    public static final Weapon rareStaffOne = createRareStaffOne();
    public static final Weapon rareStaffTwo = createRareStaffTwo();
    public static final Weapon rareStaffThree = createRareStaffThree();
    public static final Weapon epicSwordOne = createEpicSwordOne();
    public static final Weapon epicSwordTwo = createEpicSwordTwo();
    public static final Weapon epicSwordThree = createEpicSwordThree();
    public static final Weapon epicBowOne = createEpicBowOne();
    public static final Weapon epicBowTwo = createEpicBowTwo();
    public static final Weapon epicBowThree = createEpicBowThree();
    public static final Weapon epicStaffOne = createEpicStaffOne();
    public static final Weapon epicStaffTwo = createEpicStaffTwo();
    public static final Weapon epicStaffThree = createEpicStaffThree();
    public static final Weapon legendarySwordOne = createLegendarySwordOne();
    public static final Weapon legendarySwordTwo = createLegendarySwordTwo();
    public static final Weapon legendarySwordThree = createLegendarySwordThree();
    public static final Weapon legendaryBowOne = createLegendaryBowOne();
    public static final Weapon legendaryBowTwo = createLegendaryBowTwo();
    public static final Weapon legendaryBowThree = createLegendaryBowThree();
    public static final Weapon legendaryStaffOne = createLegendaryStaffOne();
    public static final Weapon legendaryStaffTwo = createLegendaryStaffTwo();
    public static final Weapon legendaryStaffThree = createLegendaryStaffThree();

    //Blueprint of common sword(dps=14.00).
    private static Weapon createCommonSwordOne() {
        Weapon sword = new Weapon();
        sword.setName("Black sword");
        sword.setRarity(Rarity.COMMON);
        sword.setPng("swords/common-black-sword.png");
        sword.setItemType(ItemType.SWORD);
        sword.setDamage(14);
        sword.setDamageType(DamageType.SLASHING);
        sword.setCritChance(0);
        sword.setCritDamage(0);
        sword.setAttackSpeed(10);
        sword.setAoeDamage(false);
        return sword;
    }

    //Blueprint of common sword(dps=14.50).
    private static Weapon createCommonSwordTwo() {
        Weapon sword = new Weapon();
        sword.setName("Bear sword");
        sword.setRarity(Rarity.COMMON);
        sword.setPng("swords/common-bear-sword.png");
        sword.setItemType(ItemType.SWORD);
        sword.setDamage(27);
        sword.setDamageType(DamageType.SLASHING);
        sword.setCritChance(10);
        sword.setCritDamage(20);
        sword.setAttackSpeed(5);
        sword.setAoeDamage(false);
        return sword;
    }

    //Blueprint of common sword(dps=14.45).
    private static Weapon createCommonSwordThree() {
        Weapon sword = new Weapon();
        sword.setName("Red metal sword");
        sword.setRarity(Rarity.COMMON);
        sword.setPng("swords/common-redMetal-sword.png");
        sword.setItemType(ItemType.SWORD);
        sword.setDamage(14);
        sword.setDamageType(DamageType.SLASHING);
        sword.setCritChance(3);
        sword.setCritDamage(15);
        sword.setAttackSpeed(10);
        sword.setAoeDamage(false);
        return sword;
    }

    //Blueprint of uncommon sword(dps=49.00).
    private static Weapon createUnCommonSwordOne() {
        Weapon sword = new Weapon();
        sword.setName("Ancient sword");
        sword.setRarity(Rarity.UNCOMMON);
        sword.setPng("swords/uncommon-ancient-sword.png");
        sword.setItemType(ItemType.SWORD);
        sword.setDamage(45);
        sword.setDamageType(DamageType.SLASHING);
        sword.setCritChance(20);
        sword.setCritDamage(20);
        sword.setAttackSpeed(10);
        sword.setAoeDamage(false);
        return sword;
    }

    //Blueprint of uncommon sword(dps=48.75).
    private static Weapon createUnCommonSwordTwo() {
        Weapon sword = new Weapon();
        sword.setName("Bone sword");
        sword.setRarity(Rarity.UNCOMMON);
        sword.setPng("swords/uncommon-bone-sword.png");
        sword.setItemType(ItemType.SWORD);
        sword.setDamage(31);
        sword.setDamageType(DamageType.SLASHING);
        sword.setCritChance(10);
        sword.setCritDamage(15);
        sword.setAttackSpeed(15);
        sword.setAoeDamage(false);
        return sword;
    }

    //Blueprint of uncommon sword(dps=48.75).
    private static Weapon createUnCommonSwordThree() {
        Weapon sword = new Weapon();
        sword.setName("Eagle sword");
        sword.setRarity(Rarity.UNCOMMON);
        sword.setPng("swords/uncommon-eagle-sword.png");
        sword.setItemType(ItemType.SWORD);
        sword.setDamage(30);
        sword.setDamageType(DamageType.SLASHING);
        sword.setCritChance(10);
        sword.setCritDamage(25);
        sword.setAttackSpeed(15);
        sword.setAoeDamage(false);
        return sword;
    }

    //Blueprint of rare sword(dps=150.00).
    private static Weapon createRareSwordOne() {
        Weapon sword = new Weapon();
        sword.setName("Cursed sword");
        sword.setRarity(Rarity.RARE);
        sword.setPng("swords/rare-cursed-sword.png");
        sword.setItemType(ItemType.SWORD);
        sword.setDamage(90);
        sword.setDamageType(DamageType.SLASHING);
        sword.setCritChance(25);
        sword.setCritDamage(40);
        sword.setAttackSpeed(15);
        sword.setAoeDamage(false);
        return sword;
    }

    //Blueprint of rare sword(dps=150.00).
    private static Weapon createRareSwordTwo() {
        Weapon sword = new Weapon();
        sword.setName("Executioner sword");
        sword.setRarity(Rarity.RARE);
        sword.setPng("swords/rare-executioner-sword.png");
        sword.setItemType(ItemType.SWORD);
        sword.setDamage(130);
        sword.setDamageType(DamageType.SLASHING);
        sword.setCritChance(25);
        sword.setCritDamage(80);
        sword.setAttackSpeed(10);
        sword.setAoeDamage(false);
        return sword;
    }

    //Blueprint of rare sword(dps=150.00).
    private static Weapon createRareSwordThree() {
        Weapon sword = new Weapon();
        sword.setName("Necrotic sword");
        sword.setRarity(Rarity.RARE);
        sword.setPng("swords/rare-necrotic-sword.png");
        sword.setItemType(ItemType.SWORD);
        sword.setDamage(135);
        sword.setDamageType(DamageType.SLASHING);
        sword.setCritChance(30);
        sword.setCritDamage(50);
        sword.setAttackSpeed(10);
        sword.setAoeDamage(false);
        return sword;
    }

    //Blueprint of epic sword(dps=453.75).
    private static Weapon createEpicSwordOne() {
        Weapon sword = new Weapon();
        sword.setName("Head splashing Hammer");
        sword.setRarity(Rarity.EPIC);
        sword.setPng("swords/epic-headSplashing-hammer.png");
        sword.setItemType(ItemType.SWORD);
        sword.setDamage(750);
        sword.setDamageType(DamageType.BLUDGEONING);
        sword.setCritChance(35);
        sword.setCritDamage(450);
        sword.setAttackSpeed(5);
        sword.setAoeDamage(false);
        return sword;
    }

    //Blueprint of epic sword(dps=300.00*).
    private static Weapon createEpicSwordTwo() {
        Weapon sword = new Weapon();
        sword.setName("Heroic Axe");
        sword.setRarity(Rarity.EPIC);
        sword.setPng("swords/epic-heroic-axe.png");
        sword.setItemType(ItemType.SWORD);
        sword.setDamage(260);
        sword.setDamageType(DamageType.SLASHING);
        sword.setCritChance(40);
        sword.setCritDamage(100);
        sword.setAttackSpeed(10);
        sword.setAoeDamage(true);
        return sword;
    }

    //Blueprint of epic sword(dps=293.25*).
    private static Weapon createEpicSwordThree() {
        Weapon sword = new Weapon();
        sword.setName("Magma Axe");
        sword.setRarity(Rarity.EPIC);
        sword.setPng("swords/epic-magma-axe.png");
        sword.setItemType(ItemType.SWORD);
        sword.setDamage(255);
        sword.setDamageType(DamageType.FIRE);
        sword.setCritChance(15);
        sword.setCritDamage(255);
        sword.setAttackSpeed(10);
        sword.setAoeDamage(true);
        return sword;
    }

    //Blueprint of legendary sword(dps=2420.00*).
    private static Weapon createLegendarySwordOne() {
        Weapon sword = new Weapon();
        sword.setName("Demonic Spear");
        sword.setRarity(Rarity.LEGENDARY);
        sword.setPng("swords/legendary-demonic-spear.png");
        sword.setItemType(ItemType.SWORD);
        sword.setDamage(700);
        sword.setDamageType(DamageType.POISON);
        sword.setCritChance(85);
        sword.setCritDamage(600);
        sword.setAttackSpeed(20);
        sword.setAoeDamage(true);
        return sword;
    }

    //Blueprint of legendary sword(dps=3945.00).
    private static Weapon createLegendarySwordTwo() {
        Weapon sword = new Weapon();
        sword.setName("Samurai Sword");
        sword.setRarity(Rarity.LEGENDARY);
        sword.setPng("swords/legendary-samurai-sword.png");
        sword.setItemType(ItemType.SWORD);
        sword.setDamage(1000);
        sword.setDamageType(DamageType.SLASHING);
        sword.setCritChance(90);
        sword.setCritDamage(350);
        sword.setAttackSpeed(30);
        sword.setAoeDamage(false);
        return sword;
    }

    //Blueprint of legendary sword(dps=2590.50*).
    private static Weapon createLegendarySwordThree() {
        Weapon sword = new Weapon();
        sword.setName("Demonic Scythe");
        sword.setRarity(Rarity.LEGENDARY);
        sword.setPng("swords/legendary-demonic-scythe.png");
        sword.setItemType(ItemType.SWORD);
        sword.setDamage(1650);
        sword.setDamageType(DamageType.SLASHING);
        sword.setCritChance(99);
        sword.setCritDamage(950);
        sword.setAttackSpeed(10);
        sword.setAoeDamage(true);
        return sword;
    }

    //Blueprint of common bow(dps=18,00).
    private static Weapon createCommonBowOne() {
        Weapon bow = new Weapon();
        bow.setName("Bone Bow");
        bow.setRarity(Rarity.COMMON);
        bow.setPng("bows/common-bone-bow.png");
        bow.setItemType(ItemType.BOW);
        bow.setDamage(36);
        bow.setDamageType(DamageType.PIERCING);
        bow.setCritChance(0);
        bow.setCritDamage(0);
        bow.setAttackSpeed(5);
        bow.setAoeDamage(false);
        return bow;
    }

    //Blueprint of common bow(dps=19.00).
    private static Weapon createCommonBowTwo() {
        Weapon bow = new Weapon();
        bow.setName("Old Bow");
        bow.setRarity(Rarity.COMMON);
        bow.setPng("bows/common-old-bow.png");
        bow.setItemType(ItemType.BOW);
        bow.setDamage(37);
        bow.setDamageType(DamageType.PIERCING);
        bow.setCritChance(5);
        bow.setCritDamage(20);
        bow.setAttackSpeed(5);
        bow.setAoeDamage(false);
        return bow;
    }

    //Blueprint of common bow(dps=19.20).
    private static Weapon createCommonBowThree() {
        Weapon bow = new Weapon();
        bow.setName("Birch Bow");
        bow.setRarity(Rarity.COMMON);
        bow.setPng("bows/common-birch-bow.png");
        bow.setItemType(ItemType.BOW);
        bow.setDamage(18);
        bow.setDamageType(DamageType.PIERCING);
        bow.setCritChance(8);
        bow.setCritDamage(15);
        bow.setAttackSpeed(10);
        bow.setAoeDamage(false);
        return bow;
    }

    //Blueprint of uncommon bow(dps=52.20).
    private static Weapon createUnCommonBowOne() {
        Weapon bow = new Weapon();
        bow.setName("Fast Bow");
        bow.setRarity(Rarity.UNCOMMON);
        bow.setPng("bows/uncommon-fast-bow.png");
        bow.setItemType(ItemType.BOW);
        bow.setDamage(33);
        bow.setDamageType(DamageType.PIERCING);
        bow.setCritChance(10);
        bow.setCritDamage(18);
        bow.setAttackSpeed(15);
        bow.setAoeDamage(false);
        return bow;
    }

    //Blueprint of uncommon bow(dps=52.00).
    private static Weapon createUnCommonBowTwo() {
        Weapon bow = new Weapon();
        bow.setName("Curved Bow");
        bow.setRarity(Rarity.UNCOMMON);
        bow.setPng("bows/uncommon-curved-bow.png");
        bow.setItemType(ItemType.BOW);
        bow.setDamage(50);
        bow.setDamageType(DamageType.PIERCING);
        bow.setCritChance(10);
        bow.setCritDamage(20);
        bow.setAttackSpeed(10);
        bow.setAoeDamage(false);
        return bow;
    }

    //Blueprint of uncommon bow(dps=52.25).
    private static Weapon createUnCommonBowThree() {
        Weapon bow = new Weapon();
        bow.setName("Strong Bow");
        bow.setRarity(Rarity.UNCOMMON);
        bow.setPng("bows/uncommon-strong-bow.png");
        bow.setItemType(ItemType.BOW);
        bow.setDamage(85);
        bow.setDamageType(DamageType.PIERCING);
        bow.setCritChance(30);
        bow.setCritDamage(65);
        bow.setAttackSpeed(5);
        bow.setAoeDamage(false);
        return bow;
    }

    //Blueprint of rare bow(dps=201.00).
    private static Weapon createRareBowOne() {
        Weapon bow = new Weapon();
        bow.setName("Curling Bow");
        bow.setRarity(Rarity.RARE);
        bow.setPng("bows/rare-curling-bow.png");
        bow.setItemType(ItemType.BOW);
        bow.setDamage(120);
        bow.setDamageType(DamageType.PIERCING);
        bow.setCritChance(20);
        bow.setCritDamage(70);
        bow.setAttackSpeed(15);
        bow.setAoeDamage(false);
        return bow;
    }

    //Blueprint of rare bow(dps=145.25*).
    private static Weapon createRareBowTwo() {
        Weapon bow = new Weapon();
        bow.setName("Piercing Bow");
        bow.setRarity(Rarity.RARE);
        bow.setPng("bows/rare-piercing-bow.png");
        bow.setItemType(ItemType.BOW);
        bow.setDamage(250);
        bow.setDamageType(DamageType.PIERCING);
        bow.setCritChance(45);
        bow.setCritDamage(90);
        bow.setAttackSpeed(5);
        bow.setAoeDamage(true);
        return bow;
    }

    //Blueprint of rare bow(dps=200.50).
    private static Weapon createRareBowThree() {
        Weapon bow = new Weapon();
        bow.setName("Skeleton Bow");
        bow.setRarity(Rarity.RARE);
        bow.setPng("bows/rare-skeleton-bow.png");
        bow.setItemType(ItemType.BOW);
        bow.setDamage(160);
        bow.setDamageType(DamageType.PIERCING);
        bow.setCritChance(27);
        bow.setCritDamage(150);
        bow.setAttackSpeed(10);
        bow.setAoeDamage(false);
        return bow;
    }

    //Blueprint of epic bow(dps=412.50*).
    private static Weapon createEpicBowOne() {
        Weapon bow = new Weapon();
        bow.setName("Crossbow");
        bow.setRarity(Rarity.EPIC);
        bow.setPng("bows/epic-crossbow.png");
        bow.setItemType(ItemType.BOW);
        bow.setDamage(650);
        bow.setDamageType(DamageType.PIERCING);
        bow.setCritChance(50);
        bow.setCritDamage(350);
        bow.setAttackSpeed(5);
        bow.setAoeDamage(true);
        return bow;
    }

    //Blueprint of epic bow(dps=598.50).
    private static Weapon createEpicBowTwo() {
        Weapon bow = new Weapon();
        bow.setName("Frost Bow");
        bow.setRarity(Rarity.EPIC);
        bow.setPng("bows/epic-frost-bow.png");
        bow.setItemType(ItemType.BOW);
        bow.setDamage(300);
        bow.setDamageType(DamageType.COLD);
        bow.setCritChance(45);
        bow.setCritDamage(220);
        bow.setAttackSpeed(15);
        bow.setAoeDamage(false);
        return bow;
    }

    //Blueprint of epic bow(dps=600.00).
    private static Weapon createEpicBowThree() {
        Weapon bow = new Weapon();
        bow.setName("Poison Bow");
        bow.setRarity(Rarity.EPIC);
        bow.setPng("bows/epic-poison-bow.png");
        bow.setItemType(ItemType.BOW);
        bow.setDamage(320);
        bow.setDamageType(DamageType.POISON);
        bow.setCritChance(40);
        bow.setCritDamage(200);
        bow.setAttackSpeed(15);
        bow.setAoeDamage(false);
        return bow;
    }

    //Blueprint of legendary bow(dps=4700.00).
    private static Weapon createLegendaryBowOne() {
        Weapon bow = new Weapon();
        bow.setName("Grasp Bow");
        bow.setRarity(Rarity.LEGENDARY);
        bow.setPng("bows/legendary-grasp-bow.png");
        bow.setItemType(ItemType.BOW);
        bow.setDamage(1400);
        bow.setDamageType(DamageType.PIERCING);
        bow.setCritChance(80);
        bow.setCritDamage(600);
        bow.setAttackSpeed(25);
        bow.setAoeDamage(false);
        return bow;
    }

    //Blueprint of legendary bow(dps=3225.00*).
    private static Weapon createLegendaryBowTwo() {
        Weapon bow = new Weapon();
        bow.setName("Magma Bow");
        bow.setRarity(Rarity.LEGENDARY);
        bow.setPng("bows/legendary-magma-bow.png");
        bow.setItemType(ItemType.BOW);
        bow.setDamage(1200);
        bow.setDamageType(DamageType.FIRE);
        bow.setCritChance(75);
        bow.setCritDamage(550);
        bow.setAttackSpeed(20);
        bow.setAoeDamage(true);
        return bow;
    }

    //Blueprint of legendary bow(dps=3468.75*).
    private static Weapon createLegendaryBowThree() {
        Weapon bow = new Weapon();
        bow.setName("Precision Bow");
        bow.setRarity(Rarity.LEGENDARY);
        bow.setPng("bows/legendary-precision-bow.png");
        bow.setItemType(ItemType.BOW);
        bow.setDamage(1600);
        bow.setDamageType(DamageType.PIERCING);
        bow.setCritChance(95);
        bow.setCritDamage(750);
        bow.setAttackSpeed(15);
        bow.setAoeDamage(true);
        return bow;
    }

    //Blueprint of common staff(dps=20.00).
    private static Weapon createCommonStaffOne() {
        Weapon staff = new Weapon();
        staff.setName("Leafy Staff");
        staff.setRarity(Rarity.COMMON);
        staff.setPng("staffs/common-leafy-staff.png");
        staff.setItemType(ItemType.STAFF);
        staff.setDamage(40);
        staff.setDamageType(DamageType.BLUDGEONING);
        staff.setCritChance(0);
        staff.setCritDamage(0);
        staff.setAttackSpeed(5);
        staff.setAoeDamage(false);
        return staff;
    }

    //Blueprint of common staff(dps=20.00).
    private static Weapon createCommonStaffTwo() {
        Weapon staff = new Weapon();
        staff.setName("Sickle Staff");
        staff.setRarity(Rarity.COMMON);
        staff.setPng("staffs/common-sickle-staff.png");
        staff.setItemType(ItemType.STAFF);
        staff.setDamage(40);
        staff.setDamageType(DamageType.BLUDGEONING);
        staff.setCritChance(0);
        staff.setCritDamage(0);
        staff.setAttackSpeed(5);
        staff.setAoeDamage(false);
        return staff;
    }

    //Blueprint of common staff(dps=20.00).
    private static Weapon createCommonStaffThree() {
        Weapon staff = new Weapon();
        staff.setName("Steel Staff");
        staff.setRarity(Rarity.COMMON);
        staff.setPng("staffs/common-steel-staff.png");
        staff.setItemType(ItemType.STAFF);
        staff.setDamage(40);
        staff.setDamageType(DamageType.BLUDGEONING);
        staff.setCritChance(0);
        staff.setCritDamage(0);
        staff.setAttackSpeed(5);
        staff.setAoeDamage(false);
        return staff;
    }

    //Blueprint of uncommon staff(dps=20.20).
    private static Weapon createUnCommonStaffOne() {
        Weapon staff = new Weapon();
        staff.setName("Light and Dark Staff");
        staff.setRarity(Rarity.UNCOMMON);
        staff.setPng("staffs/uncommon-light&dark-staff.png");
        staff.setItemType(ItemType.STAFF);
        staff.setDamage(40);
        staff.setDamageType(DamageType.BLUDGEONING);
        staff.setCritChance(1);
        staff.setCritDamage(40);
        staff.setAttackSpeed(5);
        staff.setAoeDamage(false);
        return staff;
    }

    //Blueprint of uncommon staff(dps=20.20).
    private static Weapon createUnCommonStaffTwo() {
        Weapon staff = new Weapon();
        staff.setName("Orb Staff");
        staff.setRarity(Rarity.UNCOMMON);
        staff.setPng("staffs/uncommon-orb-staff.png");
        staff.setItemType(ItemType.STAFF);
        staff.setDamage(40);
        staff.setDamageType(DamageType.BLUDGEONING);
        staff.setCritChance(1);
        staff.setCritDamage(40);
        staff.setAttackSpeed(5);
        staff.setAoeDamage(false);
        return staff;
    }

    //Blueprint of uncommon staff(dps=20.20).
    private static Weapon createUnCommonStaffThree() {
        Weapon staff = new Weapon();
        staff.setName("Winged Staff");
        staff.setRarity(Rarity.UNCOMMON);
        staff.setPng("staffs/uncommon-winged-staff.png");
        staff.setItemType(ItemType.STAFF);
        staff.setDamage(40);
        staff.setDamageType(DamageType.BLUDGEONING);
        staff.setCritChance(1);
        staff.setCritDamage(40);
        staff.setAttackSpeed(5);
        staff.setAoeDamage(false);
        return staff;
    }

    //Blueprint of rare staff(dps=21.00).
    private static Weapon createRareStaffOne() {
        Weapon staff = new Weapon();
        staff.setName("Gem Staff");
        staff.setRarity(Rarity.RARE);
        staff.setPng("staffs/rare-gem-staff.png");
        staff.setItemType(ItemType.STAFF);
        staff.setDamage(40);
        staff.setDamageType(DamageType.BLUDGEONING);
        staff.setCritChance(5);
        staff.setCritDamage(40);
        staff.setAttackSpeed(5);
        staff.setAoeDamage(false);
        return staff;
    }

    //Blueprint of rare staff(dps=21.00).
    private static Weapon createRareStaffTwo() {
        Weapon staff = new Weapon();
        staff.setName("Holy Staff");
        staff.setRarity(Rarity.RARE);
        staff.setPng("staffs/rare-holy-staff.png");
        staff.setItemType(ItemType.STAFF);
        staff.setDamage(40);
        staff.setDamageType(DamageType.BLUDGEONING);
        staff.setCritChance(5);
        staff.setCritDamage(40);
        staff.setAttackSpeed(5);
        staff.setAoeDamage(false);
        return staff;
    }

    //Blueprint of rare staff(dps=).
    private static Weapon createRareStaffThree() {
        Weapon staff = new Weapon();
        staff.setName("Sea Staff");
        staff.setRarity(Rarity.RARE);
        staff.setPng("staffs/rare-sea-staff.png");
        staff.setItemType(ItemType.STAFF);
        staff.setDamage(40);
        staff.setDamageType(DamageType.BLUDGEONING);
        staff.setCritChance(5);
        staff.setCritDamage(40);
        staff.setAttackSpeed(5);
        staff.setAoeDamage(false);
        return staff;
    }

    //Blueprint of epic staff(dps=30.00).
    private static Weapon createEpicStaffOne() {
        Weapon staff = new Weapon();
        staff.setName("Cobra Staff");
        staff.setRarity(Rarity.EPIC);
        staff.setPng("staffs/epic-cobra-staff.png");
        staff.setItemType(ItemType.STAFF);
        staff.setDamage(40);
        staff.setDamageType(DamageType.BLUDGEONING);
        staff.setCritChance(50);
        staff.setCritDamage(40);
        staff.setAttackSpeed(5);
        staff.setAoeDamage(false);
        return staff;
    }

    //Blueprint of epic staff(dps=30.00).
    private static Weapon createEpicStaffTwo() {
        Weapon staff = new Weapon();
        staff.setName("Elder Staff");
        staff.setRarity(Rarity.EPIC);
        staff.setPng("staffs/epic-elder-staff.png");
        staff.setItemType(ItemType.STAFF);
        staff.setDamage(40);
        staff.setDamageType(DamageType.BLUDGEONING);
        staff.setCritChance(50);
        staff.setCritDamage(40);
        staff.setAttackSpeed(5);
        staff.setAoeDamage(false);
        return staff;
    }

    //Blueprint of epic staff(dps=30.00).
    private static Weapon createEpicStaffThree() {
        Weapon staff = new Weapon();
        staff.setName("Necrotic Staff");
        staff.setRarity(Rarity.EPIC);
        staff.setPng("staffs/epic-necrotic-staff.png");
        staff.setItemType(ItemType.STAFF);
        staff.setDamage(40);
        staff.setDamageType(DamageType.BLUDGEONING);
        staff.setCritChance(50);
        staff.setCritDamage(40);
        staff.setAttackSpeed(5);
        staff.setAoeDamage(false);
        return staff;
    }

    //Blueprint of legendary staff(dps=80.00).
    private static Weapon createLegendaryStaffOne() {
        Weapon staff = new Weapon();
        staff.setName("Fire Tentacle Staff");
        staff.setRarity(Rarity.LEGENDARY);
        staff.setPng("staffs/legendary-fireTentacle-staff.png");
        staff.setItemType(ItemType.STAFF);
        staff.setDamage(40);
        staff.setDamageType(DamageType.FIRE);
        staff.setCritChance(100);
        staff.setCritDamage(40);
        staff.setAttackSpeed(10);
        staff.setAoeDamage(false);
        return staff;
    }

    //Blueprint of legendary staff(dps=80.00).
    private static Weapon createLegendaryStaffTwo() {
        Weapon staff = new Weapon();
        staff.setName("Naga Staff");
        staff.setRarity(Rarity.LEGENDARY);
        staff.setPng("staffs/legendary-naga-staff.png");
        staff.setItemType(ItemType.STAFF);
        staff.setDamage(40);
        staff.setDamageType(DamageType.FIRE);
        staff.setCritChance(100);
        staff.setCritDamage(40);
        staff.setAttackSpeed(10);
        staff.setAoeDamage(false);
        return staff;
    }

    //Blueprint of legendary staff(dps=30.00).
    private static Weapon createLegendaryStaffThree() {
        Weapon staff = new Weapon();
        staff.setName("Syphon Staff");
        staff.setRarity(Rarity.LEGENDARY);
        staff.setPng("staffs/legendary-syphon-staff.png");
        staff.setItemType(ItemType.STAFF);
        staff.setDamage(40);
        staff.setDamageType(DamageType.POISON);
        staff.setCritChance(100);
        staff.setCritDamage(40);
        staff.setAttackSpeed(10);
        staff.setAoeDamage(false);
        return staff;
    }
}

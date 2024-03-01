package com.beta.miniactiongame.service;

import com.beta.miniactiongame.factory.ArmorFactory;
import com.beta.miniactiongame.factory.HeroFactory;
import com.beta.miniactiongame.factory.WeaponFactory;
import com.beta.miniactiongame.model.UserHeroData;
import com.beta.miniactiongame.model.creature.Hero;
import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.Weapon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserHeroDataServiceTest {

    @Mock
    private HeroFactory heroFactory;
    @Mock
    private ArmorFactory armorFactory;
    @Mock
    private WeaponFactory weaponFactory;
    private UserHeroDataService userHeroDataService;
    private final Hero fighter = new Hero();
    private final Hero ranger = new Hero();
    private final Hero mage = new Hero();
    private final Hero demon = new Hero();
    private final Weapon weaponOne = new Weapon();
    private final Weapon weaponTwo = new Weapon();
    private final Armor armorOne = new Armor();
    private final Armor armorTwo= new Armor();
    List<UserHeroData> allData;
    private static final UUID FIGHTER_ID = UUID.randomUUID();
    private static final UUID RANGER_ID = UUID.randomUUID();
    private static final UUID MAGE_ID = UUID.randomUUID();
    private static final UUID DEMON_ID = UUID.randomUUID();
    private static final UUID WEAPON_ONE_ID = UUID.randomUUID();
    private static final UUID WEAPON_TWO_ID = UUID.randomUUID();
    private static final UUID ARMOR_ONE_ID = UUID.randomUUID();
    private static final UUID ARMOR_TWO_ID = UUID.randomUUID();

    @BeforeEach
    void setup() {
        userHeroDataService = new UserHeroDataService(heroFactory, armorFactory, weaponFactory);
        fighter.setId(FIGHTER_ID);
        ranger.setId(RANGER_ID);
        mage.setId(MAGE_ID);
        demon.setId(DEMON_ID);
        weaponOne.setId(WEAPON_ONE_ID);
        weaponTwo.setId(WEAPON_TWO_ID);
        armorOne.setId(ARMOR_ONE_ID);
        armorTwo.setId(ARMOR_TWO_ID);
        when(heroFactory.getFighter()).thenReturn(fighter);
        when(heroFactory.getRanger()).thenReturn(ranger);
        when(heroFactory.getMage()).thenReturn(mage);
        when(heroFactory.getDemon()).thenReturn(demon);
        when(armorFactory.getCommonArmorOne()).thenReturn(armorOne);
        when(armorFactory.getRareArmorOne()).thenReturn(armorOne);
        when(weaponFactory.getCommonSwordOne()).thenReturn(weaponOne);
        when(weaponFactory.getCommonBowOne()).thenReturn(weaponOne);
        when(weaponFactory.getCommonStaffOne()).thenReturn(weaponOne);
        when(weaponFactory.getRareStaffOne()).thenReturn(weaponOne);
        allData = userHeroDataService.getUserHeroData();
    }

    @Test
    void getUserHeroDataList() {
         assertEquals(4, allData.size());
         for (UserHeroData data: allData) {
             assertNotNull(data.getHero());
             if (data.getHero().getId().equals(FIGHTER_ID)) {
                 assertTrue(data.isObtained());
                 assertTrue(data.isSelected());
             } else {
                 assertFalse(data.isObtained());
                 assertFalse(data.isSelected());
             }
             assertNotNull(data.getArmor());
             assertNotNull(data.getWeapon());
         }
    }

    @Test
    void obtainAndSelectHero() {
        userHeroDataService.obtainHero(allData, DEMON_ID);
        for(UserHeroData data: allData) {
            if (data.getHero().getId().equals(DEMON_ID)) {
                assertTrue(data.isObtained());
                assertTrue(data.isSelected());
            } else if (data.getHero().getId().equals(FIGHTER_ID)) {
                assertTrue(data.isObtained());
                assertFalse(data.isSelected());
            } else {
                assertFalse(data.isObtained());
                assertFalse(data.isSelected());
            }
        }
    }

    @Test
    void selectSelectedHero() {
        userHeroDataService.obtainHero(allData, RANGER_ID);
        userHeroDataService.selectHero(allData, RANGER_ID);
        for(UserHeroData data: allData) {
            if (data.getHero().getId().equals(RANGER_ID)) {
                assertTrue(data.isSelected());
            } else {
                assertFalse(data.isSelected());
            }
        }
    }

    @Test
    void selectUnObtainedHero() {
        userHeroDataService.selectHero(allData, MAGE_ID);
        for(UserHeroData data: allData) {
            if (data.getHero().getId().equals(FIGHTER_ID)) {
                assertTrue(data.isSelected());
            } else {
                assertFalse(data.isSelected());
            }
        }
    }

    @Test
    void changeWeapon() {
        UserHeroData userHeroData = allData.get(0);
        assertEquals(WEAPON_ONE_ID, userHeroData.getWeapon().getId());
        Weapon weapon = userHeroDataService.changeWeapon(userHeroData, weaponTwo);
        assertEquals(WEAPON_TWO_ID, userHeroData.getWeapon().getId());
        assertEquals(WEAPON_ONE_ID, weapon.getId());
    }

    @Test
    void changeArmor() {
        UserHeroData userHeroData = allData.get(0);
        assertEquals(ARMOR_ONE_ID, userHeroData.getArmor().getId());
        Armor armor = userHeroDataService.changeArmor(userHeroData, armorTwo);
        assertEquals(ARMOR_TWO_ID, userHeroData.getArmor().getId());
        assertEquals(ARMOR_ONE_ID, armor.getId());
    }
}
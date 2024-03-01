package com.beta.miniactiongame.service;

import com.beta.miniactiongame.exceptions.HeroDataWrapperNotFound;
import com.beta.miniactiongame.factory.ArmorFactory;
import com.beta.miniactiongame.factory.HeroFactory;
import com.beta.miniactiongame.factory.WeaponFactory;
import com.beta.miniactiongame.model.HeroDataWrapper;
import com.beta.miniactiongame.model.creature.Hero;
import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.Weapon;
import com.beta.miniactiongame.repository.hero.HeroDataWrapperRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HeroDataWrapperServiceTest {

    @Mock
    private HeroFactory heroFactory;
    @Mock
    private ArmorFactory armorFactory;
    @Mock
    private WeaponFactory weaponFactory;
    @Mock
    private HeroDataWrapperRepository heroDataWrapperRepository;
    private HeroDataWrapperService heroDataWrapperService;
    private final Hero fighter = new Hero();
    private final Hero ranger = new Hero();
    private final Hero mage = new Hero();
    private final Hero demon = new Hero();
    private final Weapon weaponOne = new Weapon();
    private final Weapon weaponTwo = new Weapon();
    private final Armor armorOne = new Armor();
    private final Armor armorTwo= new Armor();
    List<HeroDataWrapper> heroDataWrappers;
    private static final UUID FIGHTER_ID = UUID.randomUUID();
    private static final UUID RANGER_ID = UUID.randomUUID();
    private static final UUID MAGE_ID = UUID.randomUUID();
    private static final UUID DEMON_ID = UUID.randomUUID();
    private static final UUID WEAPON_ONE_ID = UUID.randomUUID();
    private static final UUID WEAPON_TWO_ID = UUID.randomUUID();
    private static final UUID ARMOR_ONE_ID = UUID.randomUUID();
    private static final UUID ARMOR_TWO_ID = UUID.randomUUID();
    private static final UUID NOT_ASSIGNED_UUID = java.util.UUID.randomUUID();

    @BeforeEach
    void setup() {
        heroDataWrapperService = new HeroDataWrapperService(heroFactory, armorFactory, weaponFactory, heroDataWrapperRepository);
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
        heroDataWrappers = heroDataWrapperService.createHeroDataWrappers();
    }

    @Test
    void createHeroDataWrappers() {
         assertEquals(4, heroDataWrappers.size());
         for (HeroDataWrapper heroDataWrapper: heroDataWrappers) {
             assertNotNull(heroDataWrapper.getHero());
             if (heroDataWrapper.getHero().getId().equals(FIGHTER_ID)) {
                 assertTrue(heroDataWrapper.isObtained());
                 assertTrue(heroDataWrapper.isSelected());
             } else {
                 assertFalse(heroDataWrapper.isObtained());
                 assertFalse(heroDataWrapper.isSelected());
             }
             assertNotNull(heroDataWrapper.getArmor());
             assertNotNull(heroDataWrapper.getWeapon());
         }
    }

    @Test
    void getHeroDataWrapperById() {
        when(heroDataWrapperRepository.findById(any())).thenReturn(Optional.of(heroDataWrappers.get(0)));
        assertNotNull(heroDataWrapperService.findHeroDataWrapperById(NOT_ASSIGNED_UUID));
    }

    @Test
    void getHeroDataWrapperByWrongId() {
        when(heroDataWrapperRepository.findById(any())).thenReturn(Optional.empty());
        assertThrows(HeroDataWrapperNotFound.class,
                () -> heroDataWrapperService.findHeroDataWrapperById(NOT_ASSIGNED_UUID));
    }

    @Test
    void obtainAndSelectHero() {
        heroDataWrapperService.obtainHero(heroDataWrappers, DEMON_ID);
        for(HeroDataWrapper heroDataWrapper: heroDataWrappers) {
            if (heroDataWrapper.getHero().getId().equals(DEMON_ID)) {
                assertTrue(heroDataWrapper.isObtained());
                assertTrue(heroDataWrapper.isSelected());
            } else if (heroDataWrapper.getHero().getId().equals(FIGHTER_ID)) {
                assertTrue(heroDataWrapper.isObtained());
                assertFalse(heroDataWrapper.isSelected());
            } else {
                assertFalse(heroDataWrapper.isObtained());
                assertFalse(heroDataWrapper.isSelected());
            }
        }
    }

    @Test
    void selectSelectedHero() {
        heroDataWrapperService.obtainHero(heroDataWrappers, RANGER_ID);
        heroDataWrapperService.selectHero(heroDataWrappers, RANGER_ID);
        for(HeroDataWrapper heroDataWrapper: heroDataWrappers) {
            if (heroDataWrapper.getHero().getId().equals(RANGER_ID)) {
                assertTrue(heroDataWrapper.isSelected());
            } else {
                assertFalse(heroDataWrapper.isSelected());
            }
        }
    }

    @Test
    void selectUnObtainedHero() {
        heroDataWrapperService.selectHero(heroDataWrappers, MAGE_ID);
        for(HeroDataWrapper heroDataWrapper: heroDataWrappers) {
            if (heroDataWrapper.getHero().getId().equals(FIGHTER_ID)) {
                assertTrue(heroDataWrapper.isSelected());
            } else {
                assertFalse(heroDataWrapper.isSelected());
            }
        }
    }

    @Test
    void changeWeapon() {
        HeroDataWrapper heroDataWrapper = heroDataWrappers.get(0);
        assertEquals(WEAPON_ONE_ID, heroDataWrapper.getWeapon().getId());
        Weapon weapon = heroDataWrapperService.changeWeapon(heroDataWrapper, weaponTwo);
        assertEquals(WEAPON_TWO_ID, heroDataWrapper.getWeapon().getId());
        assertEquals(WEAPON_ONE_ID, weapon.getId());
    }

    @Test
    void changeArmor() {
        HeroDataWrapper heroDataWrapper = heroDataWrappers.get(0);
        assertEquals(ARMOR_ONE_ID, heroDataWrapper.getArmor().getId());
        Armor armor = heroDataWrapperService.changeArmor(heroDataWrapper, armorTwo);
        assertEquals(ARMOR_TWO_ID, heroDataWrapper.getArmor().getId());
        assertEquals(ARMOR_ONE_ID, armor.getId());
    }
}
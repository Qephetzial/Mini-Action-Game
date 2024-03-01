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
    private final Weapon weapon = new Weapon();
    private final Armor armor = new Armor();
    private static final UUID FIGHTER_ID = UUID.randomUUID();
    private static final UUID RANGER_ID = UUID.randomUUID();
    private static final UUID MAGE_ID = UUID.randomUUID();
    private static final UUID DEMON_ID = UUID.randomUUID();

    @BeforeEach
    void setup() {
        userHeroDataService = new UserHeroDataService(heroFactory, armorFactory, weaponFactory);
        fighter.setId(FIGHTER_ID);
        ranger.setId(RANGER_ID);
        mage.setId(MAGE_ID);
        demon.setId(DEMON_ID);
        when(heroFactory.getFighter()).thenReturn(fighter);
        when(heroFactory.getRanger()).thenReturn(ranger);
        when(heroFactory.getMage()).thenReturn(mage);
        when(heroFactory.getDemon()).thenReturn(demon);
        when(armorFactory.getCommonArmorOne()).thenReturn(armor);
        when(armorFactory.getRareArmorOne()).thenReturn(armor);
        when(weaponFactory.getCommonSwordOne()).thenReturn(weapon);
        when(weaponFactory.getCommonBowOne()).thenReturn(weapon);
        when(weaponFactory.getCommonStaffOne()).thenReturn(weapon);
        when(weaponFactory.getRareStaffOne()).thenReturn(weapon);
    }

    @Test
    void getUserHeroDataList() {
         List<UserHeroData> allData = userHeroDataService.getUserHeroData();
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
    void obtainHero() {
        List<UserHeroData> allData = userHeroDataService.getUserHeroData();
        userHeroDataService.obtainHero(allData, DEMON_ID);
        for(UserHeroData data: allData) {
            if (data.getHero().getId().equals(FIGHTER_ID) || data.getHero().getId().equals(DEMON_ID)) {
                assertTrue(data.isObtained());
            } else {
                assertFalse(data.isObtained());
            }
        }
    }
}

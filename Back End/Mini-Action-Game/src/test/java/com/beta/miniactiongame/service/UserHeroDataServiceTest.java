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

    @BeforeEach
    void setup() {
        userHeroDataService = new UserHeroDataService(heroFactory, armorFactory, weaponFactory);
        fighter.setName("fighter");
        ranger.setName("Ranger");
        mage.setName("mage");
        demon.setName("demon");
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
             if (data.getHero().getName().equals("fighter")) {
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
}

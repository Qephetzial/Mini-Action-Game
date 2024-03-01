package com.beta.miniactiongame.service;

import com.beta.miniactiongame.factory.ArmorFactory;
import com.beta.miniactiongame.factory.HeroFactory;
import com.beta.miniactiongame.factory.WeaponFactory;
import com.beta.miniactiongame.model.UserHeroData;
import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.Weapon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserHeroDataService {

    private final HeroFactory heroFactory;
    private final ArmorFactory armorFactory;
    private final WeaponFactory weaponFactory;

    public List<UserHeroData> getUserHeroData() {
        List<UserHeroData> userHeroData = new ArrayList<>();
        userHeroData.add(
                new UserHeroData(
                        heroFactory.getFighter(),
                        armorFactory.getCommonArmorOne(),
                        weaponFactory.getCommonSwordOne(),
                        true,
                        true));
        userHeroData.add(
                new UserHeroData(
                        heroFactory.getRanger(),
                        armorFactory.getCommonArmorOne(),
                        weaponFactory.getCommonBowOne(),
                        false,
                        false));
        userHeroData.add(
                new UserHeroData(
                        heroFactory.getDemon(),
                        armorFactory.getRareArmorOne(),
                        weaponFactory.getRareStaffOne(),
                        false,
                        false));
        userHeroData.add(
                new UserHeroData(
                        heroFactory.getMage(),
                        armorFactory.getCommonArmorOne(),
                        weaponFactory.getCommonStaffOne(),
                        false,
                        false));
        return userHeroData;
    }

    public void obtainHero(List<UserHeroData> userHeroData, UUID heroId) {
        for (UserHeroData data: userHeroData) {
            if (data.getHero().getId().equals(heroId)) {
                data.setObtained(true);
                selectHero(userHeroData, heroId);
                break;
            }
        }
    }

    public void selectHero(List<UserHeroData> userHeroData, UUID heroId) {
        UserHeroData heroData = null;
        boolean isNewHeroSelected = false;
        for (UserHeroData data: userHeroData) {
            if (data.isSelected()) {
                heroData = data;
            }
            if (data.getHero().getId().equals(heroId) && data.isObtained() && heroData != data) {
                data.setSelected(true);
                isNewHeroSelected = true;
            }
        }
        if (isNewHeroSelected) {
            Objects.requireNonNull(heroData).setSelected(false);
        }
    }

    public Weapon changeWeapon(UserHeroData userHeroData, Weapon weapon) {
        Weapon deselectedWeapon = userHeroData.getWeapon();
        userHeroData.setWeapon(weapon);
        return deselectedWeapon;
    }

    public Armor changeArmor(UserHeroData userHeroData, Armor armor) {
        Armor deselectedArmor = userHeroData.getArmor();
        userHeroData.setArmor(armor);
        return deselectedArmor;
    }
}
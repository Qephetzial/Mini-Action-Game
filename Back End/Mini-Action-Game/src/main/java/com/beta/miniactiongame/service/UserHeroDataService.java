package com.beta.miniactiongame.service;

import com.beta.miniactiongame.factory.ArmorFactory;
import com.beta.miniactiongame.factory.HeroFactory;
import com.beta.miniactiongame.factory.WeaponFactory;
import com.beta.miniactiongame.model.UserHeroData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
}
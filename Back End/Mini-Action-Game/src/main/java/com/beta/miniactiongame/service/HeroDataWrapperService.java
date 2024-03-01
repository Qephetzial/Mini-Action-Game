package com.beta.miniactiongame.service;

import com.beta.miniactiongame.exceptions.HeroDataWrapperNotFound;
import com.beta.miniactiongame.factory.ArmorFactory;
import com.beta.miniactiongame.factory.HeroFactory;
import com.beta.miniactiongame.factory.WeaponFactory;
import com.beta.miniactiongame.model.HeroDataWrapper;
import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.Weapon;
import com.beta.miniactiongame.repository.hero.HeroDataWrapperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class HeroDataWrapperService {

    private final HeroFactory heroFactory;
    private final ArmorFactory armorFactory;
    private final WeaponFactory weaponFactory;
    private final HeroDataWrapperRepository heroDataWrapperRepository;

    public List<HeroDataWrapper> createHeroDataWrappers() {
        List<HeroDataWrapper> userHeroData = new ArrayList<>();
        userHeroData.add(
                new HeroDataWrapper(
                        heroFactory.getFighter(),
                        armorFactory.getCommonArmorOne(),
                        weaponFactory.getCommonSwordOne(),
                        true,
                        true));
        userHeroData.add(
                new HeroDataWrapper(
                        heroFactory.getRanger(),
                        armorFactory.getCommonArmorOne(),
                        weaponFactory.getCommonBowOne(),
                        false,
                        false));
        userHeroData.add(
                new HeroDataWrapper(
                        heroFactory.getDemon(),
                        armorFactory.getRareArmorOne(),
                        weaponFactory.getRareStaffOne(),
                        false,
                        false));
        userHeroData.add(
                new HeroDataWrapper(
                        heroFactory.getMage(),
                        armorFactory.getCommonArmorOne(),
                        weaponFactory.getCommonStaffOne(),
                        false,
                        false));
        return userHeroData;
    }

    public HeroDataWrapper findHeroDataWrapperById(UUID id) {
        return heroDataWrapperRepository.findById(id).orElseThrow(
                () -> new HeroDataWrapperNotFound("HeroDataWrapper with id(" + id + ") is not found!"));
    }

    public void obtainHero(List<HeroDataWrapper> userHeroData, UUID heroId) {
        for (HeroDataWrapper data: userHeroData) {
            if (data.getHero().getId().equals(heroId)) {
                data.setObtained(true);
                selectHero(userHeroData, heroId);
                break;
            }
        }
    }

    public void selectHero(List<HeroDataWrapper> userHeroData, UUID heroId) {
        HeroDataWrapper heroData = null;
        boolean isNewHeroSelected = false;
        for (HeroDataWrapper data: userHeroData) {
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

    public Weapon changeWeapon(HeroDataWrapper userHeroData, Weapon weapon) {
        Weapon deselectedWeapon = userHeroData.getWeapon();
        userHeroData.setWeapon(weapon);
        return deselectedWeapon;
    }

    public Armor changeArmor(HeroDataWrapper heroDataWrapper, Armor armor) {
        Armor deselectedArmor = heroDataWrapper.getArmor();
        heroDataWrapper.setArmor(armor);
        return deselectedArmor;
    }
}
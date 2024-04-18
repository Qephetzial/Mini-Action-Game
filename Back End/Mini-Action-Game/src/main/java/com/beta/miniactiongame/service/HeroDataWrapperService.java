package com.beta.miniactiongame.service;

import com.beta.miniactiongame.exceptions.HeroDataWrapperNotFoundException;
import com.beta.miniactiongame.factory.ArmorFactory;
import com.beta.miniactiongame.factory.HeroFactory;
import com.beta.miniactiongame.factory.WeaponFactory;
import com.beta.miniactiongame.model.AppUser;
import com.beta.miniactiongame.model.HeroDataWrapper;
import com.beta.miniactiongame.model.creature.Hero;
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
    private final AppUserService appUserService;
    private final HeroDataWrapperRepository heroDataWrapperRepository;

    public List<HeroDataWrapper> createHeroDataWrappers() {
        List<HeroDataWrapper> heroDataWrappers = new ArrayList<>();
        heroDataWrappers.add(
                new HeroDataWrapper(
                        heroFactory.getFighter(),
                        armorFactory.getCommonArmorOne(),
                        weaponFactory.getCommonSwordOne(),
                        true,
                        true));
        heroDataWrappers.add(
                new HeroDataWrapper(
                        heroFactory.getRanger(),
                        armorFactory.getCommonArmorOne(),
                        weaponFactory.getCommonBowOne(),
                        false,
                        false));
        heroDataWrappers.add(
                new HeroDataWrapper(
                        heroFactory.getDemon(),
                        armorFactory.getRareArmorOne(),
                        weaponFactory.getRareStaffOne(),
                        false,
                        false));
        heroDataWrappers.add(
                new HeroDataWrapper(
                        heroFactory.getMage(),
                        armorFactory.getCommonArmorOne(),
                        weaponFactory.getCommonStaffOne(),
                        false,
                        false));
        return saveAllHeroDataWrapper(heroDataWrappers);
    }

    public HeroDataWrapper findHeroDataWrapperById(UUID id) {
        return heroDataWrapperRepository.findById(id).orElseThrow(
                () -> new HeroDataWrapperNotFoundException(STR."HeroDataWrapper with id(\{id}) is not found!"));
    }

    public HeroDataWrapper findHeroDataWrapperById(UUID id, AppUser appUser) {
        for (HeroDataWrapper heroDataWrapper: appUser.getHeroes()) {
            if (heroDataWrapper.getId().equals(id)) {
                return heroDataWrapper;
            }
        }
        throw new HeroDataWrapperNotFoundException(STR."HeroDataWrapper with id(\{id}) is not found!");
    }

    public void updateHeroDataWrapper(HeroDataWrapper heroDataWrapper) {
        heroDataWrapperRepository.save(heroDataWrapper);
    }

    public List<HeroDataWrapper> saveAllHeroDataWrapper(List<HeroDataWrapper> heroDataWrappers) {
        return heroDataWrapperRepository.saveAll(heroDataWrappers);
    }

    public void obtainHero(List<HeroDataWrapper> heroDataWrappers, UUID heroId, AppUser appUser) {
        for (HeroDataWrapper heroDataWrapper: heroDataWrappers) {
            Hero hero = heroDataWrapper.getHero();
            if (hero.getId().equals(heroId) && appUserService.changeCoin(hero.getValue(), appUser)) {
                heroDataWrapper.setObtained(true);
                selectHero(heroDataWrappers, heroId);
                break;
            }
        }
    }

    public void selectHero(List<HeroDataWrapper> heroDataWrappers, UUID heroId) {
        HeroDataWrapper heroData = null;
        boolean isNewHeroSelected = false;
        for (HeroDataWrapper heroDataWrapper: heroDataWrappers) {
            if (heroDataWrapper.isSelected()) {
                heroData = heroDataWrapper;
            }
            if (heroDataWrapper.getHero().getId().equals(heroId) && heroDataWrapper.isObtained() && heroData != heroDataWrapper) {
                heroDataWrapper.setSelected(true);
                isNewHeroSelected = true;
                updateHeroDataWrapper(heroDataWrapper);
            }
        }
        if (isNewHeroSelected) {
            Objects.requireNonNull(heroData).setSelected(false);
            updateHeroDataWrapper(heroData);
        }

    }

    public Weapon changeWeapon(HeroDataWrapper heroDataWrapper, Weapon weapon) {
        Weapon deselectedWeapon = heroDataWrapper.getWeapon();
        heroDataWrapper.setWeapon(weapon);
        updateHeroDataWrapper(heroDataWrapper);
        return deselectedWeapon;
    }

    public Armor changeArmor(HeroDataWrapper heroDataWrapper, Armor armor) {
        Armor deselectedArmor = heroDataWrapper.getArmor();
        heroDataWrapper.setArmor(armor);
        updateHeroDataWrapper(heroDataWrapper);
        return deselectedArmor;
    }
}
package com.beta.miniactiongame.service;

import com.beta.miniactiongame.model.item.Weapon;
import com.beta.miniactiongame.repository.item.WeaponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeaponService {

    private final WeaponRepository weaponRepository;

    public void saveWeapon(Weapon weapon) {
        weaponRepository.save(weapon);
    }

    public Weapon getWeaponByName(String name) {
        return weaponRepository.findByName(name).orElse(null);
    }

}

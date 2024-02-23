package com.beta.miniactiongame.service;

import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.repository.item.ArmorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArmorService {

    private final ArmorRepository armorRepository;

    public void saveArmor(Armor armor) {
        armorRepository.save(armor);
    }

    public Armor getArmorByName(String name) {
        return armorRepository.findByName(name).orElse(null);
    }
}
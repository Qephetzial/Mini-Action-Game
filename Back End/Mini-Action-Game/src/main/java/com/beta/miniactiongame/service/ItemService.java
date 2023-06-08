package com.beta.miniactiongame.service;

import com.beta.miniactiongame.repository.item.ArmorRepository;
import com.beta.miniactiongame.repository.item.WeaponRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ItemService {

    private final ArmorRepository armorRepository;
    private final WeaponRepository weaponRepository;

    //This method delete the item
    public void deleteItem(UUID id) {
        weaponRepository.deleteById(id);
        armorRepository.deleteById(id);
    }
}

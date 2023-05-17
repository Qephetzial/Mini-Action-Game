package com.beta.MiniActionGame.service;

import com.beta.MiniActionGame.repository.item.ArmorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ArmorService {
    private final ArmorRepository armorRepository;
}

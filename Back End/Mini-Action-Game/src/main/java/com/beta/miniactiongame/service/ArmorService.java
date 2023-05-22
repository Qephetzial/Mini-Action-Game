package com.beta.miniactiongame.service;

import com.beta.miniactiongame.repository.item.ArmorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ArmorService {
    private final ArmorRepository armorRepository;
}

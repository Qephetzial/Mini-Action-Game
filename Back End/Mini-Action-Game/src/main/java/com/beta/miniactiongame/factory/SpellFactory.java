package com.beta.miniactiongame.factory;

import com.beta.miniactiongame.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SpellFactory {

    private final ItemService itemService;
}

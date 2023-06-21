package com.beta.miniactiongame.service;

import com.beta.miniactiongame.repository.item.ArmorRepository;
import com.beta.miniactiongame.repository.item.WeaponRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.UUID;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ItemServiceTest {

    @Mock
    WeaponRepository weaponRepository;

    @Mock
    ArmorRepository armorRepository;

    ItemService itemService;

    @BeforeEach
    void setUp() {
        itemService = new ItemService(armorRepository, weaponRepository);
    }

    @Test
    void deleteItem() {
        final UUID id = UUID.randomUUID();
        itemService.deleteItem(id);
        verify(armorRepository, times(1)).deleteById(id);
        verify(weaponRepository, times(1)).deleteById(id);
    }
}
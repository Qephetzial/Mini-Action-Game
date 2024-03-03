package com.beta.miniactiongame.service;

import com.beta.miniactiongame.model.AppUser;
import com.beta.miniactiongame.model.Role;
import com.beta.miniactiongame.model.item.*;
import com.beta.miniactiongame.repository.AppUserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class AppUserServiceTest {

    @Mock
    AppUserRepository appUserRepository;
    AppUserService appUserService;
    AppUser appUser;
    AppUser updatedAppUser;
    List<Item> items;

    @BeforeEach
    void setUp() {
        items = new ArrayList<>();
        appUserService = new AppUserService(appUserRepository);
        appUser = new AppUser(UUID.randomUUID(), "Dom", "123", Role.USER, 0, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        updatedAppUser = appUser;
        updatedAppUser.setCoin(10000);
        Mockito.when(appUserRepository.findByName(appUser.getName()))
                .thenReturn(Optional.of(appUser));
        Armor armor = new Armor();
        armor.setItemType(ItemType.ARMOR);
        items.add(armor);
        Weapon weapon = new Weapon();
        weapon.setItemType(ItemType.SWORD);
        items.add(weapon);
        Mockito.when(appUserRepository.findByName(appUser.getName()))
                .thenReturn(Optional.of(appUser));
    }

    @Test
    void updateAppUser() {
        appUserService.updateAppUser(updatedAppUser);
        verify(appUserRepository, times(1)).save(updatedAppUser);
    }

    @Test
    void addItem() {
        assertEquals(0, appUser.getWeapons().size());
        assertEquals(0, appUser.getArmors().size());
        appUserService.addItems(items, appUser);
        assertEquals(1, appUser.getWeapons().size());
        assertEquals(1, appUser.getArmors().size());
    }

    @Test
    void getAppUser() {
        AppUser appUser = appUserService.getAppUser("Dom");
        assertEquals("Dom", appUser.getName());
    }
}
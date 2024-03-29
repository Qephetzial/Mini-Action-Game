package com.beta.miniactiongame.auth;

import com.beta.miniactiongame.model.Role;
import com.beta.miniactiongame.model.HeroDataWrapper;
import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.Weapon;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String name;

    private String password;

    private Role role;

    private int coin;

    private List<HeroDataWrapper> heroes;

    private List<Armor> armors;

    private List<Weapon> weapons;
}

package com.beta.MiniActionGame.model;

import com.beta.MiniActionGame.model.item.Item;

import java.util.List;

public class User {
    private String name;
    private List<> heroes;
    private List<Item> items;

    public User(String name, List<> heroes, List<Item> items) {
        this.name = name;
        this.heroes = heroes;
        this.items = items;
    }
}

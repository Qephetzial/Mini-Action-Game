package com.beta.miniactiongame.model.item;

public enum Rarity {
    COMMON(10),
    UNCOMMON(30),
    RARE(90),
    EPIC(270),
    LEGENDARY(810);

    private final int value;


    Rarity(int price){
        value = price;
    }


    public int getValue() {
        return value;
    }
}

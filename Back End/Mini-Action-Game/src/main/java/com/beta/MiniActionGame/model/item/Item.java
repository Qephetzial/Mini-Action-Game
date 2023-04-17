package com.beta.MiniActionGame.model.item;
import java.util.Random;

public abstract class Item {
    private final String name;
    private final Rarity rarity;
    private final String imageLink;
    private final ItemType itemType;
    private final Random random = new Random();

    public Item(String name, Rarity rarity, String imageLink, ItemType itemType) {
        this.name = name;
        this.rarity = rarity;
        this.imageLink = imageLink;
        this.itemType = itemType;
    }

    protected int getARandomInteger(int maxInt) {
        return random.nextInt(maxInt);
    }

    public String getName() {
        return name;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public String getImageLink() {
        return imageLink;
    }

    public ItemType getType() {
        return itemType;
    }
}

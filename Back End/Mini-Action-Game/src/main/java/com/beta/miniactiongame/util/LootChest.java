package com.beta.miniactiongame.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class LootChest {

    private final Chest ironChest = new Chest("iron chest", "chests/iron-chest.png", 150, 800, 950, 990, 1000, false);
    private final Chest bronzeChest = new Chest("bronze chest", "chests/bronze-chest.png", 250, 703, 905, 977, 999, false);
    private final Chest silverChest = new Chest("silver chest", "chests/silver-chest.png", 400, 600, 850, 950, 995, false);
    private final Chest goldenChest = new Chest("golden chest", "chests/golden-chest.png", 700, 500, 750, 900, 990, true);

    public record Chest(String name, String png, int price, int commonLootChance, int unCommonLootChance, int rareLootChance, int epicLootChance, boolean chanceForBonusLoot) {}

    public static Chest getChest(ChestType chestType) {
        return switch (chestType) {
            case IRON -> ironChest;
            case BRONZE -> bronzeChest;
            case SILVER -> silverChest;
            case GOLDEN -> goldenChest;
        };
    }
}
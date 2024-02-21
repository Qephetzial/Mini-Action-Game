package com.beta.miniactiongame.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class LootChest {

    private final Chest ironChest = new Chest(800, 950, 990, 1000, false);
    private final Chest bronzeChest = new Chest(703, 905, 977, 999, false);
    private final Chest silverChest = new Chest(600, 850, 950, 995, false);
    private final Chest goldenChest = new Chest(500, 750, 900, 990, true);

    public record Chest(int commonLootChance, int unCommonLootChance, int rareLootChance, int epicLootChance, boolean chanceForBonusLoot) {}

    public static Chest getChest(ChestType chestType) {
        return switch (chestType) {
            case IRON -> ironChest;
            case BRONZE -> bronzeChest;
            case SILVER -> silverChest;
            case GOLDEN -> goldenChest;
        };
    }
}
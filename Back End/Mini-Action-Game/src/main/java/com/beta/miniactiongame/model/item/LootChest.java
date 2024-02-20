package com.beta.miniactiongame.model.item;

import org.springframework.stereotype.Component;

@Component
public class LootChest {

    private final Chest ironChest;
    private final Chest bronzeChest;
    private final Chest silverChest;
    private final Chest goldenChest;

    public LootChest() {
        ironChest = new Chest(800, 950, 990, 1000, false);
        bronzeChest = new Chest(703, 905, 977, 999, false);
        silverChest = new Chest(600, 850, 950, 995, false);
        goldenChest = new Chest(500, 750, 900, 990, true);
    }

    public record Chest(int commonLootChance, int unCommonLootChance, int rareLootChance, int epicLootChance, boolean hasChanceForBonusLoot) {}

    public Chest getChest(ChestType chestType) {
        return switch (chestType) {
            case IRON -> ironChest;
            case BRONZE -> bronzeChest;
            case SILVER -> silverChest;
            case GOLDEN -> goldenChest;
        };
    }
}

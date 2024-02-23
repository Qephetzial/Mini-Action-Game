package com.beta.miniactiongame.service;

import com.beta.miniactiongame.exceptions.WrongValueException;
import com.beta.miniactiongame.model.item.Item;
import com.beta.miniactiongame.util.ChestType;
import com.beta.miniactiongame.util.LootChest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.beta.miniactiongame.factory.ArmorFactory.*;
import static com.beta.miniactiongame.factory.WeaponFactory.*;
import static com.beta.miniactiongame.util.LootChest.getChest;
import static com.beta.miniactiongame.util.UtilityMethods.getRandomInt;

@Service
@RequiredArgsConstructor
public class ChestService {
    private static final String ERROR_MESSAGE =
            "The value of type is forbidden. The wrong value is:";

    public List<Item> openChest(int common,
                                int unCommon,
                                int rare,
                                int epic,
                                boolean bonusLoot) {
        int rarity = getRandomInt(1000);
        int item = getRandomInt(12);
        List<Item> items = new ArrayList<>();
        if (rarity < common) {
            items.add(switch (item) {
                case 0 -> commonArmorOne;
                case 1 -> commonArmorTwo;
                case 2 -> commonArmorThree;
                case 3 -> commonSwordOne;
                case 4 -> commonSwordTwo;
                case 5 -> commonSwordThree;
                case 6 -> commonBowOne;
                case 7 -> commonBowTwo;
                case 8 -> commonBowThree;
                case 9 -> commonStaffOne;
                case 10 -> commonStaffTwo;
                case 11 -> commonStaffThree;
                default -> throw new WrongValueException(ERROR_MESSAGE + item);
            });
        } else if (rarity < unCommon) {
            items.add(switch (item) {
                case 0 -> unCommonArmorOne;
                case 1 -> unCommonArmorTwo;
                case 2 -> unCommonArmorThree;
                case 3 -> unCommonSwordOne;
                case 4 -> unCommonSwordTwo;
                case 5 -> unCommonSwordThree;
                case 6 -> unCommonBowOne;
                case 7 -> unCommonBowTwo;
                case 8 -> unCommonBowThree;
                case 9 -> unCommonStaffOne;
                case 10 -> unCommonStaffTwo;
                case 11 -> unCommonStaffThree;
                default -> throw new WrongValueException(ERROR_MESSAGE + item);
            });
        } else if (rarity < rare) {
            items.add(switch (item) {
                case 0 -> rareArmorOne;
                case 1 -> rareArmorTwo;
                case 2 -> rareArmorThree;
                case 3 -> rareSwordOne;
                case 4 -> rareSwordTwo;
                case 5 -> rareSwordThree;
                case 6 -> rareBowOne;
                case 7 -> rareBowTwo;
                case 8 -> rareBowThree;
                case 9 -> rareStaffOne;
                case 10 -> rareStaffTwo;
                case 11 -> rareStaffThree;
                default -> throw new WrongValueException(ERROR_MESSAGE + item);
            });
        } else if (rarity < epic) {
            items.add(switch (item) {
                case 0 -> epicArmorOne;
                case 1 -> epicArmorTwo;
                case 2 -> epicArmorThree;
                case 3 -> epicSwordOne;
                case 4 -> epicSwordTwo;
                case 5 -> epicSwordThree;
                case 6 -> epicBowOne;
                case 7 -> epicBowTwo;
                case 8 -> epicBowThree;
                case 9 -> epicStaffOne;
                case 10 -> epicStaffTwo;
                case 11 -> epicStaffThree;
                default -> throw new WrongValueException(ERROR_MESSAGE + item);
            });
        } else if (rarity < 1000) {
            items.add(switch (item) {
                case 0 -> legendaryArmorOne;
                case 1 -> legendaryArmorTwo;
                case 2 -> legendaryArmorThree;
                case 3 -> legendarySwordOne;
                case 4 -> legendarySwordTwo;
                case 5 -> legendarySwordThree;
                case 6 -> legendaryBowOne;
                case 7 -> legendaryBowTwo;
                case 8 -> legendaryBowThree;
                case 9 -> legendaryStaffOne;
                case 10 -> legendaryStaffTwo;
                case 11 -> legendaryStaffThree;
                default -> throw new WrongValueException(ERROR_MESSAGE + item);
            });
        } else {
            throw new WrongValueException("The value of rarity is forbidden. The wrong value is:" + rarity);
        }
        if (bonusLoot && getRandomInt(1000) == 0) {
            LootChest.Chest silverChest = getChest(ChestType.SILVER);
            items.add(openChest(
                    silverChest.commonLootChance(),
                    silverChest.unCommonLootChance(),
                    silverChest.rareLootChance(),
                    silverChest.epicLootChance(),
                    silverChest.chanceForBonusLoot()).get(0));
        }
        return items;
    }
}
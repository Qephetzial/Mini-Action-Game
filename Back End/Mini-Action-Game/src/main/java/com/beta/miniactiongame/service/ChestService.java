package com.beta.miniactiongame.service;

import com.beta.miniactiongame.exceptions.WrongValueException;
import com.beta.miniactiongame.factory.ArmorFactory;
import com.beta.miniactiongame.factory.WeaponFactory;
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

    private final ArmorFactory armorFactory;
    private final WeaponFactory weaponFactory;

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
                case 0 -> armorFactory.getCommonArmorOne();
                case 1 -> armorFactory.getCommonArmorTwo();
                case 2 -> armorFactory.getCommonArmorThree();
                case 3 -> weaponFactory.getCommonSwordOne();
                case 4 -> weaponFactory.getCommonSwordTwo();
                case 5 -> weaponFactory.getCommonSwordThree();
                case 6 -> weaponFactory.getCommonBowOne();
                case 7 -> weaponFactory.getCommonBowTwo();
                case 8 -> weaponFactory.getCommonBowThree();
                case 9 -> weaponFactory.getCommonStaffOne();
                case 10 -> weaponFactory.getCommonStaffTwo();
                case 11 -> weaponFactory.getCommonStaffThree();
                default -> throw new WrongValueException(ERROR_MESSAGE + item);
            });
        } else if (rarity < unCommon) {
            items.add(switch (item) {
                case 0 -> armorFactory.getUnCommonArmorOne();
                case 1 -> armorFactory.getUnCommonArmorTwo();
                case 2 -> armorFactory.getUnCommonArmorThree();
                case 3 -> weaponFactory.getUnCommonSwordOne();
                case 4 -> weaponFactory.getUnCommonSwordTwo();
                case 5 -> weaponFactory.getUnCommonSwordThree();
                case 6 -> weaponFactory.getUnCommonBowOne();
                case 7 -> weaponFactory.getUnCommonBowTwo();
                case 8 -> weaponFactory.getUnCommonBowThree();
                case 9 -> weaponFactory.getUnCommonStaffOne();
                case 10 -> weaponFactory.getUnCommonStaffTwo();
                case 11 -> weaponFactory.getUnCommonStaffThree();
                default -> throw new WrongValueException(ERROR_MESSAGE + item);
            });
        } else if (rarity < rare) {
            items.add(switch (item) {
                case 0 -> armorFactory.getRareArmorOne();
                case 1 -> armorFactory.getRareArmorTwo();
                case 2 -> armorFactory.getRareArmorThree();
                case 3 -> weaponFactory.getRareSwordOne();
                case 4 -> weaponFactory.getRareSwordTwo();
                case 5 -> weaponFactory.getRareSwordThree();
                case 6 -> weaponFactory.getRareBowOne();
                case 7 -> weaponFactory.getRareBowTwo();
                case 8 -> weaponFactory.getRareBowThree();
                case 9 -> weaponFactory.getRareStaffOne();
                case 10 -> weaponFactory.getRareStaffTwo();
                case 11 -> weaponFactory.getRareStaffThree();
                default -> throw new WrongValueException(ERROR_MESSAGE + item);
            });
        } else if (rarity < epic) {
            items.add(switch (item) {
                case 0 -> armorFactory.getEpicArmorOne();
                case 1 -> armorFactory.getEpicArmorTwo();
                case 2 -> armorFactory.getEpicArmorThree();
                case 3 -> weaponFactory.getEpicSwordOne();
                case 4 -> weaponFactory.getEpicSwordTwo();
                case 5 -> weaponFactory.getEpicSwordThree();
                case 6 -> weaponFactory.getEpicBowOne();
                case 7 -> weaponFactory.getEpicBowTwo();
                case 8 -> weaponFactory.getEpicBowThree();
                case 9 -> weaponFactory.getEpicStaffOne();
                case 10 -> weaponFactory.getEpicStaffTwo();
                case 11 -> weaponFactory.getEpicStaffThree();
                default -> throw new WrongValueException(ERROR_MESSAGE + item);
            });
        } else if (rarity < 1000) {
            items.add(switch (item) {
                case 0 -> armorFactory.getLegendaryArmorOne();
                case 1 -> armorFactory.getLegendaryArmorTwo();
                case 2 -> armorFactory.getLegendaryArmorThree();
                case 3 -> weaponFactory.getLegendarySwordOne();
                case 4 -> weaponFactory.getLegendarySwordTwo();
                case 5 -> weaponFactory.getLegendarySwordThree();
                case 6 -> weaponFactory.getLegendaryBowOne();
                case 7 -> weaponFactory.getLegendaryBowTwo();
                case 8 -> weaponFactory.getLegendaryBowThree();
                case 9 -> weaponFactory.getLegendaryStaffOne();
                case 10 -> weaponFactory.getLegendaryStaffTwo();
                case 11 -> weaponFactory.getLegendaryStaffThree();
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
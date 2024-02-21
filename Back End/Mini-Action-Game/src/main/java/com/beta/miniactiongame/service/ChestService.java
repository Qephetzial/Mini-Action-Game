package com.beta.miniactiongame.service;

import com.beta.miniactiongame.exceptions.WrongValueException;
import com.beta.miniactiongame.factory.*;
import com.beta.miniactiongame.model.item.Item;
import com.beta.miniactiongame.util.ChestType;
import com.beta.miniactiongame.util.LootChest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

import static com.beta.miniactiongame.util.LootChest.getChest;
import static com.beta.miniactiongame.util.UtilityMethods.getRandomInt;

@Service
@AllArgsConstructor
public class ChestService {
    
    private final ArmorFactory armorFactory;
    private final WeaponFactory weaponFactory;
    private static final String FINAL_ITEM = "finalItem";

    private WrongValueException wrongValueException(String field, int value) {
        return new WrongValueException("The value of " + field + " is forbidden. The wrong value is:" + value);
    }

    public List<Item> openChest(int common, int unCommon, int rare, int epic, boolean bonusLoot) {
        int rarity = getRandomInt(1000);
        int type = getRandomInt(4);
        int finalItem = getRandomInt(3);
        List<Item> item = new ArrayList<>();
        if (rarity < common) {
            item.add(switch (type) {
                case 0 -> switch (finalItem) {
                    case 0 -> armorFactory.createCommonArmorOne();
                    case 1 -> armorFactory.createCommonArmorTwo();
                    case 2 -> armorFactory.createCommonArmorThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                case 1 -> switch (finalItem) {
                    case 0 -> weaponFactory.createCommonSwordOne();
                    case 1 -> weaponFactory.createCommonSwordTwo();
                    case 2 -> weaponFactory.createCommonSwordThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                case 2 -> switch (finalItem) {
                    case 0 -> weaponFactory.createCommonBowOne();
                    case 1 -> weaponFactory.createCommonBowTwo();
                    case 2 -> weaponFactory.createCommonBowThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                case 3 -> switch (finalItem) {
                    case 0 -> weaponFactory.createCommonStaffOne();
                    case 1 -> weaponFactory.createCommonStaffTwo();
                    case 2 -> weaponFactory.createCommonStaffThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                default -> throw wrongValueException("type", type);
            });
        } else if (rarity < unCommon) {
            item.add(switch (type) {
                case 0 -> switch (finalItem) {
                    case 0 -> armorFactory.createUnCommonArmorOne();
                    case 1 -> armorFactory.createUnCommonArmorTwo();
                    case 2 -> armorFactory.createUnCommonArmorThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                case 1 -> switch (finalItem) {
                    case 0 -> weaponFactory.createUnCommonSwordOne();
                    case 1 -> weaponFactory.createUnCommonSwordTwo();
                    case 2 -> weaponFactory.createUnCommonSwordThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                case 2 -> switch (finalItem) {
                    case 0 -> weaponFactory.createUnCommonBowOne();
                    case 1 -> weaponFactory.createUnCommonBowTwo();
                    case 2 -> weaponFactory.createUnCommonBowThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                case 3 -> switch (finalItem) {
                    case 0 -> weaponFactory.createUnCommonStaffOne();
                    case 1 -> weaponFactory.createUnCommonStaffTwo();
                    case 2 -> weaponFactory.createUnCommonStaffThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                default -> throw wrongValueException("type", type);
            });
        } else if (rarity < rare) {
            item.add(switch (type) {
                case 0 -> switch (finalItem) {
                    case 0 -> armorFactory.createRareArmorOne();
                    case 1 -> armorFactory.createRareArmorTwo();
                    case 2 -> armorFactory.createRareArmorThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                case 1 -> switch (finalItem) {
                    case 0 -> weaponFactory.createRareSwordOne();
                    case 1 -> weaponFactory.createRareSwordTwo();
                    case 2 -> weaponFactory.createRareSwordThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                case 2 -> switch (finalItem) {
                    case 0 -> weaponFactory.createRareBowOne();
                    case 1 -> weaponFactory.createRareBowTwo();
                    case 2 -> weaponFactory.createRareBowThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                case 3 -> switch (finalItem) {
                    case 0 -> weaponFactory.createRareStaffOne();
                    case 1 -> weaponFactory.createRareStaffTwo();
                    case 2 -> weaponFactory.createRareStaffThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                default -> throw wrongValueException("type", type);
            });
        } else if (rarity < epic) {
            item.add(switch (type) {
                case 0 -> switch (finalItem) {
                    case 0 -> armorFactory.createEpicArmorOne();
                    case 1 -> armorFactory.createEpicArmorTwo();
                    case 2 -> armorFactory.createEpicArmorThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                case 1 -> switch (finalItem) {
                    case 0 -> weaponFactory.createEpicSwordOne();
                    case 1 -> weaponFactory.createEpicSwordTwo();
                    case 2 -> weaponFactory.createEpicSwordThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                case 2 -> switch (finalItem) {
                    case 0 -> weaponFactory.createEpicBowOne();
                    case 1 -> weaponFactory.createEpicBowTwo();
                    case 2 -> weaponFactory.createEpicBowThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                case 3 -> switch (finalItem) {
                    case 0 -> weaponFactory.createEpicStaffOne();
                    case 1 -> weaponFactory.createEpicStaffTwo();
                    case 2 -> weaponFactory.createEpicStaffThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                default -> throw wrongValueException("type", type);
            });
        } else {
            item.add(switch (type) {
                case 0 -> switch (finalItem) {
                    case 0 -> armorFactory.createLegendaryArmorOne();
                    case 1 -> armorFactory.createLegendaryArmorTwo();
                    case 2 -> armorFactory.createLegendaryArmorThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                case 1 -> switch (finalItem) {
                    case 0 -> weaponFactory.createLegendarySwordOne();
                    case 1 -> weaponFactory.createLegendarySwordTwo();
                    case 2 -> weaponFactory.createLegendarySwordThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                case 2 -> switch (finalItem) {
                    case 0 -> weaponFactory.createLegendaryBowOne();
                    case 1 -> weaponFactory.createLegendaryBowTwo();
                    case 2 -> weaponFactory.createLegendaryBowThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                case 3 -> switch (finalItem) {
                    case 0 -> weaponFactory.createLegendaryStaffOne();
                    case 1 -> weaponFactory.createLegendaryStaffTwo();
                    case 2 -> weaponFactory.createLegendaryStaffThree();
                    default -> throw wrongValueException(FINAL_ITEM, finalItem);
                };
                default -> throw wrongValueException("type", type);
            });
            if (bonusLoot && getRandomInt(1000) == 0) {
                LootChest.Chest silverChest = getChest(ChestType.SILVER);
                item.add(openChest(
                        silverChest.commonLootChance(),
                        silverChest.unCommonLootChance(),
                        silverChest.rareLootChance(),
                        silverChest.epicLootChance(),
                        silverChest.chanceForBonusLoot()).get(0));
            }
        }
        return item;
    }
}

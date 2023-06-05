package com.beta.miniactiongame.service;

import com.beta.miniactiongame.factory.*;
import com.beta.miniactiongame.model.item.Items;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@AllArgsConstructor
public class ChestService {
    
    private final ArmorFactory armorFactory;
    private final WeaponFactory weaponFactory;
    private final Random random = new Random();

    //This method returns a random integer between 0 and the given maximum value
    private int getRandomInteger(int max) {
        return random.nextInt(max);
    }

    //This method create a random item or occasionally two and return them in list
    public List<Items> openChest(int common, int unCommon, int rare, int epic, boolean bonusLoot) {
        int rarity = getRandomInteger(1000);
        int type = getRandomInteger(4);
        int finalItem = getRandomInteger(3);
        List<Items> item = new ArrayList<>();
        if (rarity < common) {
            item.add(switch (type) {
                case 0 -> switch (finalItem) {
                    case 0 -> armorFactory.createCommonArmorOne();
                    case 1 -> armorFactory.createCommonArmorTwo();
                    case 2 -> armorFactory.createCommonArmorThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                case 1 -> switch (finalItem) {
                    case 0 -> weaponFactory.createCommonSwordOne();
                    case 1 -> weaponFactory.createCommonSwordTwo();
                    case 2 -> weaponFactory.createCommonSwordThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                case 2 -> switch (finalItem) {
                    case 0 -> weaponFactory.createCommonBowOne();
                    case 1 -> weaponFactory.createCommonBowTwo();
                    case 2 -> weaponFactory.createCommonBowThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                case 3 -> switch (finalItem) {
                    case 0 -> weaponFactory.createCommonStaffOne();
                    case 1 -> weaponFactory.createCommonStaffTwo();
                    case 2 -> weaponFactory.createCommonStaffThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                default -> throw new IllegalStateException("Unexpected value: " + type);
            });
        } else if (rarity < unCommon) {
            item.add(switch (type) {
                case 0 -> switch (finalItem) {
                    case 0 -> armorFactory.createUnCommonArmorOne();
                    case 1 -> armorFactory.createUnCommonArmorTwo();
                    case 2 -> armorFactory.createUnCommonArmorThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                case 1 -> switch (finalItem) {
                    case 0 -> weaponFactory.createUnCommonSwordOne();
                    case 1 -> weaponFactory.createUnCommonSwordTwo();
                    case 2 -> weaponFactory.createUnCommonSwordThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                case 2 -> switch (finalItem) {
                    case 0 -> weaponFactory.createUnCommonBowOne();
                    case 1 -> weaponFactory.createUnCommonBowTwo();
                    case 2 -> weaponFactory.createUnCommonBowThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                case 3 -> switch (finalItem) {
                    case 0 -> weaponFactory.createUnCommonStaffOne();
                    case 1 -> weaponFactory.createUnCommonStaffTwo();
                    case 2 -> weaponFactory.createUnCommonStaffThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                default -> throw new IllegalStateException("Unexpected value: " + type);
            });
        } else if (rarity < rare) {
            item.add(switch (type) {
                case 0 -> switch (finalItem) {
                    case 0 -> armorFactory.createRareArmorOne();
                    case 1 -> armorFactory.createRareArmorTwo();
                    case 2 -> armorFactory.createRareArmorThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                case 1 -> switch (finalItem) {
                    case 0 -> weaponFactory.createRareSwordOne();
                    case 1 -> weaponFactory.createRareSwordTwo();
                    case 2 -> weaponFactory.createRareSwordThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                case 2 -> switch (finalItem) {
                    case 0 -> weaponFactory.createRareBowOne();
                    case 1 -> weaponFactory.createRareBowTwo();
                    case 2 -> weaponFactory.createRareBowThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                case 3 -> switch (finalItem) {
                    case 0 -> weaponFactory.createRareStaffOne();
                    case 1 -> weaponFactory.createRareStaffTwo();
                    case 2 -> weaponFactory.createRareStaffThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                default -> throw new IllegalStateException("Unexpected value: " + type);
            });
        } else if (rarity < epic) {
            item.add(switch (type) {
                case 0 -> switch (finalItem) {
                    case 0 -> armorFactory.createEpicArmorOne();
                    case 1 -> armorFactory.createEpicArmorTwo();
                    case 2 -> armorFactory.createEpicArmorThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                case 1 -> switch (finalItem) {
                    case 0 -> weaponFactory.createEpicSwordOne();
                    case 1 -> weaponFactory.createEpicSwordTwo();
                    case 2 -> weaponFactory.createEpicSwordThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                case 2 -> switch (finalItem) {
                    case 0 -> weaponFactory.createEpicBowOne();
                    case 1 -> weaponFactory.createEpicBowTwo();
                    case 2 -> weaponFactory.createEpicBowThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                case 3 -> switch (finalItem) {
                    case 0 -> weaponFactory.createEpicStaffOne();
                    case 1 -> weaponFactory.createEpicStaffTwo();
                    case 2 -> weaponFactory.createEpicStaffThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                default -> throw new IllegalStateException("Unexpected value: " + type);
            });
        } else {
            item.add(switch (type) {
                case 0 -> switch (finalItem) {
                    case 0 -> armorFactory.createLegendaryArmorOne();
                    case 1 -> armorFactory.createLegendaryArmorTwo();
                    case 2 -> armorFactory.createLegendaryArmorThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                case 1 -> switch (finalItem) {
                    case 0 -> weaponFactory.createLegendarySwordOne();
                    case 1 -> weaponFactory.createLegendarySwordTwo();
                    case 2 -> weaponFactory.createLegendarySwordThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                case 2 -> switch (finalItem) {
                    case 0 -> weaponFactory.createLegendaryBowOne();
                    case 1 -> weaponFactory.createLegendaryBowTwo();
                    case 2 -> weaponFactory.createLegendaryBowThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                case 3 -> switch (finalItem) {
                    case 0 -> weaponFactory.createLegendaryStaffOne();
                    case 1 -> weaponFactory.createLegendaryStaffTwo();
                    case 2 -> weaponFactory.createLegendaryStaffThree();
                    default -> throw new IllegalStateException("Unexpected value: " + finalItem);
                };
                default -> throw new IllegalStateException("Unexpected value: " + type);
            });
            if (bonusLoot && getRandomInteger(1000) == 0) {
                item.add(openChest(703, 905, 977, 999, false).get(0));
            }
        }
        return item;
    }
}

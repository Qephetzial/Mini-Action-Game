package com.beta.MiniActionGame.service;

import com.beta.MiniActionGame.model.item.armor.CommonAndUnCommonArmor;
import com.beta.MiniActionGame.model.item.ItemType;
import com.beta.MiniActionGame.model.item.Rarity;
import com.beta.MiniActionGame.repository.item.CommonAndUnCommonArmorRepository;
import com.beta.MiniActionGame.repository.item.LegendaryArmorRepository;
import com.beta.MiniActionGame.repository.item.RareAndEpicArmorRepository;
import org.springframework.stereotype.Service;

@Service
public class ArmorService {
    private final CommonAndUnCommonArmorRepository commonAndUnCommonArmorRepository;
    private final RareAndEpicArmorRepository rareAndEpicArmorRepository;
    private final LegendaryArmorRepository legendaryArmorRepository;

    public ArmorService(CommonAndUnCommonArmorRepository commonAndUnCommonArmorRepository, RareAndEpicArmorRepository rareAndEpicArmorRepository, LegendaryArmorRepository legendaryArmorRepository) {
        this.commonAndUnCommonArmorRepository = commonAndUnCommonArmorRepository;
        this.rareAndEpicArmorRepository = rareAndEpicArmorRepository;
        this.legendaryArmorRepository = legendaryArmorRepository;
    }

    public CommonAndUnCommonArmor createCommonLightArmor() {
        CommonAndUnCommonArmor commonLightArmor = new CommonAndUnCommonArmor();
        commonLightArmor.setName("Light Armor");
        commonLightArmor.setRarity(Rarity.COMMON);
        commonLightArmor.setImageLink("common-light-armor.png");
        commonLightArmor.setItemType(ItemType.ARMOR);
        commonLightArmor.setHealth(60);
        commonLightArmor.setDefence(10);
        commonAndUnCommonArmorRepository.save(commonLightArmor);
        return commonLightArmor;
    }
}

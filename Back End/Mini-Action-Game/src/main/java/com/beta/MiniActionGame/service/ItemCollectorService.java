package com.beta.MiniActionGame.service;

import com.beta.MiniActionGame.model.collector.ItemCollector;
import com.beta.MiniActionGame.model.item.Items;
import com.beta.MiniActionGame.model.item.armor.CommonAndUnCommonArmor;
import com.beta.MiniActionGame.model.item.armor.LegendaryArmor;
import com.beta.MiniActionGame.model.item.armor.RareAndEpicArmor;
import com.beta.MiniActionGame.repository.ItemCollectorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ItemCollectorService {

    private final ItemCollectorRepository itemCollectorRepository;

    public ItemCollectorService(ItemCollectorRepository itemCollectorRepository) {
        this.itemCollectorRepository = itemCollectorRepository;
    }

    public ItemCollector createItemCollector(){
        ItemCollector itemCollector = new ItemCollector();
        itemCollector.setCommonAndUnCommonArmors(new ArrayList<>());
        itemCollector.setRareAndEpicArmors(new ArrayList<>());
        itemCollector.setLegendaryArmors(new ArrayList<>());
        return itemCollector;
    }

    public void addItem(ItemCollector itemCollector, Items item) {
        switch (item.getItemType()) {
            case ARMOR -> {switch (item.getRarity()) {
                case COMMON, UNCOMMON -> {
                    CommonAndUnCommonArmor commonAndUnCommonArmor = (CommonAndUnCommonArmor) item;
                    itemCollector.getCommonAndUnCommonArmors().add(commonAndUnCommonArmor);
                }
                case RARE, EPIC -> {
                    RareAndEpicArmor rareAndEpicArmor = (RareAndEpicArmor) item;
                    itemCollector.getRareAndEpicArmors().add(rareAndEpicArmor);
                }
                case LEGENDARY -> {
                    LegendaryArmor legendaryArmor = (LegendaryArmor) item;
                    itemCollector.getLegendaryArmors().add(legendaryArmor);
                }
            }}
        }
    }
}

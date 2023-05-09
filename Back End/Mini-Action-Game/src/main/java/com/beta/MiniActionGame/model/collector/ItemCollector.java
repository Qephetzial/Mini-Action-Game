package com.beta.MiniActionGame.model.collector;

import com.beta.MiniActionGame.model.item.armor.CommonAndUnCommonArmor;
import com.beta.MiniActionGame.model.item.armor.LegendaryArmor;
import com.beta.MiniActionGame.model.item.armor.RareAndEpicArmor;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import java.util.List;
import java.util.UUID;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class ItemCollector {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    @OneToMany
    private List<CommonAndUnCommonArmor> commonAndUnCommonArmors;
    @OneToMany
    private List<RareAndEpicArmor> rareAndEpicArmors;
    @OneToMany
    private List<LegendaryArmor> legendaryArmors;
}

package com.beta.miniactiongame.model;

import com.beta.miniactiongame.model.creature.Hero;
import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.Weapon;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class UserHeroData {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    @ManyToOne
    private Hero hero;
    @ManyToOne
    private Armor armor;
    @ManyToOne
    private Weapon weapon;
    private boolean isSelected;
    private boolean isObtained;

    public UserHeroData(Hero hero, Armor armor, Weapon weapon, boolean isSelected, boolean isObtained) {
        this.hero = hero;
        this.armor = armor;
        this.weapon = weapon;
        this.isSelected = isSelected;
        this.isObtained = isObtained;
    }
}

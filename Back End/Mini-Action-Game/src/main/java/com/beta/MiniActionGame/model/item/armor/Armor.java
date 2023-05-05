package com.beta.MiniActionGame.model.item.armor;

import com.beta.MiniActionGame.model.item.Items;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Armor extends Items {
    private int health;
    private int defence;
}

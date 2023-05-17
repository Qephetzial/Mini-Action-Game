package com.beta.MiniActionGame.model.entity;

import com.beta.MiniActionGame.model.item.Armor;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Hero extends Attacker{
    private int movementSpeed;
    private int value;
    private String condition;
    private String png;
    private String gif;
    @OneToOne
    private Armor armor;
}

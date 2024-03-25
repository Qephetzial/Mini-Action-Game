package com.beta.miniactiongame.model.creature;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Hero extends Creature {

    private int strength;
    private int defence;
    private int movementSpeed;
    private int value;
    private String png;
    private String gif;
}
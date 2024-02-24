package com.beta.miniactiongame.model.creature;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public abstract class Attacker extends Creature {

    private int strength;
    private int defence;
}
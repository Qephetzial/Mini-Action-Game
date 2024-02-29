package com.beta.miniactiongame.model.creature;

import com.beta.miniactiongame.model.Identifier;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
public abstract class Creature extends Identifier implements Serializable {

    private CreatureType creatureType;
    private int health;
    private Alignment alignment;
}
package com.beta.miniactiongame.model.item;

import com.beta.miniactiongame.model.Identifier;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Spell extends Identifier implements Serializable {

    private int damage;
    private int target;
    private DamageType damageType;
    private AOEDamage aoeDamage;
    private CastTime castTime;
}

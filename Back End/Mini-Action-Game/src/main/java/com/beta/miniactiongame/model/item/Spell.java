package com.beta.miniactiongame.model.item;

import com.beta.miniactiongame.model.Identifier;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Spell extends Identifier {

    private int damage;
    private int target;
    private DamageType damageType;
    private AOEDamage aoeDamage;
    private CastTime castTime;
}

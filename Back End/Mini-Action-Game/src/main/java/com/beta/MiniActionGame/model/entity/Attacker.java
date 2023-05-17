package com.beta.MiniActionGame.model.entity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
//Entities who extend this class are able to deal damage.
public abstract class Attacker extends Creature {

    //This field determines the base strength what is the core value when dealing damage.
    private int strength;

    //This field determines the base defence what is reduces the damage received.
    private int defence;

}



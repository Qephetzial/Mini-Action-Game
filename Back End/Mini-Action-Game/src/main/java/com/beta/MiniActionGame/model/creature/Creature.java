package com.beta.MiniActionGame.model.creature;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
@Setter
//This is the core class for every entity. Every creature must be inherited from this class.
public abstract class Creature {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    //A unique ID to the creature.
    private UUID id;

    //This field determines the creature's type/race.
    private CreatureType name;

    //This field determines how much hit point the creature has.
    private int health;

    //This field determines the creature's alignment. It's determines who can attack who.
    private Alignment alignment;
}

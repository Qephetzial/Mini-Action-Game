package com.beta.MiniActionGame.model.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//This is the core class for every entity. Every entity should be inherited from this class.
public abstract class Creature {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    //A unique ID to the creature.
    private UUID id;

    //
    private String name;

    //This field determines how much hit point the creature has.
    private int health;

    //This field determines the creature's alignment. It's determines who can attack who.
    private Alignment alignment;
}

package com.beta.miniactiongame.model.creature;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Getter
@Setter
public abstract class Creature {

    @Id
    @UuidGenerator
    private UUID id;
    private CreatureType name;
    private int health;
    private Alignment alignment;
}
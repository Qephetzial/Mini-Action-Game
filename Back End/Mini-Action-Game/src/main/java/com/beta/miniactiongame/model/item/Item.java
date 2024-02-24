package com.beta.miniactiongame.model.item;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Getter
@Setter
public abstract class Item implements Serializable {

    @Id
    @UuidGenerator
    private UUID id;
    private String name;
    private Rarity rarity;
    private String png;
    private ItemType itemType;
}
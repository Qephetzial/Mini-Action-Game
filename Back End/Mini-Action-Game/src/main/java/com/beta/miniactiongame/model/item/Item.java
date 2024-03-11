package com.beta.miniactiongame.model.item;

import com.beta.miniactiongame.model.Identifier;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
public abstract class Item extends Identifier implements Serializable {

    private Rarity rarity;
    private String png;
    private ItemType itemType;
    private int value;
}
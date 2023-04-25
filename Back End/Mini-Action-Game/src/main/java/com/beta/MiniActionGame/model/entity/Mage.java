package com.beta.MiniActionGame.model.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
public class Mage extends PlayableCharacter{
    @Override
    public void move() {
    }
}

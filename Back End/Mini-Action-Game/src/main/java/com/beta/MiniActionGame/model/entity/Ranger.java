package com.beta.MiniActionGame.model.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
public class Ranger extends PlayableCharacter{
    @Override
    public void move() {
    }
}

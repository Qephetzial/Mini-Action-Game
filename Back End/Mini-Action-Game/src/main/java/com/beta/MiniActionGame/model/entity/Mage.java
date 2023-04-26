package com.beta.MiniActionGame.model.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Mage extends PlayableCharacter{
    @Override
    public void move() {
    }
}

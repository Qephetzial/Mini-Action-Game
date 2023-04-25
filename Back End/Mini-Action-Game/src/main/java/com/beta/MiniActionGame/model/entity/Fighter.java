package com.beta.MiniActionGame.model.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Fighter  extends PlayableCharacter{
    @Override
    public void move() {

    }
}

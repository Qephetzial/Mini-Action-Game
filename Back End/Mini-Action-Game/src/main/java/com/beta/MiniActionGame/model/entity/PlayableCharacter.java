package com.beta.MiniActionGame.model.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class PlayableCharacter extends CanAttack implements Movement {
    private int movementSpeed;
    private int value;
    private String condition;
    private String png;
    private String gif;
}

package com.beta.miniactiongame.model.creature;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
//This class is for the playable characters.
public class Hero extends Attacker{

    //This field determines how fast the character can move.
    private int movementSpeed;

    //This field determines how much coins need to buy the hero.
    private int value;

    //This field determines the png represented on the front-end.
    private String png;

    //This field determines the gif represented on the front-end.
    private String gif;
}

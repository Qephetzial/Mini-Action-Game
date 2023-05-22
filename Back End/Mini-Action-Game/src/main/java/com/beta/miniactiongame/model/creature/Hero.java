package com.beta.miniactiongame.model.creature;

import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.Weapon;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
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

    //This field determines if the hero is obtained or not.
    private Boolean obtained;

    //This field determines if the hero is selected or not. Only obtained heroes can be selected.
    private Boolean selected;

    //This field determines the png represented on the front-end.
    private String png;

    //This field determines the gif represented on the front-end.
    private String gif;

    //This field determines what kind of armor the hero has.
    @OneToOne
    private Armor armor;

    //This field determines what kind of weapon the hero has.
    @OneToOne
    private Weapon weapon;
}

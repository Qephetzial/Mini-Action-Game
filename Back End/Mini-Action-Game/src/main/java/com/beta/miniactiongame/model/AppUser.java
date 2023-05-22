package com.beta.miniactiongame.model;

import com.beta.miniactiongame.model.creature.Hero;
import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.Weapon;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.UUID;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//This class is for the user.
public class AppUser {

    //This is a unique ID for the app user.
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    //This field determines the username, and it's unique for all user.
    @Column(unique=true, name = "name")
    private String name;

    //This field determines how much coin the user has.
    private int coin;

    //This field contains all the playable character from the game.
    @OneToMany (cascade = CascadeType.ALL)
    private List<Hero> heroes;

    //This field contains the armors what is not on the heroes and the user collected.
    @OneToMany (cascade = CascadeType.ALL)
    private List<Armor> armors;

    //This field contains the weapons what is not on the heroes and the user collected.
    @OneToMany (cascade = CascadeType.ALL)
    private List<Weapon> weapons;


    public void addArmor(Armor armor) {
        armors.add(armor);
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }
}

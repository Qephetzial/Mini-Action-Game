package com.beta.MiniActionGame.model;

import com.beta.MiniActionGame.model.creature.Hero;
import com.beta.MiniActionGame.model.item.Armor;
import com.beta.MiniActionGame.model.item.Weapon;
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

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    //This is a unique ID for hte app user.
    private UUID id;

    @Column(unique=true, name = "name")
    //This field determines the username, and it's unique for all user.
    private String name;

    //This field determines how much coin the user has.
    private int coin;

    @OneToMany (cascade = CascadeType.ALL)
    //This field contains all the playable character from the game.
    private List<Hero> heroes;

    @OneToMany (cascade = CascadeType.ALL)
    //This field contains the armors what is not on the heroes and the user collected.
    private List<Armor> armors;

    @OneToMany (cascade = CascadeType.ALL)
    //This field contains the weapons what is not on the heroes and the user collected.
    private List<Weapon> weapons;
}

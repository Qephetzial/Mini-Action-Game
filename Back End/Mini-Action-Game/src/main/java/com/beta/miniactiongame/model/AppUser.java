package com.beta.miniactiongame.model;

import com.beta.miniactiongame.model.creature.Hero;
import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.Weapon;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.UUID;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
//This class is for the user.
public class AppUser implements UserDetails {

    //This is a unique ID for the app user.
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    //This field determines the username, and it's unique for all user.
    @Column(unique=true)
    private String name;

    //This field
    private String password;

    private Role role;

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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true ;
    }
}

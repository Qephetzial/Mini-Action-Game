package com.beta.miniactiongame.model;

import com.beta.miniactiongame.exceptions.ArmorNotFoundException;
import com.beta.miniactiongame.exceptions.WeaponNotFoundException;
import com.beta.miniactiongame.model.item.Armor;
import com.beta.miniactiongame.model.item.Weapon;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppUser implements UserDetails {

    @Id
    @UuidGenerator
    private UUID id;
    private String name;
    private String password;
    private Role role;
    private int coin;

    @OneToMany (cascade = CascadeType.ALL)
    private List<HeroDataWrapper> heroes;

    @ManyToMany
    private List<Armor> armors;

    @ManyToMany
    private List<Weapon> weapons;

    public void addArmor(Armor armor) {
        armors.add(armor);
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public Armor getArmor(UUID uuid) {
        Iterator<Armor> iterator = armors.iterator();
        while (iterator.hasNext()) {
            Armor armor = iterator.next();
            if (armor.getId().equals(uuid)) {
                iterator.remove();
                return armor;
            }
        }
        throw new ArmorNotFoundException("Armor(" + uuid + ") was not found in the user's(" + id + ") armors list!");
    }

    public Weapon getWeapon(UUID uuid) {
        Iterator<Weapon> iterator = weapons.iterator();
        while (iterator.hasNext()) {
            Weapon weapon = iterator.next();
            if (weapon.getId().equals(uuid)) {
                iterator.remove();
                return weapon;
            }
        }
        throw new WeaponNotFoundException("Weapon(" + uuid + ") was not found in the user's(" + id + ") weapons list!");
    }

    @Override
    @JsonIgnore
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
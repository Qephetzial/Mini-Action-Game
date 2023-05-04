package com.beta.MiniActionGame.model;

import com.beta.MiniActionGame.model.entity.PlayableCharacter;
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
public class AppUser {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    @Column(unique=true, name = "name")
    private String name;
    private int gold;
    @OneToMany
    private List<PlayableCharacter> heroes;
    //@OneToMany
    //private List<Item> items;
}

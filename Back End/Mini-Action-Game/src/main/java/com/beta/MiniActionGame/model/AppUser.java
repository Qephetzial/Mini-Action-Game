package com.beta.MiniActionGame.model;

import com.beta.MiniActionGame.model.collector.HeroCollector;
import com.beta.MiniActionGame.model.collector.ItemCollector;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
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
    @OneToOne (cascade = CascadeType.ALL)
    private HeroCollector heroes;
    @OneToOne (cascade = CascadeType.ALL)
    private ItemCollector items;
}

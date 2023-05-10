package com.beta.MiniActionGame.model.collector;

import com.beta.MiniActionGame.model.entity.Demon;
import com.beta.MiniActionGame.model.entity.Fighter;
import com.beta.MiniActionGame.model.entity.Mage;
import com.beta.MiniActionGame.model.entity.Ranger;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class HeroCollector {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    @OneToOne (cascade = CascadeType.ALL)
    private Fighter fighter;
    @OneToOne (cascade = CascadeType.ALL)
    private Ranger ranger;
    @OneToOne (cascade = CascadeType.ALL)
    private Mage mage;
    @OneToOne (cascade = CascadeType.ALL)
    private Demon Demon;
}


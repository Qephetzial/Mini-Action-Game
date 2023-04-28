package com.beta.MiniActionGame.model.item;

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
public class CommonAndUnCommonArmor extends Item {
    private Integer health;
    private Integer defence;
}

package com.beta.miniactiongame.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Getter
@Setter
public abstract class Identifier {

    @Id
    @UuidGenerator
    private UUID id;
    @Column(unique=true)
    private String name;
}
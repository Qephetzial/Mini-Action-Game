package com.beta.MiniActionGame.repository;

import com.beta.MiniActionGame.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, UUID>{

    //Find the app user by name.
    AppUser findByName(String name);
}

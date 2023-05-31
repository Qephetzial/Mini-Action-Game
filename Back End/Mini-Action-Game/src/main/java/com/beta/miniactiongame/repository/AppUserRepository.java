package com.beta.miniactiongame.repository;

import com.beta.miniactiongame.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, UUID>{

    //Find the app user by name.
    Optional<AppUser> findByName(String name);
}

package com.beta.miniactiongame.repository.hero;

import com.beta.miniactiongame.model.HeroDataWrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HeroDataWrapperRepository extends JpaRepository<HeroDataWrapper, UUID> {
}

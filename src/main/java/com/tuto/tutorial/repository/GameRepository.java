package com.tuto.tutorial.repository;

import com.tuto.tutorial.entity.Game;
import com.tuto.tutorial.entity.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Integer> {
    List<Game> findByStadium(Stadium stadium);
}

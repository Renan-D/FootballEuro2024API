package com.tuto.tutorial.repository;

import com.tuto.tutorial.entity.Game;
import com.tuto.tutorial.entity.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
    List<Game> findByStadium(Stadium stadium);
}

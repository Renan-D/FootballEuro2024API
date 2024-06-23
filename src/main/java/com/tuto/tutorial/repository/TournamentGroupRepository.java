package com.tuto.tutorial.repository;

import com.tuto.tutorial.entity.TournamentGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentGroupRepository extends JpaRepository<TournamentGroup, Integer> {
}

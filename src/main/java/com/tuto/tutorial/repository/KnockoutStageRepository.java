package com.tuto.tutorial.repository;

import com.tuto.tutorial.entity.KnockoutStage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KnockoutStageRepository extends JpaRepository<KnockoutStage, Integer> {
}

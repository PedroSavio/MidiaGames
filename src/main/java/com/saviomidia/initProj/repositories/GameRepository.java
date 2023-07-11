package com.saviomidia.initProj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saviomidia.initProj.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}

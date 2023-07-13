package com.saviomidia.initProj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saviomidia.initProj.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}

package com.spring.cricketGamewithspring.dao;

import com.spring.cricketGamewithspring.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CricketDao extends JpaRepository<Player,Long> {
}

package com.spring.cricketGamewithspring.dao;

import com.spring.cricketGamewithspring.model.CricketMatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchDao extends JpaRepository<CricketMatch,Long> {
//    @Query("SELECT Match from Match match where match.id=?1")
//    CricketMatch getMatchById(int id);

}

package com.spring.cricketGamewithspring.services;

import com.spring.cricketGamewithspring.entities.Player;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface CricketService {
    public void addOvers(int overs);
    public int getOvers();
    public void setPlayerCount(int playerCount);

    public void setTeam1Name(String Team1Name);

    public void setTeam2Name(String Team2Name);

    public String getTeam1Name();
    public  String getTeam2Name();
    public List<Player>getPlayersTeam1();

    public Player getPlayerTeam1(Long playerId);

    public void addPlayerTeam1(Player player);

    public void deletePlayerTeam1(Long playerId);

    public void updatePlayerTeam1(Player player);

    public int totalPlayerToaddTeam1();

    public List<Player>getPlayersTeam2();

    public Player getPlayerTeam2(Long playerId);

    public void addPlayerTeam2(Player player);

    public void deletePlayerTeam2(Long playerId);

    public void updatePlayerTeam2(Player player);

    public int totalPlayerToaddTeam2();

    public void matchStarted();

    public void updateScore();
    public String matchResult();

}

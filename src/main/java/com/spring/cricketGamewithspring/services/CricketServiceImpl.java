package com.spring.cricketGamewithspring.services;

import com.spring.cricketGamewithspring.dao.CricketDao;
import com.spring.cricketGamewithspring.entities.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CricketServiceImpl implements CricketService {

    Match match=new Match();
    @Autowired
    private CricketDao cricketDao;



    public void addOvers(int overs) {
        match.setOvers(overs);
    }

    public int getOvers()
    {
        return match.getOvers();
    }

    public void setPlayerCount(int playerCount)
    {
        match.setPlayerCount(playerCount);
        match.team1.setTotalPlayers(playerCount);
        match.team2.setTotalPlayers(playerCount);
    }
    public void setTeam1Name(String Team1Name)
    {
        match.team1.setTeamName(Team1Name);
    }
    public void setTeam2Name(String Team2Name)
    {
        match.team2.setTeamName(Team2Name);

    }
    public String getTeam1Name(){return match.team1.getTeamName();}
    public String getTeam2Name(){return match.team2.getTeamName();}
    public List<Player>getPlayersTeam1(){
        return match.team1.listOfPlayers;
    }
    public Player getPlayerTeam1(Long playerId)
    {
        return cricketDao.getOne(playerId);
    }
    public void addPlayerTeam1(Player player){
        match.team1.listOfPlayers.add(player);
        cricketDao.save(player);
    }
    public void deletePlayerTeam1(Long playerId){
        Player entity=cricketDao.getOne(playerId);
        match.team1.listOfPlayers.remove(entity);
        cricketDao.delete(entity);
    }

    public void updatePlayerTeam1(Player player){
        for(Player nplayer:match.team1.listOfPlayers)
        {
            if(nplayer.getId()==player.getId())
                nplayer=player;
        }
        cricketDao.save(player);
    }
    public int totalPlayerToaddTeam1(){
        return (match.team1.getTotalPlayers()-match.team1.listOfPlayers.size());
    }

    public List<Player>getPlayersTeam2(){
        return match.team2.listOfPlayers;
    }
    public Player getPlayerTeam2(Long playerId)
    {
        return cricketDao.getOne(playerId);
    }
    public void addPlayerTeam2(Player player){
        match.team2.listOfPlayers.add(player);
        cricketDao.save(player);
    }
    public void deletePlayerTeam2(Long playerId){
        Player entity=cricketDao.getOne(playerId);
        match.team2.listOfPlayers.remove(entity);
        cricketDao.delete(entity);
    }

    public void updatePlayerTeam2(Player player){
        for(Player nplayer:match.team2.listOfPlayers)
        {
            if(nplayer.getId()==player.getId())
                nplayer=player;
        }
        cricketDao.save(player);
    }
    public int totalPlayerToaddTeam2(){
        return (match.team2.getTotalPlayers()-match.team2.listOfPlayers.size());
    }

    public void matchStarted()
    {
        match.startMatch();
    }
    public void updateScore() {
        for (Player nplayer : match.team1.listOfPlayers) {
            cricketDao.save(nplayer);
        }
        for (Player nplayer : match.team2.listOfPlayers) {
            cricketDao.save(nplayer);
        }
    }
    public String matchResult()
    {
        return match.MatchResult();
    }
}

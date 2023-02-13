package com.spring.cricketGamewithspring.controller;


import com.spring.cricketGamewithspring.entities.Player;
import com.spring.cricketGamewithspring.services.CricketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CricketService cricketService;
    @GetMapping("/")
    public String message()
    {
        return "Lets Start the Match";
    }
    @PostMapping("/Overs/{overs}")
    public void addOvers(@PathVariable String overs)
    {
        this.cricketService.addOvers(Integer.parseInt(overs));
    }
    @GetMapping("/Overs/TotalOvers")
    public int getOvers()
    {
        return this.cricketService.getOvers();
    }
    @PostMapping("/Player/{PlayerCount}")
    public void playerCount(@PathVariable String PlayerCount)
    {
        this.cricketService.setPlayerCount(Integer.parseInt(PlayerCount));
    }
    
    @PostMapping("/Team1/{Team1Name}")
    public void setTeam1Name(@PathVariable String Team1Name)
    {
        this.cricketService.setTeam1Name(Team1Name);
    }
    @GetMapping("/Team1/Name")
    public String getTeam1Name()
    {
        return this.cricketService.getTeam1Name();
    }
    @PostMapping("/Team2/{Team2Name}")
    public void setTeam2Name(@PathVariable String Team2Name)
    {
        this.cricketService.setTeam2Name(Team2Name);
    }
    @GetMapping("/Team2/Name")
    public String getTeam2Name()
    {
        return  this.cricketService.getTeam2Name();
    }
    @GetMapping("/Team1/totalPlayerToAddTeam1")
    public int totalPlayerToaddTeam1()
    {
        return this.cricketService.totalPlayerToaddTeam1();
    }
    @GetMapping("/Team1")
    public List<Player> getPlayersTeam1(){
        return this.cricketService.getPlayersTeam1();
    }
    @GetMapping("/Team1/{playerId}")
    public Player getPlayerTeam1(@PathVariable String playerId)
    {
        return  this.cricketService.getPlayerTeam1(Long.parseLong(playerId));
    }
    @PostMapping("/Team1/addPlayer")
    public void addPlayerTeam1(@RequestBody Player player)
    {
        this.cricketService.addPlayerTeam1(player);
    }
    @DeleteMapping("/Team1/{playerId}")
    public void deletePlayerTeam1(@PathVariable String playerId){

        this.cricketService.deletePlayerTeam1(Long.parseLong(playerId));
    }
    @PutMapping("/Team1/updatePlayer")
    public void updatePlayerT(@RequestBody  Player player)
    {
        this.cricketService.updatePlayerTeam1(player);
    }
    @GetMapping("/Team2/totalPlayerToAddTeam2")
    public int totalPlayerToaddTeam2()
    {
        return this.cricketService.totalPlayerToaddTeam2();
    }
    @GetMapping("/Team2")
    public List<Player> getPlayersTeam2(){
        return this.cricketService.getPlayersTeam2();
    }
    @GetMapping("/Team2/{playerId}")
    public Player getPlayerTeam2(@PathVariable String playerId)
    {
        return  this.cricketService.getPlayerTeam2(Long.parseLong(playerId));
    }
    @PostMapping("/Team2/addPlayer")
    public void addPlayerTeam2(@RequestBody Player player)
    {
        this.cricketService.addPlayerTeam2(player);
    }
    @DeleteMapping("/Team2/{playerId}")
    public void deletePlayerTeam2(@PathVariable String playerId){

        this.cricketService.deletePlayerTeam2(Long.parseLong(playerId));
    }
    @PutMapping("/Team2/updatePlayer")
    public void updatePlayerTeam2(@RequestBody  Player player)
    {
        this.cricketService.updatePlayerTeam2(player);
    }
    @PostMapping("/MatchStarted")
    public void matchStarted()
    {
        this.cricketService.matchStarted();
    }

    @PostMapping("/UpdateScore")
    public void updateScore()
    {
        this.cricketService.updateScore();
    }
    @GetMapping("/MatchResult")
    public String matchResult()
    {
        return this.cricketService.matchResult();
    }
}

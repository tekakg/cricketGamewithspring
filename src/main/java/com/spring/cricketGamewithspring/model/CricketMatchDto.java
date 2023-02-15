package com.spring.cricketGamewithspring.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CricketMatchDto {

   private int overs;
    private int playerCount;
    private String team1Name;
    private String team2Name;



    public static CricketMatch toCricketMatch(CricketMatchDto dto){
        CricketMatch cm=new CricketMatch();
        cm.setOvers(dto.getOvers());
        cm.setPlayerCount(dto.getPlayerCount());
        cm.setTeam1Name(dto.getTeam1Name());
        cm.setTeam2Name(dto.getTeam2Name());
        return cm;
    }
}

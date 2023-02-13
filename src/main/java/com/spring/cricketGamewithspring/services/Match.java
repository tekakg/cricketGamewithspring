package com.spring.cricketGamewithspring.services;

import com.spring.cricketGamewithspring.entities.Player;

public class Match {

    private int overs;
    private int playerCount;
    public Team team1;
    public Team team2;

    public Match()
    {
        team1=new Team();
        team2=new Team();
    }
    public void setOvers(int overs) {
        this.overs = overs;
    }

    public int getOvers() {
        return overs;
    }
    public void setPlayerCount(int playerCount)
    {
        this.playerCount=playerCount;
    }
    public int toss() {
        int tossResult = (int) (Math.random() * 2);
        if(tossResult==0)
        {
            System.out.println(team1.getTeamName()+"has won the toss and elected to bat first");
        }
        else
        {
            System.out.println(team2.getTeamName()+"Team2 has won the toss and elected to bat first");
        }
        return tossResult;
    }

    public void startMatch() {

        int tossResult = this.toss();
        if (tossResult == 0) {
            this.playMatch(team1, team2);
        } else if (tossResult == 1) {
            this.playMatch(team2, team1);
        }
    }

    public void playMatch(Team BattingTeam, Team BowlingTeam) {
        Player playerNumber1 = BattingTeam.listOfPlayers.get(0);
        Player playerNumber2 = BattingTeam.listOfPlayers.get(1);
        Player Striker = playerNumber1;
        Player nonStriker = playerNumber2;
        Player Bowler=BowlingTeam.listOfPlayers.get(0);
        int flag = 0;
        for (int overnum = 0; overnum < overs; overnum++) {
            for (int j = 0; j < 6; j++) {
                Bowler.incrementBallsBowled();
                int run = randomfunction();
                Ball nball=new Ball(overnum,j+1,Bowler,Striker,run);
                BattingTeam.BattingBalls.add(nball);
                //System.out.println(run);
                if (run == 7) {
                    Striker.incrementBallsFaced();
                    BattingTeam.incrementwicket();
                    Bowler.incrementWickets();
                    if (BattingTeam.getWicket() == 2)
                    {
                        flag = 1;
                        break;
                    }
                    else {
                        for (Player player : BattingTeam.listOfPlayers) {
                            if (Striker==player) {
                                player.outOrNot = true;
                                Striker = BattingTeam.getNewBatsman(nonStriker);
                                break;
                            }
                        }
                    }
                } else {
                    BattingTeam.incrementrun(run);
                    Striker.incrementrun(run);
                    Striker.incrementBallsFaced();
                    if (run % 2 == 1) {
                        Player temp = Striker;
                        Striker = nonStriker;
                        nonStriker = temp;
                        //Strike change.
                    } else {

                    }
                }
            }
            Player temp = Striker;
            Striker = nonStriker;
            nonStriker = temp;
            int index=BowlingTeam.listOfPlayers.indexOf(Bowler);
            index++;
            index= (int) (index%(BowlingTeam.getTotalPlayers()));
            Bowler=BowlingTeam.listOfPlayers.get(index);
            if (flag == 1) {
                break;
            }

        }

        //Scoreboard nwScoreboard = new Scoreboard();
        //nwScoreboard.printScoreboard(BattingTeam,BowlingTeam);
        BattingTeam.endInning();
        //nwScoreboard.printBallStatus(BattingTeam);

        flag = 0;
        playerNumber1 = BowlingTeam.listOfPlayers.get(0);
        playerNumber2 = BowlingTeam.listOfPlayers.get(1);
        Striker = playerNumber1;
        nonStriker = playerNumber2;
        Bowler=BattingTeam.listOfPlayers.get(0);
        for (int overnum = 0; overnum < overs; overnum++) {
            for (int j = 0; j < 6; j++) {
                int run = randomfunction();
                Bowler.incrementBallsBowled();
                Ball nball=new Ball(overnum,j+1,Bowler,Striker,run);
                BowlingTeam.BattingBalls.add(nball);
                //System.out.println(run);
                if (run == 7) {
                    Striker.incrementBallsFaced();
                    BowlingTeam.incrementwicket();
                    Bowler.incrementWickets();
                    if (BowlingTeam.getWicket() == 2)
                    {
                        flag = 1;
                        break;
                    }
                    else {
                        for (Player player : BowlingTeam.listOfPlayers) {
                            if (player == Striker) {
                                Striker.outOrNot = true;
                                Striker = BowlingTeam.getNewBatsman(nonStriker);
                                break;
                            }
                        }
                    }
                } else {
                    if(BowlingTeam.getFinalScore()> BattingTeam.getFinalScore())
                    {
                        flag=1;
                        break;
                    }
                    BowlingTeam.incrementrun(run);
                    Striker.incrementrun(run);
                    Striker.incrementBallsFaced();
                    if (run % 2 == 1) {
                        Player temp = Striker;
                        Striker = nonStriker;
                        nonStriker = temp;
                        //Strike change.
                    } else {

                    }
                }
            }
            // changing the strike at over change.
            Player temp = Striker;
            Striker = nonStriker;
            nonStriker = temp;
            int index=BattingTeam.listOfPlayers.indexOf(Bowler);
            index++;
            index= (int) (index%(BattingTeam.getTotalPlayers()));
            Bowler=BattingTeam.listOfPlayers.get(index);

            if (flag == 1) {
                break;
            }
        }
        //nwScoreboard.printScoreboard(BowlingTeam,BattingTeam);
        BowlingTeam.endInning();
        //nwScoreboard.printBallStatus(BowlingTeam);

    }

    public int randomfunction() {
        int val = (int)(Math.random() * 100);
        if (val >90) {
            return 7;
        } else {
            int runval = (int) (Math.random() * 7);
            return runval;
        }
    }

    public void printScoreboard() {
        //later
    }

    public String MatchResult() {
        String result;
        if (team1.getFinalScore() > team2.getFinalScore()) {
            result=team1.getTeamName()+"has won the toss and elected to bat first";
        } else if (team1.getFinalScore()<team2.getFinalScore()) {
            result=team2.getTeamName()+"has won the toss and elected to bat first";
        } else {
            result="MATCH DRAWN";
        }
        return result;
    }
}


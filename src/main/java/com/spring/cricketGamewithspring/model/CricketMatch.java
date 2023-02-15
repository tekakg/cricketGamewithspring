package com.spring.cricketGamewithspring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="_NEWMATCH")
public class CricketMatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public int overs;
    public int playerCount;
    public long modifiedTime;
    public String team1Name;
    //    private ArrayList<String>playerNames1;
//    private ArrayList<String>playerRoles1;
    public String team2Name;

    //    private ArrayList<String>playerNames2;
//    private ArrayList<String>playerRoles2;
//    private int toss;


//    public void setToss() {
//        toss = (int) (Math.random() * 2);
//    }

//    public CricketMatch() {
//
//    }
//
//    public CricketMatch(int id, int overs, int playerCount, String team1Name, /*String[] playerNames1, String[] playerRoles1*/ String team2Name
//            /*String[] playerNames2, String[] playerRoles2*/) {
//        this.id = id;
//        this.overs = overs;
//        this.playerCount = playerCount;
//        this.team1Name = team1Name;
//    }
}
//        for(String name: playerNames1)
//        {
//            this.playerNames1.add(name);
//        }
//        for(String role: playerRoles1)
//        {
//            this.playerNames1.add(role);
//        }
//        this.team2Name = team2Name;
//        for(String name: playerNames2)
//        {
//            this.playerNames2.add(name);
//        }
//        for(String role: playerRoles2)
//        {
//            this.playerNames2.add(role);
//        }


//
//    public Team createTeam1() {
//        ArrayList<Player>listOfPlayers = null;
//        for(int i=0;i<playerNames1.size();i++)
//        {
//            listOfPlayers.add(new Player(playerNames1.get(i),playerRoles1.get(i)));
//        }
//        Team nteam=new Team(team1Name,playerCount,listOfPlayers);
//        return nteam;
//    }
//    public Team createTeam2() {
//        ArrayList<Player>listOfPlayers = null;
//        for(int i=0;i<playerNames2.size();i++)
//        {
//            listOfPlayers.add(new Player(playerNames2.get(i),playerRoles2.get(i)));
//        }
//        Team nteam=new Team(team1Name,playerCount,listOfPlayers);
//        return nteam;
//    }
//
////    public void setOvers(int overs) {
////        this.overs = overs;
////    }
//
//    //    public int getOvers() {
////        return overs;
////    }
////
////    public void setPlayerCount(int playerCount) {
////        this.playerCount = playerCount;
////    }
//    public String tossResult() {
//        if (toss == 0) {
//            return (team1Name + "has won the toss and elected to bat first");
//        }
//        return(team2Name + "Team2 has won the toss and elected to bat first");
//    }
//    public void startMatch() {
//        Team team1 = this.createTeam1();//first create both teams.
//        Team team2 = this.createTeam2();
//        if (toss == 0) {
//            this.playMatch(team1, team2);
//        } else {
//            this.playMatch(team2, team1);
//        }
//    }
//
//    public void playMatch(Team BattingTeam, Team BowlingTeam) {
//        Player playerNumber1 = BattingTeam.listOfPlayers.get(0);
//        Player playerNumber2 = BattingTeam.listOfPlayers.get(1);
//        Player Striker = playerNumber1;
//        Player nonStriker = playerNumber2;
//        Player Bowler = BowlingTeam.listOfPlayers.get(0);
//        int flag = 0;
//        for (int overnum = 0; overnum < overs; overnum++) {
//            for (int j = 0; j < 6; j++) {
//                Bowler.incrementBallsBowled();
//                int run = randomfunction();
////                Ball nball = new Ball(overnum, j + 1, Bowler, Striker, run);
////                BattingTeam.BattingBalls.add(nball);
//                //System.out.println(run);
//                if (run == 7) {
//                    Striker.incrementBallsFaced();
//                    BattingTeam.incrementwicket();
//                    Bowler.incrementWickets();
//                    if (BattingTeam.getWicket() == 2) {
//                        flag = 1;
//                        break;
//                    } else {
//                        for (Player player : BattingTeam.listOfPlayers) {
//                            if (Striker == player) {
//                                player.outOrNot = true;
//                                Striker = BattingTeam.getNewBatsman(nonStriker);
//                                break;
//                            }
//                        }
//                    }
//                } else {
//                    BattingTeam.incrementrun(run);
//                    Striker.incrementrun(run);
//                    Striker.incrementBallsFaced();
//                    if (run % 2 == 1) {
//                        Player temp = Striker;
//                        Striker = nonStriker;
//                        nonStriker = temp;
//                        //Strike change.
//                    } else {
//
//                    }
//                }
//            }
//            Player temp = Striker;
//            Striker = nonStriker;
//            nonStriker = temp;
//            //Changing strike after each over.
//            int index = BowlingTeam.listOfPlayers.indexOf(Bowler);
//            index++;
//            index = (int) (index % playerCount);
//            Bowler = BowlingTeam.listOfPlayers.get(index);
//            if (flag == 1) {
//                break;
//            }
//
//        }
//
//        //Scoreboard nwScoreboard = new Scoreboard();
//        //nwScoreboard.printScoreboard(BattingTeam,BowlingTeam);
//        BattingTeam.endInning();
//        //nwScoreboard.printBallStatus(BattingTeam);
//
//        flag = 0;
//        playerNumber1 = BowlingTeam.listOfPlayers.get(0);
//        playerNumber2 = BowlingTeam.listOfPlayers.get(1);
//        Striker = playerNumber1;
//        nonStriker = playerNumber2;
//        Bowler = BattingTeam.listOfPlayers.get(0);
//        for (int overnum = 0; overnum < overs; overnum++) {
//            for (int j = 0; j < 6; j++) {
//                int run = randomfunction();
//                Bowler.incrementBallsBowled();
////                Ball nball = new Ball(overnum, j + 1, Bowler, Striker, run);
////                BowlingTeam.BattingBalls.add(nball);
//                //System.out.println(run);
//                if (run == 7) {
//                    Striker.incrementBallsFaced();
//                    BowlingTeam.incrementwicket();
//                    Bowler.incrementWickets();
//                    if (BowlingTeam.getWicket() == 2) {
//                        flag = 1;
//                        break;
//                    } else {
//                        for (Player player : BowlingTeam.listOfPlayers) {
//                            if (player == Striker) {
//                                Striker.outOrNot = true;
//                                Striker = BowlingTeam.getNewBatsman(nonStriker);
//                                break;
//                            }
//                        }
//                    }
//                } else {
//                    if (BowlingTeam.getFinalScore() > BattingTeam.getFinalScore()) {
//                        flag = 1;
//                        break;
//                    }
//                    BowlingTeam.incrementrun(run);
//                    Striker.incrementrun(run);
//                    Striker.incrementBallsFaced();
//                    if (run % 2 == 1) {
//                        Player temp = Striker;
//                        Striker = nonStriker;
//                        nonStriker = temp;
//                        //Strike change.
//                    } else {
//
//                    }
//                }
//            }
//            // changing the strike at over change.
//            Player temp = Striker;
//            Striker = nonStriker;
//            nonStriker = temp;
//            int index = BattingTeam.listOfPlayers.indexOf(Bowler);
//            index++;
//            index = (int) (index % (playerCount));
//            Bowler = BattingTeam.listOfPlayers.get(index);
//
//            if (flag == 1) {
//                break;
//            }
//        }
//        //nwScoreboard.printScoreboard(BowlingTeam,BattingTeam);
//        BowlingTeam.endInning();
//        //nwScoreboard.printBallStatus(BowlingTeam);
//
//    }
//
//    public int randomfunction() {
//        int val = (int) (Math.random() * 100);
//        if (val > 90) {
//            return 7;
//        } else {
//            int runval = (int) (Math.random() * 7);
//            return runval;
//        }
//    }
//
//    public void printScoreboard() {
//        //later
//    }
//
////    public String MatchResult() {
////        String result;
////        if (team1.getFinalScore() > team2.getFinalScore()) {
////            result = team1.getTeamName() + "has won the toss and elected to bat first";
////        } else if (team1.getFinalScore() < team2.getFinalScore()) {
////            result = team2.getTeamName() + "has won the toss and elected to bat first";
////        } else {
////            result = "MATCH DRAWN";
////        }
////        return result;
////    }
//}
//

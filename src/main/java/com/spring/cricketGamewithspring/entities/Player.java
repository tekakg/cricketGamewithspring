package com.spring.cricketGamewithspring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Scanner;
@Entity
public class Player {
    @Id
    private int id;
    private String name;
    private String role;
    private int run;
    private int BallsFaced;
    private int wickets;
    private int BallsBowled;
    public boolean outOrNot;


    public String getname() {

        return name;
    }

    public String getrole() {

        return role;
    }

    public void incrementrun(int run) {

        this.run += run;
    }

    public void incrementBallsFaced() {

        this.BallsFaced++;
    }
    public int getplayerrun()
    {

        return run;
    }
    public int getBallsFaced()
    {

        return BallsFaced;
    }
    public void incrementBallsBowled(){
        this.BallsBowled++;
    }
    public int getBallsBowled(){
        return BallsBowled;
    }
    public void incrementWickets(){
        this.wickets++;
    }
    public int getWickets(){
        return wickets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


package com.spring.cricketGamewithspring.model;

import jakarta.persistence.*;

@Entity
@Table(name="_Player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String role;
    private int run;
    private int BallsFaced;
    private int wickets;
    private int BallsBowled;
    public boolean outOrNot;
    public Player()
    {

    }
    public Player(String name,String role)
    {
        this.name=name;
        this.role=role;
        this.run=0;
        this.BallsFaced=0;
        this.wickets=0;
        this.BallsBowled=0;
        this.outOrNot=false;
    }//Creating player object

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


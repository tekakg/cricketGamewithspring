package com.spring.cricketGamewithspring.controller;

import com.spring.cricketGamewithspring.model.CricketMatchDto;
import com.spring.cricketGamewithspring.services.CricketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private CricketService cricketService;

    @GetMapping("/")
    public String message() {
        return "Lets Start the Match";
    }

    @PostMapping("/match-info")
    public void setMatch(@RequestBody CricketMatchDto match) {
        //service will create the match object and save it in CricketDao.
        cricketService.createMatch(match);

    }

//    @GetMapping("/flip-the-coin")
//    public String getTossResult() {
//        return cricketService.getTossResult();
//    }
//
}
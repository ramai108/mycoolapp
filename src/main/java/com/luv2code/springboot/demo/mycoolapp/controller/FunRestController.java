package com.luv2code.springboot.demo.mycoolapp.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    //inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    //expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach Name: " + coachName + " , Team Name: " + teamName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "hello world! time on server is " + LocalDateTime.now();
    }

    //expose a new endpoint for 'workout'
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Today i am going to the gym to do pushups!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is a very lucky day for you";
    }



}

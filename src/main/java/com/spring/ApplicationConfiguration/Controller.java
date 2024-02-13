package com.spring.ApplicationConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    //inject properties for: coach.name and team.name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //exposing "/" new endpoint for "teamInfo"
    @GetMapping("/teaminfo")
    public String getTeaminfo(){
        return "Coach: " +coachName + ", Team name: "+ teamName;
    }
    
}

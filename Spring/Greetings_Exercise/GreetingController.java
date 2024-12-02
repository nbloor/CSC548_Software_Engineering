package com.example.greeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.time.LocalTime;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String showGreeting(Model model) {
        LocalTime time = LocalTime.now();
        int hour = time.getHour();

        String timeOfDay;
        if (hour < 12){
            timeOfDay = "Morning";
        }

        else if (hour < 18){
            timeOfDay = "Afternoon";
        }

        else {
            timeOfDay = "Evening";
        }

        model.addAttribute("timeOfDay", timeOfDay);
        return "greeting";
    }
    

}

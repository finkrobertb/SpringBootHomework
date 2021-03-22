package com.tts.SpringBootHomework.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

// Web controller that outputs to browser
@RestController

public class MainController
{
    // Use this method for root URL
    @RequestMapping("/")
    public String home()
    {
        // Return String to caller (in this case, the home() method)
        return "Hello World (and Josh)!";
    }
}

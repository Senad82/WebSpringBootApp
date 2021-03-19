package com.teamone.WebSpringBootApp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Controler {
    
    @RequestMapping("/adminlogin")
    public String login(){
        System.out.println("Home page...");
        return "adminlogin";
    }

}

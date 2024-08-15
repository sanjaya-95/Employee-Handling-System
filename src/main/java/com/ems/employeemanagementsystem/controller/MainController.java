package com.ems.employeemanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
    @GetMapping("/login")
    public String login(){

        return "login";
    }
    @GetMapping("/")
    public String mainPage(){
        return "index";
    }

    @GetMapping("/hello-world")
    public String helloWorld(Model model){
        model.addAttribute("message", "Hello about!");
        return "about";
    }

}

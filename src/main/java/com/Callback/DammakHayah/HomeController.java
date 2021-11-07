package com.Callback.DammakHayah;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home.html";
    }

    @GetMapping("/about")
    public String about(){
        return "about.html";
    }

    @GetMapping("/login")
    public String login(){
        return "login.html";
    }





}

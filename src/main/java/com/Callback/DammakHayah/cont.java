package com.Callback.DammakHayah;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class cont {
    @GetMapping("/")
    public String getRoot() {
        return "login";
    }
}
package com.domain.app.controller.Main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sub {
    @GetMapping(value = "hello")
    public String hello(Model model){
        model.addAttribute("data", "hello this is test");
        return "hello";
    }
}

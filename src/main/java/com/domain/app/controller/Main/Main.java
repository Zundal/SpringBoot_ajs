package com.domain.app.controller.Main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {
    @GetMapping(value = "/")
    public String index() {
        return "index";
    }
}

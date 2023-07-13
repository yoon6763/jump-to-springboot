package com.jumptospringboot.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/sbb")
    public void index() {
        System.out.println("index");
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}

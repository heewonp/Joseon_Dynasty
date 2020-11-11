package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class KingsListController{

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/lda")
    public String lda(){
        return "lda";
    }

    @GetMapping("/keyword")
    public String keyword(){
        return "keyword";
    }

    @GetMapping("/chart")
    public String chart(){
        return "chart";
    }


}
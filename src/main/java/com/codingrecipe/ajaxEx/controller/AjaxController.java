package com.codingrecipe.ajaxEx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AjaxController {
    @GetMapping("/ex01")
    public String ex01() {
        System.out.println("AjaxController.ex01");
        return "index"; // .html
    }
}

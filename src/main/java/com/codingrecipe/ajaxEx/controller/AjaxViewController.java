package com.codingrecipe.ajaxEx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AjaxViewController {
    @GetMapping("/ajax-ex-01")
    public String ajaxEx01() {
        return "ajax-ex-01";
    }
}

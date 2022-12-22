package com.codingrecipe.ajaxEx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AjaxViewController {
    @GetMapping("/ajax-ex-01")
    public String ajaxEx01() {
        return "ajax-ex-01";
    }

    @GetMapping("/ajax-ex-02")
    public String ajaxEx02() {
        return "ajax-ex-02";
    }

    @GetMapping("/ajax-ex-03")
    public String ajaxEx03() {
        return "ajax-ex-03";
    }

    @GetMapping("/ajax-ex-04")
    public String ajaxEx04() {
        return "ajax-ex-04";
    }

    @GetMapping("/ajax-ex-05")
    public String ajaxEx05() {
        return "ajax-ex-05";
    }

    @GetMapping("/ajax-ex-06")
    public String ajaxEx06() {
        return "ajax-ex-06";
    }

}

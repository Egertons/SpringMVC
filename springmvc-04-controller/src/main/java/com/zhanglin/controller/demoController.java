package com.zhanglin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class demoController {

    @RequestMapping("/demo")
    public String demo(Model model){
        model.addAttribute("list","HelloWorld");
        return "demo";
    }
}

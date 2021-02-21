package com.zhanglin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class text {
    @RequestMapping("/a")
    public String text(){
        return "text";
    }

    @RequestMapping("/ajax")
    public void ajax(String name,Model model){
        if (name.equals("zhanglin")){
            model.addAttribute("kkk","正确");
        }else {
            model.addAttribute("kkk","错误");
        }
    }
}

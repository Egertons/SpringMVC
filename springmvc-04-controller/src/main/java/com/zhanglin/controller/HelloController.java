package com.zhanglin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    //@RequestMapping("/zhanglin/{a}/{b}")
    @GetMapping("/zhanglin/{a}/{b}")//限定只有GET方式可以被正常请求;
    public String a(@PathVariable String a, @PathVariable String b, Model model){
        model.addAttribute("a",a+b);
        return "hello";
    }
}
/*
* 以此类推：还有诸如@DeleteMapping等相关注解；
* */

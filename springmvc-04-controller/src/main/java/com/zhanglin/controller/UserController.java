package com.zhanglin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
    public String userText1(@RequestParam("username") String name, @RequestParam("userage") int age, Model model){
        System.out.println("name="+name);
        System.out.println("age="+age);
        model.addAttribute("msg","申请用户为："+name+"年龄为："+age);
        return "user";
    }
}
/*
* 这里需要注意的是：
*   在方法的参数列表中@RequestParam和@PathVariable不能同时使用
*   因为，@RequestParam的意义就在于 在显式的写明getURL风格的时候对于URL中的参数与Javabean之间的关系进一步明确；
*   而@PathVariable注解特性的基础是“隐式”的URL请求风格，这在根本上就是与@RequestParam相冲突的！
* */

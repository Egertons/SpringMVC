package com.zhanglin.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhanglin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

//@RestController  这个注解表明该类下的所有方法都不走视图解析器。
//在前后端分离的项目中几乎所有的都需要写@RestController
@Controller
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody  //写上这个注解就意味着它不会去走视图解析器，而会直接返回一个字符串
    public String json1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("张霖",21,"男");
        String s = mapper.writeValueAsString(user);
        return s;
    }

    @RequestMapping("/fastjson")
    @ResponseBody
    public String fastjson(){
        List<User> userList = new ArrayList<>();
        User user1 = new User("张霖1",21,"男");
        User user2 = new User("张霖2",21,"男");
        User user3 = new User("张霖3",21,"男");
        User user4 = new User("张霖4",21,"男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        String s = JSON.toJSONString(userList);
        return s;
    }
}

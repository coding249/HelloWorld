package com.examples.demo.controller;


import com.examples.demo.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


/* 注解：
    @Controller     返回html页面
    @RestController 返回json、字符串
 */

@RestController
@RequestMapping("/user")
public class CloudController {

    @RequestMapping("/json")
    public User getUser(){
        User user = new User();
        user.setId(1589951640);
        user.setUsername("任登辉");
        user.setPassword("520");

        Date date = new Date();
        user.setDatestr(date.toString());
        return user;
    }

    /*
    @RequestMapping("/list")
    public List<User> etUserList(){
        List<User> userList = new ArrayList<>();
        User user1 = new User(2001,"1A","520");
        User user2 = new User(2002,"2B","520");
        userList.add(user1);
        userList.add(user2);
        return userList;
    }

    @RequestMapping("/map")
    public Map<String, Object> getMap() {
        Map<String, Object> map = new HashMap<>(3);
        User user = new User(1,"倪升武","123456");
        map.put("作者信息", user);
        map.put("博客地址", "http://blog.itcodai.com");
        map.put("CSDN地址", "http://blog.csdn.net/eson_15");
        map.put("粉丝数量", 4153);
        return map;
    }*/
}

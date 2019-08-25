package com.cy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Administrator
 * @Date: 2019/8/5 19:15
 * @Description:
 */
@Controller
@RequestMapping("/a")
public class a {
    @RequestMapping("/test")
    public  String test(){
        System.out.println("执行了test");
        return "success" ;
    }

}
package com.cy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Administrator
 * @Date: 2019/8/3 21:32
 * @Description:
 */
@Controller
public class ControllerHello {

    @RequestMapping("hello")
    public String SayHello(){
        System.out.println("执行了：SpringMVC入门案例");
        return "success" ;
    }
}
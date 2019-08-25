package com.cy.controller;

import com.cy.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Administrator
 * @Date: 2019/8/3 23:58
 * @Description:请求参数绑定
 */
@Controller
@RequestMapping("pages")
public class ControllerParam {

    /**
     * @param: 请求参数绑定
     * @return: 
     * @date: 2019/8/4 
     */
    @RequestMapping("param")
    public  String Param(String username,String password){
        System.out.println(username+" : "+password);
        System.out.println("执行了");
        return "success" ;
    }

    @RequestMapping("us")
    public  String us(User user){
        System.out.println("user执行了");
        System.out.println(user);

        return "success" ;
    }


}
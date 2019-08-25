package com.cy.controller;

import com.cy.sysException.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Administrator
 * @Date: 2019/8/11 13:25
 * @Description:
 */
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("test")
    public  String Test() throws SysException {
        System.out.println("test执行了。。。。。");


        try {
            int a =10/0 ;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("计算的值不对") ;
        }


        return "success" ;
    }
}
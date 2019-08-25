package com.cy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: Administrator
 * @Date: 2019/8/9 21:09
 * @Description:
 */
@Controller
public class ControllerTest {
    @RequestMapping("a")
    public String a(HttpServletRequest request){
        request.getSession().getServletContext().getRealPath("/ss/");
        return "" ;
    }
}
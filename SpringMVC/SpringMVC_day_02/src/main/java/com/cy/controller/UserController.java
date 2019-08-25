package com.cy.controller;

import com.cy.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther: Administrator
 * @Date: 2019/8/4 19:05
 * @Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * @param:返回字符串
     * @return: success
     * @date: 2019/8/4 
     */
    @RequestMapping("/testString")
    public String TestString(Model model){
        System.out.println("执行了testString.......");
        //模拟从数据库中查询user对象
        User user = new User() ;
        user.setUname("王");
        user.setUpassword("reret");
        user.setUage(3);
        model.addAttribute("user",user) ;
        return "success";
    }
    /**
     * @param: 测试方法
     * @return: succe
     * @date: 2019/8/4
     */
    @RequestMapping("/test")
    public String test(){
        System.out.println("执行了test....");
        return "a" ;
    }
    @RequestMapping("testModelAndView")
    public ModelAndView testModelAndView(){
        System.out.println("执行了testModelAndView.......");
        //ModelAndView是springMVC内置对象可以直接new出来
        ModelAndView mv = new ModelAndView() ;
        User user = new User() ;
        user.setUname("王王王");
        user.setUpassword("小小小");
        user.setUage(10) ;
        //1、以键值对的方式吧user对象存到mv对象中，也会吧user对象存到Request域中
        mv.addObject("user",user) ;

        //2、直接跳转到页面
        mv.setViewName("success");
        return mv ;
    }
    @RequestMapping("testAjax")
    public void testAjax(@RequestBody String body ){
        System.out.println("执行了testAjax...");
        System.out.println(body);
    }
}
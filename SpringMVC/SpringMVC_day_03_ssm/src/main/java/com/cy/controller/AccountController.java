package com.cy.controller;

import com.cy.entity.Account;
import com.cy.service.IAccountServiceDAO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * @Auther: Administrator
 * @Date: 2019/8/12 23:10
 * @Description:控制器类
 */
@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    private IAccountServiceDAO accountServiceDAO ;

    @RequestMapping("list1")
    public ModelAndView list1(  HttpServletRequest request){
        System.out.println("表现层。。执行了list1....");
        List<Account> lists =  accountServiceDAO.accountLiset();

        ModelAndView mv = new ModelAndView() ;
        mv.addObject("lists",lists) ;
        mv.setViewName("list");

        return mv ;


    }
    @RequestMapping("list2")
    public String list2(Model model){
        System.out.println("表现层。。执行了list2....");
        List<Account> lists =  accountServiceDAO.accountLiset();
        model.addAttribute("lists",lists) ;

        return "list2" ;



    }
/**
 * @param: 保存方法
 * @return: 
 * @date: 2019/8/18 
 */
    @RequestMapping("save")
    public void save(Account account, HttpServletResponse response, HttpServletRequest request) throws IOException {
        //自动封装到account中
        accountServiceDAO.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/list2");
        //return "list" ;
    }
}
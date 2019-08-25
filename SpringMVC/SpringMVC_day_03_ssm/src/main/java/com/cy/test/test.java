package com.cy.test;

import com.cy.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: Administrator
 * @Date: 2019/8/13 22:13
 * @Description:
 */
public class test {
    @Test
    public  void run1(){
        //加载配置文件
       ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml") ;
       //获取对象
        AccountServiceImpl as =(AccountServiceImpl) ac.getBean("accountService");

        as.accountLiset() ;


    }
}
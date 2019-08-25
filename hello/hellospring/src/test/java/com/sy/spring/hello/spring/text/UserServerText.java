package com.sy.spring.hello.spring.text;


import com.cy.spring.hello.spring.Service;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServerText {

    private Service userService ;

    @Before
    public void before(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring-context.xml");
        userService = (Service)applicationContext.getBean("userService")  ;
        System.out.println("-----------初始化之前------------");

    }

    @Test
    public  void test(){
        System.out.println("-----------测试哦-----------");
        userService.sy();
    }

    @After
    public void after(){
        System.out.println("----------测试之后----------");
    }
}

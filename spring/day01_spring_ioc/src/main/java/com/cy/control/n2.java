package com.cy.control;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: day01_spring_ioc
 * @description: 执行者
 * @author: MrChen
 * @create: 2019-06-20 22:08
 */
public class n2 {
    public static void main(String[] args) {
     //   n1 a = new n1() ;
        ApplicationContext a3 =new ClassPathXmlApplicationContext("bean.xml") ;

        n1 a2 =(n1) a3.getBean("a");;

       // a.toString() ;
        a2.save();
    }
}
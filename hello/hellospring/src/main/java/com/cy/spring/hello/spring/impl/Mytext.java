package com.cy.spring.hello.spring.impl;


import com.cy.spring.hello.spring.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytext {
    private  static  final Logger logger = LoggerFactory.getLogger(Mytext.class) ;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml") ;
        Service userService = (Service) applicationContext.getBean("userService");
        userService.sy();

        logger.debug("debug的日志");
        logger.info("info的日志");
        logger.warn("warn的日志");
        logger.error("error的日志");
    }
}

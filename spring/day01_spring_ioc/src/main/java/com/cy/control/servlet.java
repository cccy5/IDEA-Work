package com.cy.control;

import com.cy.service.IUserServiceDAO;
import com.cy.service.impl.IuserServiceDAOImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: 获取spring的ioc容器
 * @description: 表现层 调用业务层
 * @author: MrChen
 * @create: 2019-06-18 22:14
 */
public class servlet {
      public static void main(String[] args) {
    //  IUserServiceDAO userServiceDAO = new IuserServiceDAOImpl();
      //  userServiceDAO.save();
        //1.获取核心容器
        ApplicationContext as = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取bean对象
        IUserServiceDAO userServiceDAO =(IUserServiceDAO) as.getBean("userServiceDAOImpl") ;




    }
}
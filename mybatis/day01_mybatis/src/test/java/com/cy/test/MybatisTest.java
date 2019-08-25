package com.cy.test;


import com.cy.mybatis.IDAO.IUserDAO;
import com.cy.mybatis.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @program: day_01_mybatis
 * @description: mybatis测试
 * @author: MrChen
 * @create: 2019-05-18 13:06
 * mybatis入门案例
 */
public class MybatisTest {
    /**
    * @Description: 入门案例
    * @Param:
    * @return:
    * @Author: Mr.chen
    * @Date: 2019/5/18
    */
    public static void main(String[] args) throws Exception {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml") ;
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder() ;
        SqlSessionFactory factory = builder.build(in) ;
        //3.使用工厂创建SqlSession代理对象
        SqlSession sqlSession = factory.openSession() ;
        //4.使用SQLSession创建DAO接口的代理对象
        IUserDAO userDAO = sqlSession.getMapper(IUserDAO.class) ;
        //5.使用代理对象执行方法
        List<User> userList = userDAO.findAll() ;
        for (User user:userList){
            System.out.println(user);
        }
        //6.释放资源
        sqlSession.close();
        in.close();
    }


}
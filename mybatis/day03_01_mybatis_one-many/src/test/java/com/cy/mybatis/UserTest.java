package com.cy.mybatis;


import com.cy.mybatis.Idao.IUserDAO;
import com.cy.mybatis.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import java.util.List;

/**
 * @program: day03_01_mybatis
 * @description: 测试类
 * @author: MrChen
 * @create: 2019-06-10 21:33
 */
public class UserTest {

    private SqlSession sqlSession ;
    private InputStream in ;

    private IUserDAO userDAO ;
    @Before
    public void inin() throws  Exception{
        in = Resources.getResourceAsStream("sqlMapConfig.xml") ;
        SqlSessionFactory SqlSessionFactory = new SqlSessionFactoryBuilder().build(in) ;

        sqlSession = SqlSessionFactory.openSession() ;

        userDAO = sqlSession.getMapper(IUserDAO.class) ;

    }

    @After
    public void destory() throws  Exception{
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    @Test
    public void findAll(){
        List<User> userList = userDAO.findAll();
        for(User u : userList){
            System.out.println("这是一个用户信息");
            System.out.println(u);
            System.out.println(u.getAccounts());
        }
    }
}
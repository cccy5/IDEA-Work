package com.cy.mybatis;

import com.cy.mybatis.Idao.IAccountDAO;


import com.cy.mybatis.entity.Account;
import com.cy.mybatis.entity.AccountUser;
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
public class AccountTest {

    private SqlSession sqlSession ;
    private InputStream in ;

    private IAccountDAO accountDAO ;
    @Before
    public void inin() throws  Exception{
        in = Resources.getResourceAsStream("sqlMapConfig.xml") ;
        SqlSessionFactory SqlSessionFactory = new SqlSessionFactoryBuilder().build(in) ;

        sqlSession = SqlSessionFactory.openSession() ;

        accountDAO = sqlSession.getMapper(IAccountDAO.class) ;

    }

    @After
    public void destory() throws  Exception{
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    @Test
    public void findAll(){
        List<Account> accountList = accountDAO.findAll() ;
        for (Account a : accountList){
            System.out.println("这是一个account信息");
            System.out.println(a);
            System.out.println(a.getUser());
        }
    }

    /**
    * @Description: 查询所有账户并带有用户名称和地址信息
    * @Param:
    * @return:
    * @Author: Mr.chen
    * @Date: 2019/6/10
    */
        @Test
    public void findAccountAll(){
        List<AccountUser> accountUsers = accountDAO.findAllAccount() ;
        for(AccountUser accountUser : accountUsers){
            System.out.println(accountUser);
        }
    }
}
package com.cy.test;

import com.cy.dao.IAccountDAO;
import com.cy.entity.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * @Auther: Administrator
 * @Date: 2019/8/14 23:06
 * @Description:
 */

public class testMybatis {
    @Test
    public  void test() throws Exception {
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml") ;

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in) ;

        SqlSession session = sqlSessionFactory.openSession() ;

        IAccountDAO accountDAO = session.getMapper(IAccountDAO.class) ;

        List<Account> as = accountDAO.accountList();

        for (Account ac:as){
            System.out.println(ac);
        }
        session.close();
        in.close();


    }
}
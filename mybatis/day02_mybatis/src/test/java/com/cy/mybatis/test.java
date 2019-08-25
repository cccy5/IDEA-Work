package com.cy.mybatis;


import com.cy.dao.IAdmin;
import com.cy.entity.Admin;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @program: mybatis_02
 * @description: 测试类
 * @author: MrChen
 * @create: 2019-05-23 19:41
 */
public class test {

    @Test
    public void init() throws  Exception{

        //1.读取配置文件

        InputStream in = Resources.getResourceAsStream("Sql.xml") ;
        //2.创建工厂
        SqlSessionFactory  factory = new SqlSessionFactoryBuilder().build(in) ;


        //3.获取sqlSession
        SqlSession sqlSession = factory.openSession() ;

        //4.创建代理对象
        IAdmin iAdmin = sqlSession.getMapper(IAdmin.class) ;

        //5.执行查询方法
        List<Admin> adminList = iAdmin.findAll() ;

        for(Admin admin : adminList){
            System.out.println(admin);
        }
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

}
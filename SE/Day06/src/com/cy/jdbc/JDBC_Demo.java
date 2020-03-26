package com.cy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @Auther: Administrator
 * @Date: 2020/3/22 21:06
 * @Description:  jdbc 测试修改类
 */
public class JDBC_Demo {
    public static void main(String[] args) {
        try {
            //注册加载驱动
            Class.forName("com.mysql.jdbc.Driver") ;
            //获取数据库连接对象
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my4","root","root") ;
            //执行sql
            PreparedStatement ps  = con.prepareStatement("update student set name = '666' where id = 5") ;
            System.out.println("con:"+con);
            System.out.println("ps:"+ps);

            int i = ps.executeUpdate();
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
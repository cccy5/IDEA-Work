package com.cy.jdbc;

import com.cy.entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2020/3/22 21:37
 * @Description:
 */
public class JDBC_Demo2 {



    public static void main(String[] args) throws Exception{

        select() ;
    }

    public static void select()throws  Exception {
        Class.forName("com.mysql.jdbc.Driver") ;
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my4","root","root") ;

        PreparedStatement ps = con.prepareStatement("select * from  student") ;

        ResultSet resultSet = ps.executeQuery();



        List<Student> list = new ArrayList<>() ;
        while (resultSet.next()){
            Student student = new Student() ;
           // int id =  ;
         //   String name  = resultSet.getString("name") ;
         //   int age = resultSet.getInt("age") ;
        //    String sex = resultSet.getString("sex") ;

              student.setId(resultSet.getInt("id"));
         //   System.out.println(student.getId());
              student.setName(resultSet.getString("name"));
              student.setAge(resultSet.getInt("age") );
              student.setSex(resultSet.getString("sex"));
         //   System.out.println(student);
            list.add(student) ;
          //  System.out.println(list);
       //     System.out.println("student:"+student);

         //  System.out.println("list:"+list);
        }
       // System.out.println(list.get(1));
        System.out.println(list);

        for (Student student : list) {
            System.out.println(student);
        }
    }
}
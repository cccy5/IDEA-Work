package com.cy.myservlet.IUser.IuserImpl;

import com.cy.myservlet.IUser.Iuser;
import com.cy.myservlet.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: MyServlet
 * @description: 用户接口的实现类
 * @author: MrChen
 * @create: 2019-04-15 20:08
 */
public class IuserImpl implements Iuser {
    public User get(int id) throws SQLException{
        ResultSet rst = null ;
        PreparedStatement pst = null ;
        Connection conn = null ;
        String sql  = "select * from user where id = ?";
        User user = null;
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //驱动管理器获得驱动连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspservlet","root","root") ;
            pst= conn.prepareStatement(sql);
            pst.setInt(1,id);
            rst= pst.executeQuery();
            while (rst.next()) {
                user = new User();

                user.setUsername(rst.getString("username"));
                user.setUserpassword(rst.getString("userpassword"));
                user.setAge(rst.getInt("age"));

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(rst!=null)
                rst.close() ;
            if(pst!=null)
                pst.close() ;
            if(conn!=null)
                conn.close();
        }
        return user;  //返回
    }

    public void delete(int id) throws SQLException  {

        ResultSet rs = null ;
        PreparedStatement ps = null ;
        Connection con = null ;
        int state = 0 ;
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //驱动管理器获得驱动连接
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspservlet","root","root") ;
            ps= con.prepareStatement("delete from user where id = ?");
            ps.setInt(1,id);
            state = ps.executeUpdate() ;
            if(state!=0)
                System.out.println("删除成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            if(ps!=null){
                ps.close();
            }
            if(con!=null)
                con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


    public User login(String username,String userpassword)throws  SQLException {
        ResultSet rs = null ;
        PreparedStatement ps = null ;
        Connection con = null ;
        String sql = "select * from user where username = ?  and  userpassword = ?" ;

        User user = new User() ;

        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //驱动管理器获得驱动连接
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspservlet","root","root") ;
            ps= con.prepareStatement(sql);


            ps.setString(1,user.getUsername());
            ps.setString(2,user.getUserpassword());
            rs = ps.executeQuery() ;

            if (rs.next()){
                user.setId(rs.getInt("id"));
                user.setAge(rs.getInt("age"));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(rs!=null)
                rs.close();
             if(ps!=null)
                 ps.close();
             if(con!=null)
                 con.close();


        }
        return user ;
    }

    public List<User> list()throws SQLException {
        List<User> list = new ArrayList<User>();//创建集合

        ResultSet rs = null ;
        PreparedStatement ps = null ;
        Connection con = null ;

        User user = null;
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //驱动管理器获得驱动连接
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspservlet","root","root") ;

            ps = con.prepareStatement("select * from user");
            rs = ps.executeQuery();

            while (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setUserpassword(rs.getString("userpassword"));
                user.setAge(rs.getInt("age"));
                list.add(user);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(rs!=null)
                rs.close();
            if(ps!=null)
                ps.close();
            if(con!=null)
                con.close();
        }
            return list;

    }
    public void update(User user)throws SQLException  {
        String sql = "update user set username = ?,userpassword = ?,age = ? where id = ?";

        PreparedStatement ps = null ;
        Connection con = null ;
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //驱动管理器获得驱动连接
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspservlet","root","root") ;
            ps= con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2,user.getUserpassword());
            ps.setInt(3,user.getAge());
        //    ps.setInt(4,user.getId());
            ps.executeUpdate() ;


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ps!=null)
                ps.close();
            if(con!=null)
                con.close();
        }
    }
    public void insert(User user)throws SQLException {
     //   String sql = "INSERT INTO 'user' ('id','username','userpassword','age') VALUES ('?','?','?','?')";
      //  String sql = "insert into user (id,username,userpassword,age) valuss (?,?,?,?)" ;
        PreparedStatement ps = null ;
        Connection con = null ;
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //驱动管理器获得驱动连接
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspservlet","root","root") ;
            ps = con.prepareStatement( "insert into user (id,username,userpassword,age) values (?,?,?,?)" );
            ps.setInt(1, user.getId());
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getUserpassword());
            ps.setInt(4, user.getAge());
            ps.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ps!=null)
                ps.close();
            if(con!=null)
                con.close();
        }


    }
}
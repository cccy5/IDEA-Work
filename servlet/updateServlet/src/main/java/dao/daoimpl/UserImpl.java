package dao.daoimpl;

import dao.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @program: updateServlet
 * @description: 用户接口实现类
 * @author: MrChen
 * @create: 2019-04-29 19:27
 */
public class UserImpl implements User {
    public User update(User user) {
        Connection con = null ;
        PreparedStatement ps = null ;
        //1.注册加载驱动
        try {
            //1.注册加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myservlet","root","root") ;
            ps  = con.prepareStatement("update user  ");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
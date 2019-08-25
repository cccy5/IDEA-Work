package com.cy.myservlet.Service.ServiceImpl;

import com.cy.myservlet.IUser.Iuser;
import com.cy.myservlet.IUser.IuserImpl.IuserImpl;
import com.cy.myservlet.Service.IuserService;
import com.cy.myservlet.entity.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: MyServlet
 * @description: 用户业务逻辑实现类
 * @author: MrChen
 * @create: 2019-04-15 20:12
 */
public class IuserServiceImpl implements IuserService {

    public User loginService(String username,String userpassword) throws SQLException  {
        User user = new User() ;
        IuserImpl userImpl = new IuserImpl() ;
        try {
            user = userImpl.login(username,userpassword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

    public boolean insertService(User user)  throws SQLException {
        IuserImpl userImpl = new IuserImpl();
        try {
            userImpl.insert(user);
        }catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

    public User getService(int id) throws SQLException {

        User user = new User() ;
        IuserImpl userImpl = new IuserImpl() ;
        try {
            user = userImpl.get(id) ;
        }catch (Exception e){
            e.printStackTrace();
        }

        return user;
    }

    public boolean deleteService(int id) throws SQLException {
        IuserImpl userImpl = new IuserImpl() ;
       userImpl.delete(id);
        return false;
    }

    public List<User> listService() throws SQLException   {
        List<User>list = null ;
        IuserImpl userImpl = new IuserImpl() ;
        try {
            list = userImpl.list();
        }catch (Exception e){
            e.printStackTrace();
        }


        return list;
    }

    public void update(User user)throws SQLException  {
        IuserImpl userImpl = new IuserImpl() ;
        try {
            userImpl.update(user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
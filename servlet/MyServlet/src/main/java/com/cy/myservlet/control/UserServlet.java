package com.cy.myservlet.control;


import com.cy.myservlet.IUser.IuserImpl.IuserImpl;
import com.cy.myservlet.Service.IuserService;
import com.cy.myservlet.Service.ServiceImpl.IuserServiceImpl;
import com.cy.myservlet.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset = utf-8") ;
      //  resp.setContentType("text/html;charset = utf-8") ;

        PrintWriter out = resp.getWriter() ;
        out.println("啊哈哈哈哈 ");
        out.println("终于成功了");

        String operate = "login" ;

        try {
            operate = req.getParameter("operate") ;
            if(operate.equals("login"))
                login(req,resp) ;
            else if (operate.equals("list"))
                list(req,resp);
            else if(operate.equals("delete"))
                delete(req,resp) ;
            else if(operate.equals("get"))
                get(req,resp) ;
            else if(operate.equals("update"))
                update(req,resp) ;
            else if(operate.equals("create"))
                create(req,resp);
            else if(operate.equals("save"))
                save(req,resp);
            else if(operate.equals("edit"))
                edit(req,resp);
        }catch (Exception e){
            e.printStackTrace();
        }
    }




    private void delete(HttpServletRequest req, HttpServletResponse resp) throws SQLException, UnsupportedEncodingException {
      //  IuserServiceImpl userServiceImpl = new IuserServiceImpl() ;
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset = utf-8") ;
        IuserImpl userImpl = new IuserImpl() ;
        int id = Integer.parseInt(req.getParameter("id"));
        userImpl.delete(id);
        list(req,resp);
    }

    private void list(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset = utf-8") ;
        try {
           List<User> userList = new ArrayList<User>( );
            IuserServiceImpl userImpl = new IuserServiceImpl() ;
            userList = userImpl.listService() ;
            req.setAttribute("userList",userList);
            req.getRequestDispatcher("/user/list.jsp").forward(req,resp);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void login(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset = utf-8") ;
        try {
            String username = req.getParameter("username");

            String userpasword = req.getParameter("userpasword") ;
            User user = new User();
            IuserServiceImpl userServiceImpl  = new IuserServiceImpl() ;

            if(userServiceImpl.loginService(username, userpasword)!=null){
            req.setAttribute("user",user.getUsername());

            req.getRequestDispatcher("/user/default.jsp").forward(req,resp);
            }else{
                req.setAttribute("msg","账号密码不对，请重试");
                req.getRequestDispatcher("/user/login.jsp").forward(req,resp);
            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }
    private void create(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset = utf-8") ;
        try {
            System.out.println("create servlet");
            req.getRequestDispatcher("/user/save.jsp").forward(req,resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




    private void get(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ServletException, IOException {
        System.out.println("get servlet");
        User user = new User() ;
        IuserServiceImpl userServiceImpl = new IuserServiceImpl() ;
        int id  = Integer.parseInt(req.getParameter("id")) ;
        user = userServiceImpl.getService(id) ;
        req.setAttribute("user",user);
        req.getRequestDispatcher("/user/get.jsp").forward(req,resp);
    }

    private void save(HttpServletRequest req, HttpServletResponse resp) throws SQLException, UnsupportedEncodingException {
       // req.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset = utf-8") ;
        String username = req.getParameter("username") ;
        String userpassword = req.getParameter("userpassword");
        int age = Integer.parseInt(req.getParameter("age")) ;
        int id = Integer.parseInt(req.getParameter("id")) ;

        User user = new User() ;
        user.setId(id);
        user.setUsername(username);
        user.setUserpassword(userpassword);
        user.setAge(age);
        System.out.println(user.getUsername()+"save username");
      IuserServiceImpl userService = new IuserServiceImpl() ;
      userService.insertService(user) ;
      list(req,resp);

    }
    private void update(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
        //req.setCharacterEncoding("utf-8");
       // resp.setContentType("text/html;charset = utf-8") ;

        IuserServiceImpl userServiceImpl = new IuserServiceImpl() ;
        User user = new User() ;

        String usernamer = req.getParameter("username") ;
        System.out.println("userneme: "+usernamer);
        int id = Integer.parseInt(req.getParameter("userid")) ;
        req.setAttribute("user",user);

        userServiceImpl.getService(id);
        userServiceImpl.update(user);
        try {
            list(req,resp);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private void edit(HttpServletRequest req, HttpServletResponse resp) throws IOException, SQLException, ServletException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset = utf-8") ;

        int id = Integer.parseInt(req.getParameter("id")) ;
        User user = new User() ;
        user.setId(id);
        System.out.println("edit: "+user.getId());
        IuserServiceImpl userServiceImpl = new IuserServiceImpl() ;
        user = userServiceImpl.getService(id) ;

        req.setAttribute("user",user);
        req.getRequestDispatcher("/user/edit.jsp").forward(req,resp);
    }
}

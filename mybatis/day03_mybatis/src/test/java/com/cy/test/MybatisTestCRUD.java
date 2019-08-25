package com.cy.test;

import com.cy.mybatis.IDAO.IUserDAO;
import com.cy.mybatis.entity.Admin;
import com.cy.mybatis.entity.QueryVo;
import com.cy.mybatis.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: day_01_mybatis
 * @description: mybatis的增删改查操作
 * @author: MrChen
 * @create: 2019-05-21 19:10
 */
public class MybatisTestCRUD {

    private SqlSession sqlSession ;
    private  InputStream in ;
    private  IUserDAO userDAO ;

    @Before
    public  void init() throws  Exception{
        //1.读取配置文件
         in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in) ;
        //3.获取SQLSession
        sqlSession = factory.openSession() ;

        //4创建代理对象
        userDAO = sqlSession.getMapper(IUserDAO.class) ;
    }

    //执行后关闭和提交的事务
    @After
    public  void destory ()throws  Exception{
        //提交事务
        sqlSession.commit();
        //6释放资源
        sqlSession.close();
        in.close();
    }

    //查询所有
    @Test
    public void FindAll() {

        //5执行查询所有方法
        List<User> userList = userDAO.findAll() ;
        for(User user : userList){
            System.out.println(user);
        }


    }

    //通过id获取用户
    @Test
    public void findByid(){
        User user = userDAO.findById(41);
        System.out.println("user:+"+user);
    }

    //通过名字模糊查询
    @Test
    public void findByName(){
        List<User> userList = userDAO.findByName("%tom%") ;
        for(User user : userList){
            System.out.println(userList);
        }
    }


    //通过queryVo条件查询
    @Test
    public void QueryVo(){
        User user = new User() ;
        Admin admin = new Admin() ;
        QueryVo queryVo = new QueryVo() ;
        user.setName("%tom%");
        admin.setName("%tom%");
        queryVo.setAdmin(admin);
        queryVo.setUser(user);
        List<User> queryVoList = userDAO.QueryVo(queryVo) ;
        for(User user1 : queryVoList){
            System.out.println(user1);
        }
    }

    //通过条件查询
    @Test
    public void findUserByCondition(){
        User u = new User() ;
        u.setSex("男");
        u.setName("老王");
        List<User> userList = userDAO.findUserByCondition(u) ;
        for(User user : userList){
            System.out.println(user);
        }
    }

    //通过queryVo条件查询
    @Test
    public void findUserInIds(){
        QueryVo queryVo = new QueryVo() ;
        List<Integer> list = new ArrayList<Integer>() ;
        list.add(41) ;
        list.add(42) ;
        list.add(45) ;
        queryVo.setIds(list);

        List<User> queryVoList = userDAO.findUserInIds(queryVo) ;
        for(User user1 : queryVoList){
            System.out.println(user1);
        }
    }
}
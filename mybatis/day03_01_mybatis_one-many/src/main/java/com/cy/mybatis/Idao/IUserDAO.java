package com.cy.mybatis.Idao;

import com.cy.mybatis.entity.User;

import java.util.List;

public interface IUserDAO {

    /**
    * @Description: 查询所有用户
    * @Param:
    * @return:
    * @Author: Mr.chen
    * @Date: 2019/6/10
    */
    List<User> findAll() ;


    User findById(int id) ;
}

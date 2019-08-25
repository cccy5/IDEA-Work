package com.cy.mybatis.IDAO;

import com.cy.mybatis.entity.QueryVo;
import com.cy.mybatis.entity.User;

import java.util.List;

/**
* @Description: 用户的持久层接口  
* @Param:
* @return:  
* @Author: Mr.chen
* @Date: 2019/5/18 
*/ 
public interface IUserDAO {
/** 
* @Description: 查询所有的操作 
* @Param:  
* @return:  
* @Author: Mr.chen
* @Date: 2019/5/18 
*/ 
    List<User> findAll() ;

    /**
    * @Description: 添加方法
    * @Param:  user
    * @return:  user
    * @Author: Mr.chen
    * @Date: 2019/5/21
    */
    void saveUser(User user) ;

    /**
    * @Description: 修改方法
    * @Param:  User
    * @return:  user
    * @Author: Mr.chen
    * @Date: 2019/5/21
    */
    void updateUser(User user) ;

    /**
    * @Description: 删除方法
    * @Param:  delete
    * @return:  id
    * @Author: Mr.chen
    * @Date: 2019/5/21
    */
    void delete(int id) ;

    /**
    * @Description: 通过id查询用户
    * @Param:  id
    * @return:  user
    * @Author: Mr.chen
    * @Date: 2019/5/21
    */
    User findById(int id);

    /**
    * @Description: 通过名字模糊查询
    * @Param:  name
    * @return:  user
    * @Author: Mr.chen
    * @Date: 2019/5/21
    */
    List<User> findByName(String name) ;

    /**
    * @Description: 查询总的记录数
    * @Param:
    * @return:  count
    * @Author: Mr.chen
    * @Date: 2019/5/21
    */
    int findTotal() ;
    
    /** 
    * @Description: 通过QueryVo条件查询
    * @Param:  
    * @return:  
    * @Author: Mr.chen
    * @Date: 2019/5/21 
    */
    List<User> QueryVo(QueryVo vo) ;
}

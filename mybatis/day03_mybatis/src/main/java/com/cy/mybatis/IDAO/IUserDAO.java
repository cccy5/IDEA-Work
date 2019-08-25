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
    * @Description: 通过QueryVo条件查询
    * @Param:  
    * @return:  
    * @Author: Mr.chen
    * @Date: 2019/5/21 
    */
    List<User> QueryVo(QueryVo vo) ;

    /**
    * @Description:
    * @Param: 查询的条件 有可能有用户名有可能有性别也有可能有地址或者都有user
    * @return:  根据传入参数查询
    * @Author: Mr.chen
    * @Date: 2019/6/10
    */
    List<User> findUserByCondition(User user) ;

    /**
    * @Description:
    * @Param:
    * @return:  根据QuerVo中提供的id集合查询用户信息
    * @Author: Mr.chen
    * @Date: 2019/6/10
    */
    List<User> findUserInIds(QueryVo queryVo) ;
}

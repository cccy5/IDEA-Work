package com.cy.mybatis.Idao;

import com.cy.mybatis.entity.Account;
import com.cy.mybatis.entity.AccountUser;

import java.util.List;

public interface IAccountDAO {

    /** 
    * @Description: 查询所有 
    * @Param:  
    * @return:  
    * @Author: Mr.chen
    * @Date: 2019/6/10 
    */ 
    List<Account> findAll() ;

    /** 
    * @Description: 通过id查询
    * @Param:  
    * @return:  
    * @Author: Mr.chen
    * @Date: 2019/6/10 
    */ 
    Account findById(int id) ;

    /** 
    * @Description: 查询所有账户并带有用户名称和地址信息
    * @Param:  
    * @return:  
    * @Author: Mr.chen
    * @Date: 2019/6/10 
    */ 
    List<AccountUser> findAllAccount() ;
}

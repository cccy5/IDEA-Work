package com.cy.dao;

import com.cy.entity.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @param: 用户接口类
 * @return: list  save
 * @date: 2019/8/12
 */
@Repository
public interface IAccountDAO {
    //查询所有账户
    @Select("select * from account")
    List<Account> accountList() ;
    //保存账户
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account) ;
}

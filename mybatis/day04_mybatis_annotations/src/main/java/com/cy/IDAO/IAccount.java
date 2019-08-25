package com.cy.IDAO;

import com.cy.entity.Account;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface IAccount {

    @Select("select * from account")
    @Results(id = "accountMap" ,value = {
            @Result(id = true,property = "aid",column = "id"),
            @Result(property = "uid",column = "uid"),
            @Result(property = "money",column = "money"),
          @Result(property = "user",column = "uid",one = @One(select = "com.cy.IDAO.IUserDAO.getUserById",fetchType = FetchType.EAGER))

    })
    List<Account> findAll();
    //根据用户id查询账户信息
    @Select("select * from account where uid = #{uid}")
    @ResultMap("accountMap")
   List<Account> findAccountById(int uid);
}

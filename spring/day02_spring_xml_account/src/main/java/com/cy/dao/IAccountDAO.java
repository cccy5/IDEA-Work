package com.cy.dao;

import com.cy.entity.Acccount;

import java.util.List;

/**
 * @param: 账户的持久层接口
 * @return: 
 * @date: 2019/6/23 
 */
public interface IAccountDAO {


/**
 * @param: 查找所有
 * @return: list集合
 * @date: 2019/6/23
 */
List<Acccount> findAll();

/**
 * @param: 通过id查找用户
 * @return:account
 * @date: 2019/6/23
 */
Acccount findAccountById(int id);

/**
 * @param: 保存
 * @return:
 * @date: 2019/6/23
 */
void saveAccount(Acccount acccount);

/**
 * @param: 删除用户
 * @return:
 * @date: 2019/6/23
 */
void deleteAccount(int id);

/**
 * @param: 修改用户
 * @return:
 * @date: 2019/6/23
 */
void uptateAccount(Acccount acccount);


}

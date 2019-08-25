package com.cy.dao;

/**
 * @param: 账号的业务层接口
 * @return:
 * @date: 2019/7/11 
 */
public interface IAccountService {
/**
 * @param: 模拟保存账户
 * @return: 
 * @date: 2019/7/11 
 */
    void savAccount() ;

    /**
     * @param: 模拟更新账户方法
     * @return: 
     * @date: 2019/7/11 
     */
    void updateAccount(int i);

        
    /**
     * @param: 模拟删除账户方法
     * @return: 
     * @date: 2019/7/11 
     */
    int  deleteAccount() ;
}

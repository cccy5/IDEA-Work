package com.cy.dao.impl;

import com.cy.dao.IAccountService;

/**
 * @Auther: Administrator
 * @Date: 2019/7/11 19:17
 * @Description:  账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {
    public void savAccount() {
        System.out.println("执行了保存");
    }

    public void updateAccount(int i) {

        System.out.println("执行了更新");
    }

    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }
}
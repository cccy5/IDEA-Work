package com.cy.service.impl;

import com.cy.dao.IAccountDAO;
import com.cy.service.IAccountService;
import com.cy.entity.Acccount;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/6/23 11:42
 * @Description: 账户的业务层实现类
 */
public class AccountServiceImpl  implements IAccountService {

    private IAccountDAO accountDao ;

    public void setAccountDao(IAccountDAO accountDao) {
        this.accountDao = accountDao;
    }

    public List<Acccount> findAll() {
        return accountDao.findAll();
    }

    public Acccount findAccountById(int id) {
        return accountDao.findAccountById(id);
    }

    public void saveAccount(Acccount acccount) {
        accountDao.saveAccount(acccount);
    }

    public void deleteAccount(int id) {

    }

    public void uptateAccount(Acccount acccount) {
        accountDao.uptateAccount(acccount);
    }
}
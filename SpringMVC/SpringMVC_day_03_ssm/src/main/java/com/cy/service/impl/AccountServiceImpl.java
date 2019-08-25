package com.cy.service.impl;

import com.cy.dao.IAccountDAO;
import com.cy.entity.Account;
import com.cy.service.IAccountServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/8/12 23:07
 * @Description:
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountServiceDAO {
    @Autowired
    private IAccountDAO accountDAO ;

    @Override
    public List<Account> accountLiset() {
        System.out.println("业务层。。查询所有");
        return accountDAO.accountList();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层。。保存账户");
        accountDAO.saveAccount(account);
    }

}
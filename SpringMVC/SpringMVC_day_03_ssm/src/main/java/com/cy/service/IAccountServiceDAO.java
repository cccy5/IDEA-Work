package com.cy.service;

import com.cy.entity.Account;

import java.util.List;

public interface IAccountServiceDAO {
    List<Account> accountLiset() ;

    public  void  saveAccount(Account account) ;

}

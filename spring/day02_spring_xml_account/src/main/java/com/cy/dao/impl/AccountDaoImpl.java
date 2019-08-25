package com.cy.dao.impl;

import com.cy.dao.IAccountDAO;
import com.cy.entity.Acccount;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/6/23 11:50
 * @Description:持久层接口实现类
 */
public class AccountDaoImpl implements IAccountDAO {

    private QueryRunner queryRunner ;

    public QueryRunner getQueryRunner() {
        return queryRunner;
    }

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    public List<Acccount> findAll() {
        try {
            return queryRunner.query("select * from account",new BeanListHandler<Acccount>(Acccount.class));
        }catch (Exception e){
            throw new RuntimeException(e) ;
        }

    }

    public Acccount findAccountById(int id) {
        try {
            return queryRunner.query("select * from account where id = ?",new BeanHandler<Acccount>(Acccount.class),id);
        }catch (Exception e){
            throw new RuntimeException(e) ;
        }
    }

    public void saveAccount(Acccount acccount) {
            try {
                queryRunner.update("insert into account (name,money) values (?,?)",acccount.getName(),acccount.getMoney()) ;
            }catch (Exception e){
                throw  new RuntimeException(e) ;
            }
    }

    public void deleteAccount(int id) {
        try {
            queryRunner.update("delete from account where id = ?",id) ;
        }catch (Exception e){
            throw  new RuntimeException(e) ;
        }
    }

    public void uptateAccount(Acccount acccount) {
        try {
            queryRunner.update("update account set name = ? , money = ? where id = ?",acccount.getName(),acccount.getMoney(),acccount.getId()) ;
           // runner.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        }catch (Exception e){
            throw  new RuntimeException(e) ;
        }
    }
}
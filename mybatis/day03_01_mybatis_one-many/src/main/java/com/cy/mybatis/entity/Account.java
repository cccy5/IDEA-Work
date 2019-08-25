package com.cy.mybatis.entity;

import java.io.Serializable;

/**
 * @program: day03_01_mybatis
 * @description: 账户表
 * @author: MrChen
 * @create: 2019-06-10 21:13
 */
public class Account  implements Serializable {

    private int id ;

    private int uid ;

    private  double money ;

    private User user ;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +

                '}';
    }
}
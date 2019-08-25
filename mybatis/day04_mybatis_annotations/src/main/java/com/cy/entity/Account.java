package com.cy.entity;

import java.io.Serializable;

/**
 * @program: day04_mybatis_annotations
 * @description: 账号实体
 * @author: MrChen
 * @create: 2019-06-15 15:12
 */
public class Account implements Serializable {

    private int aid ;

    private int uid ;

    private Double money ;

    private User user ;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "aid=" + aid +
                ", uid=" + uid +
                ", money=" + money +
                '}';
    }
}
package com.cy.entity;

import java.io.Serializable;

/**
 * @Auther: Administrator
 * @Date: 2019/8/12 23:01
 * @Description:用户实体类
 */
public class Account implements Serializable {

    private  int id  ;

    private  String name ;

    private  Double money ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
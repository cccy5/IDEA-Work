package com.cy.entity;

import java.io.Serializable;

/**
 * @Auther: Administrator
 * @Date: 2019/6/23 11:26
 * @Description:用户实体类
 */
public class Acccount implements Serializable {
    private  int id ;

    private String name ;

    private float money ;

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

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Acccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
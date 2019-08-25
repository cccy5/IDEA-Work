package com.cy.entity;

import java.io.Serializable;

/**
 * @Auther: Administrator
 * @Date: 2019/8/4 09:41
 * @Description:用户实体类
 */
public class User implements Serializable {

  private  String username ;

    private int userage ;

    private String userpassword ;

    private Money money ;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserage() {
        return userage;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }


    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userage=" + userage +
                ", userpassword='" + userpassword + '\'' +
                ", money=" + money +
                '}';
    }
}
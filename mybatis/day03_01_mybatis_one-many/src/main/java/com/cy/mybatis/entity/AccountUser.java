package com.cy.mybatis.entity;

/**
 * @program: day03_01_mybatis
 * @description: accountUser类
 * @author: MrChen
 * @create: 2019-06-10 22:35
 */
public class AccountUser extends Account {

    private String username ;

    private String address ;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString()+   " "+            "AccountUser{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
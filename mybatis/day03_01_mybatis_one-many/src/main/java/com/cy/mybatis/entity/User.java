package com.cy.mybatis.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @program: day03_01_mybatis
 * @description: 用户表
 * @author: MrChen
 * @create: 2019-06-10 21:53
 */
public class User implements Serializable {

    private int id ;

    private String username ;

    private String sex ;

    private String address ;

    private Date birthday ;

    //一对多关系映射  主体表应包含从表实体的集合引用

    private List<Account> accounts ;

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
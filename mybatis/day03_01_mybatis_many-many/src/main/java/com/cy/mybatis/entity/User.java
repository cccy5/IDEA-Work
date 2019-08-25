package com.cy.mybatis.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @program: day03_01_mybatis_manymany
 * @description: 用户实体类
 * @author: MrChen
 * @create: 2019-06-12 19:16
 */
public class User implements Serializable {


    private int id;

    private String username;

    private String sex;

    private String address;

    private Date birthday;

    private List<Role> roles ;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
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
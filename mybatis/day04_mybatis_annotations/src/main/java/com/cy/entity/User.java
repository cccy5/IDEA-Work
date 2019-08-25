package com.cy.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @program: day04_mybatis_annotations
 * @description: 用户类
 * @author: MrChen
 * @create: 2019-06-15 13:33
 */
public class User implements Serializable {

    private int uid ;//

    private String userName ;

    private String Address ;

    private String Sex ;

    private Date Bithday ;

    private List<Account> accounts ;

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public Date getBithday() {
        return Bithday;
    }

    public void setBithday(Date bithday) {
        Bithday = bithday;
    }

    @Override
    public String toString() {
        return
                "uid=" + uid +
                ", userName='" + userName + '\'' +
                ", Address='" + Address + '\'' +
                ", Sex='" + Sex + '\'' +
                ", Bithday=" + Bithday +
                '}';
    }
}
package com.cy.mybatis.entity;

import javafx.scene.chart.XYChart;

import java.io.Serializable;
import java.io.StringReader;
import java.util.Date;

/**
 * @program: day_01_mybatis
 * @description: 用户实体类
 * @author: MrChen
 * @create: 2019-05-18 12:20
 */
public class User implements Serializable {
    private  int id ;

    private  String name ;

    private String sex ;

    private String address ;

    private Date birthdat ;

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

    public Date getBirthdat() {
        return birthdat;
    }

    public void setBirthdat(Date birthdat) {
        this.birthdat = birthdat;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", birthdat=" + birthdat +
                '}';
    }
}
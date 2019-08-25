package com.cy.mybatis.entity;

/**
 * @program: day_01_mybatis
 * @description: 管理员实体
 * @author: MrChen
 * @create: 2019-05-21 22:17
 */
public class Admin {
    private int age ;

    private String name ;

    private String address ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
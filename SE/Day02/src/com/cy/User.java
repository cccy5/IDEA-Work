package com.cy;

/**
 * @Auther: Administrator
 * @Date: 2020/2/16 19:00
 * @Description:
 */
public class User {
    private String name ;//用户名
    private int money ;//余额

    public User() {

    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void showMoney(){
        System.out.println("用户名："+name+"余额："+money);
    }
}
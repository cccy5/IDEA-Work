package com.cy;

import java.util.ArrayList;

/**
 * @Auther: Administrator
 * @Date: 2020/2/16 19:01
 * @Description:群主实体类
 */
public class Manager  extends  User{
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> sendMoney(int money,int count){
        int lsftMoney = super.getMoney() ;//查看群主有多少钱
        if(money>lsftMoney){
            System.out.println("余额不足");
            return null ;
        }
        int c = lsftMoney-money ;
        System.out.println("c:"+c);
       // super.setMoney(c);
        int m = money/count ;
        int n = money%count ;
        ArrayList<Integer> list = new ArrayList<>() ;
        for (int i = 0; i < count-1; i++) {
            list.add(m) ;
        }
            int last = m+n ;
            list.add(last) ;
            return list ;
    }
}
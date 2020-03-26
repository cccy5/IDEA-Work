package com.cy;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Auther: Administrator
 * @Date: 2020/2/16 19:07
 * @Description:
 */
public class Menber extends User {
    public Menber() {
    }

    public Menber(String name, int money) {
        super(name, money);
    }

    public  void receive(ArrayList<Integer> list){

        int b = super.getMoney() ;//现在每个人有多少钱
        int index = new Random().nextInt(list.size()) ;
        int a = list.remove(index) ;
        super.setMoney(a+b);
    }
}

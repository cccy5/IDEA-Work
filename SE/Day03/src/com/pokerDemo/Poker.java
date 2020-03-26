package com.pokerDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2020/2/21 14:25
 * @Description:
 */
public class Poker {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>() ;
        list.add("大王") ;
        list.add("小王") ;
        String color []  = {"♥","♦","♣","♠"} ;
        String number []  = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"} ;
        for (String colors : color) {
            for (String numbers : number) {
              //  System.out.println(s+s1);
                list.add(colors+numbers) ;
            }
        }
        Collections.shuffle(list);//使用Collections中shuffle方法吧牌的順序打亂
        //System.out.println(list);
        ArrayList<String> gamePlay1  = new ArrayList<>();
        ArrayList<String> gamePlay2  = new ArrayList<>();
        ArrayList<String> gamePlay3  = new ArrayList<>();
        ArrayList<String> shengyu  = new ArrayList<>();

            for (int i = 1; i < list.size(); i++) {
                String card = list.get(i);//获取牌
              //  System.out.print("card:"+card);
                if(i>=51){
                    shengyu.add(card) ;

            }if(i%3==1){
                    gamePlay1.add(card) ;

                }
                if(i%3==2){
                    gamePlay2.add(card) ;
                }
                if(i%3==0){
                    gamePlay3.add(card) ;
                }
        }
        System.out.println("玩家1"+gamePlay1);
        System.out.println("玩家2"+gamePlay2);
        System.out.println("玩家3"+gamePlay3);
        System.out.println("剩下"+shengyu);
    }
}
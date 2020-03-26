package com.pokerDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2020/2/21 14:47
 * @Description:
 */
public class TestList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>() ;
        list.add("a") ;
        list.add("b") ;
        list.add("c") ;
        list.add("d") ;
        list.add("e") ;
        System.out.println(list);
        System.out.println("=====================================");
        for (String b:list) {
            System.out.println(b);
        }
        System.out.println("=====================================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            String c = list.get(3);
            System.out.println("取出的3："+c);
        }
        System.out.println("=====================================");
    }
}
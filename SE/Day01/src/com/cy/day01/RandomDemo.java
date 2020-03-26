package com.cy.day01;

import java.util.Random;

/**
 * @Auther: Administrator
 * @Date: 2020/2/15 17:37
 * @Description:
 */
public class RandomDemo {

    public static void main(String[] args) {
        Random r = new Random() ;
        int arr[] = new int [10]  ;
        for (int i = 0; i < arr.length; i++) {
            
        }


        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10)+1 ;
            System.out.println(num);
        }
    }
}
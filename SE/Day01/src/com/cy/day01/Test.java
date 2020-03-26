package com.cy.day01;

/**
 * @Auther: Administrator
 * @Date: 2020/2/16 12:38
 * @Description:
 */
public class Test {
    public static void main(String[] args) {

        byte[] qw = "abc".getBytes();
        //   byte[] bytes = str13.getBytes();
        System.out.println("bytes.length:"+qw.length);
        for (int i2 = 0; i2 < qw.length; i2++)

        {
            System.out.println("getBytes：" + qw[i2]);

        }
    }
}
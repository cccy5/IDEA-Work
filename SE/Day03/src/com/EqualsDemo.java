package com;

/**
 * @Auther: Administrator
 * @Date: 2020/3/1 16:03
 * @Description: 测试equals用法
 */
public class EqualsDemo {
    public static void main(String[] args) {

        String a  = "q" ;
        String b = "c"  ;
        String  c = "c" ;
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(c==b);
        System.out.println(a==b);
    }
}
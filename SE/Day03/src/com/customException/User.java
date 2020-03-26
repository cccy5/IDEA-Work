package com.customException;

/**
 * @Auther: Administrator
 * @Date: 2020/3/2 22:52
 * @Description: 实现自定义异常
 */
public class User {

    public static void main(String[] args) {
        int [] arr = new int [2] ;
        try {
           int a  = arr[5] ;
            System.out.println(a);
           throw new UserException("你个坑爹玩意") ;//为什么要在try中抛出不能再catch中捕获呢？
        } catch (UserException e) {//这样他就会报错  这个userException是我自定义的异常类
            e.printStackTrace();
        }
    }
}
package com.pokerDemo;

/**
 * @Auther: Administrator
 * @Date: 2020/3/2 22:32
 * @Description:
 */
public class UserException extends Exception {
    public UserException() {
        super();
    }

    public  UserException(String message){
        super(message) ;
    }
}
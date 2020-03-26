package com.customException;

/**
 * @Auther: Administrator
 * @Date: 2020/3/2 22:51
 * @Description:  自定义异常类
 */
public class UserException extends Exception {

    public  UserException(){
        super();
    }
    public  UserException (String message){
        super(message);
    }

}
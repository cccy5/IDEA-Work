package com.cy.sysException;

/**
 * @Auther: Administrator
 * @Date: 2019/8/11 13:26
 * @Description:异常类
 */
public class SysException extends Exception {

    private String message ;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SysException(String message) {
        this.message = message;
    }
}
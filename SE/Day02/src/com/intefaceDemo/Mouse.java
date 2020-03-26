package com.intefaceDemo;

/**
 * @Auther: Administrator
 * @Date: 2020/2/17 22:15
 * @Description:鼠标类
 */
public class Mouse implements Usb {
    @Override
    public void on() {
        System.out.println("打开鼠标");
    }

    @Override
    public void off() {
        System.out.println("关闭鼠标");
    }

    public void dianji(){
        System.out.println("点击鼠标");
    }
}
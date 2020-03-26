package com.intefaceDemo;

/**
 * @Auther: Administrator
 * @Date: 2020/2/17 22:16
 * @Description:键盘类
 */
public class KeyBoard implements  Usb{
    @Override
    public void on() {
        System.out.println("打开键盘");
    }

    @Override
    public void off() {
        System.out.println("关闭键盘");
    }

    public void dianji(){
        System.out.println("点击键盘");
    }
}
package com.intefaceDemo;

/**
 * @Auther: Administrator
 * @Date: 2020/2/17 22:18
 * @Description:
 */
public class IntefaceDemo {
    public static void main(String[] args) {
        Computer computer = new Computer() ;
        computer.kaiji();
        Usb usb = new KeyBoard() ;
        usb.on();
        if(usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.dianji();
        }
        Mouse mouse = new Mouse() ;
        mouse.off();
        computer.guanji();
    }
}
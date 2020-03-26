package com.cy;

import java.util.ArrayList;

/**
 * @Auther: Administrator
 * @Date: 2020/2/16 18:58
 * @Description:
 */
public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主:",100) ;
        Menber member1 = new Menber("成员A:",10) ;
        Menber member2 = new Menber("成员B:",0) ;
        Menber member3 = new Menber("成员c:",0) ;
        Menber member4 = new Menber("成员D:",0) ;
        Menber member5 = new Menber("成员E:",0) ;
        Menber member6 = new Menber("成员F:",0) ;
        Menber member7 = new Menber("成员G:",0) ;
        Menber member8 = new Menber("成员H:",0) ;
        Menber member9 = new Menber("成员I:",0) ;
        Menber member10 = new Menber("成员:J",0) ;
        manager.showMoney();
        member1.showMoney();
        member2.showMoney();
        member3.showMoney();
        member4.showMoney();
        member5.showMoney();
        member6.showMoney();
        member7.showMoney();
        member8.showMoney();
        member9.showMoney();
        member10.showMoney();

        ArrayList<Integer> list1 = manager.sendMoney(20,10);
        manager.sendMoney(20,10) ;
        member1.receive(list1);
        member2.receive(list1);
        member3.receive(list1);
        member4.receive(list1);
        member5.receive(list1);
        member6.receive(list1);
        member7.receive(list1);
        member8.receive(list1);
        member9.receive(list1);
        member10.receive(list1);

        System.out.println("====================================");
        manager.showMoney();
        member1.showMoney();
        member2.showMoney();
        member3.showMoney();
        member4.showMoney();
        member5.showMoney();
        member6.showMoney();
        member7.showMoney();
        member8.showMoney();
        member9.showMoney();
        member10.showMoney();
    }
}
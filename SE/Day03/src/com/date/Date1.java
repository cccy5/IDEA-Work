package com.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: Administrator
 * @Date: 2020/2/20 15:55
 * @Description:
 */
/*
DateFormat类的常用方法有：
    DateFormat为抽象类，不能直接使用，所以需要常用的子类`SimpleDateFormat`。
    这个类需要一个模式（格式）来指定格式化或解析的标准
- public String format(Date date)`：将Date对象格式化为字符串。
- public Date parse(String source)`：将字符串解析为Date对象。*/
public class Date1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日：hh时:mm分ss秒") ;
        String s = "2012年12月25日：10时:14分33秒" ;
        Date t = simpleDateFormat.parse(s) ;

        System.out.println(t.getTime()) ;
        //System.out.println("为毫秒的输出"+date);
        System.out.println(simpleDateFormat.format(t) );


    }
}
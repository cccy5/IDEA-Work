package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Auther: Administrator
 * @Date: 2020/2/20 16:37
 * @Description:
 */
//计算出一个人已经出生了多少天。
public class DateDemo {

    public static void main(String[] args) throws ParseException {
        System.out.println("请输入你的出生日期：格式为yyyy.MM.dd");
        System.out.println("如：2012.12.22");
        while (true){

        Scanner scanner = new Scanner(System.in);


        String s = scanner.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");//定义输入的字符串格式
        //将字符串转化为时间
        Date parse = simpleDateFormat.parse(s);

        Date date = new Date();
        //获取当前系统时间
        long nowTime = date.getTime();
        //获取出生的毫秒时间
        long bornTime = parse.getTime();
        if (bornTime < nowTime) {//判断输入的时间是否小于当前时间
            long liveTime = nowTime - bornTime;//计算出你活了多少毫秒
            System.out.println("将当前系统时间转换为" + nowTime+":毫秒");
            System.out.println("输入的时间计算为" + bornTime+"毫秒：");
            System.out.println("生存" + liveTime+"毫秒：");
            //将你活了多少毫秒转化为天
            long l = liveTime / 1000 / 60 / 60 / 24;

            System.out.println("你出生了：" + l + "天");
            break ;
        } else {
            System.out.println("你输入的时间超出当前时间,请重新输入：");
        }


    }
    }
}
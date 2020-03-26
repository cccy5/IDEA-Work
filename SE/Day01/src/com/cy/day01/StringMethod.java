package com.cy.day01;

import java.nio.charset.Charset;

/**
 * @Auther: Administrator
 * @Date: 2020/2/16 10:56
 * @Description:字符串的创建和常用方法练习 创建字符串3+1种方式
 * 1、通过无参构造函数
 * 2、通过char数组
 * 3、通过byte数组，底层是字节
 */
public class StringMethod {

    public static void main(String[] args) {
        //使用无参构造方法创建字符串
        String str = new String();
        System.out.println("第一个字符串：" + str);
        System.out.println("=====================");

        //使用char数组构建字符串
        char[] charArray = {'f', 't', 'j'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串：" + str2);
        System.out.println("=====================");

        //通过byte数组创建  底层是字节
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串：" + str3);
        System.out.println("=====================");


        //字符串的常见使用方法
        /* 1、判断功能的方法   equals比较字符串的值   equalsIgnoreCase忽略字符串大小写比较值
           2、获取功能的方法   length()获取字符串长度   conCat字符串拼接  charAt 返回索引的字符串值
                              indexOf返回子字符串第一次出现在该字符串的索引
                              subString返回一个子字符串，从beginIndex开始截取字符串到字符串结尾
           3、转换方法   toCharArray将字符串转换为字符数组   getBytes将字符串转化为字节数组
                        replace将某个字符串替换掉
           4、字符串切割   split
        * */

        String str4 = "gnekigjeogjoiejgoiejgishdjgikengoie";
        System.out.println("str4字符串的长度是：" + str4.length());
        System.out.println("==========================分割线===========================");
        String str5 = "hello";
        System.out.println("hello和字符串str5比较的结果是：" + "hello".equals(str5));//true
        System.out.println("==========================分割线===========================");
        String str6 = "hello";
        String str7 = "World";
        String str8 = str6.concat(str7);
        System.out.println("str8的结果是：" + str8);
        System.out.println("str8的结果2是：" + str6.concat(str7));
        System.out.println("==========================分割线===========================");

        char str9 = "gheoijgoiejgoiejgo".charAt(5);
        System.out.println("charAt的索引是字符串：" + str9);//给的是char型的返回值
        System.out.println("==========================分割线===========================");

        String str10 = "helloWorld";
        int i = str10.indexOf("e");
        System.out.println("返回找到的第一个字母的索引值：" + i);
        System.out.println("==========================分割线===========================");

        String str11 = "gjeoighjeoi";
        String substring = str11.substring(5);
        System.out.println("从第五个字符串开始截取取到的值为：" + substring);

        String str12 = "fefnoejhgoiejgioejgoiej";
        String substring1 = str12.substring(6, 9);
        System.out.println("截取的6-9的字符串为：" + substring1);

        System.out.println("==========================分割线===========================");

        System.out.print("输出遍历的数组值：[");
        String a = "gejgpo";
        char[] chars = a.toCharArray();
        for (int i1 = 0; i1 < chars.length; i1++) {
            if (i1 == chars.length - 1) {
                System.out.print("]");
            } else {
                System.out.print(chars[i1]);
            }

        }

        System.out.println();
        System.out.println("==========================分割线===========================");
        byte[] qw = "abc".getBytes();
        //   byte[] bytes = str13.getBytes();
        System.out.println("bytes.length:"+qw.length);
        for (int i2 = 0; i2 < qw.length; i2++) {
            System.out.println("getBytes："+qw[i2]);
        }


        System.out.println("==========================分割线===========================");
        String str14 = "你大爷的！" ;
        System.out.println("修改之前的："+str14);
        String s = str14.replace("大爷", "**");
        System.out.println("修改之后的："+s);

        System.out.println("==========================分割线===========================");

        String str15 = "aaa,bbb,ccc" ;
        String[] split = str15.split(",");
        for (int i1 = 0; i1 < split.length; i1++) {
            System.out.println("切割后的字符串"+split[i1]);
        }
    }
}
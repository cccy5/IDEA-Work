package com.file;

import java.io.File;

/**
 * @Auther: Administrator
 * @Date: 2020/3/10 22:49
 * @Description:  文件类的使用  对文件夹进行遍历输出
 */
public class FileDemo {

    public static void main(String[] args) {

        File file = new File("C:") ;
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("=======================================================");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
package com.file;

import java.io.File;
import java.io.IOException;

/**
 * @Auther: Administrator
 * @Date: 2020/3/9 21:51
 * @Description:  文件类的使用    创建一个文件
 */
public class CreateFile {
    public static void main(String[] args) {
        File file = new File("C:\\d.txt") ;
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
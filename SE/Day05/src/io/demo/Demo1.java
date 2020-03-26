package io.demo;

import java.io.*;

/**
 * @Auther: Administrator
 * @Date: 2020/3/14 21:03
 * @Description:    用字节流复制文件
 */
public class Demo1 {

    public static void main(String[] args) throws IOException {

        long a = System.currentTimeMillis();
        InputStream inp = new FileInputStream("E:\\software\\eclipse-inst-win64.exe") ;
        OutputStream oup = new FileOutputStream("D:1.exe") ;
        int len = 0 ;
        while ((len = inp.read())!=-1){
            oup.write(len);
        }

        oup.close();
        inp.close();

        long b = System.currentTimeMillis();
        System.out.println(b-a);
    }
}
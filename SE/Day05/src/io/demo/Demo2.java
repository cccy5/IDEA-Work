package io.demo;

import java.io.*;

/**
 * @Auther: Administrator
 * @Date: 2020/3/14 21:12
 * @Description:  通过数组去读取然后复制文件
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        long a = System.currentTimeMillis() ;

        InputStream inp = new FileInputStream("E:\\software\\Adobe Illustrator CC 2014.18.1.1.0_DownZa.Cn.rar") ;
        OutputStream onp = new FileOutputStream("D:2.rar") ;
        byte [] bytes = new byte[1024] ;
        int len = 0 ;
        while ((len = inp.read(bytes))!=-1){
            onp.write(bytes);
        }
        onp.close();
        inp.close();
        long b = System.currentTimeMillis() ;
        System.out.println(b-a);
    }
}
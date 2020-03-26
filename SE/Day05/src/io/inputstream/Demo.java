package io.inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: Administrator
 * @Date: 2020/3/14 20:53
 * @Description:  字节读取输入流   读
 */


public class Demo {

    /*
    读的话有  read   close

    */
    public static void main(String[] args) throws IOException {

        InputStream inp = new FileInputStream("b.txt") ;
//        int read = inp.read();
//        System.out.println(read);
        int len = 0 ;


        while ((len = inp.read())!=-1){
            System.out.println(len);

        }
    }
}
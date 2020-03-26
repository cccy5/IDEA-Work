package io.readerAndwriter;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @Auther: Administrator
 * @Date: 2020/3/14 21:43
 * @Description:  字符输入流： Reader 是一个抽象类(读)
 */
public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("e.txt") ;
        int read = reader.read();
        System.out.println(read);
//        int len =0 ;
//        while ((len = reader.read())!=-1){
//            System.out.print((char) len);
//
//        }

    }

}
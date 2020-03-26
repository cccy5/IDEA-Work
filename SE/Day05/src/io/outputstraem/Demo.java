package io.outputstraem;

import java.io.*;

/**
 * @Auther: Administrator
 * @Date: 2020/3/14 20:26
 * @Description:  字节输出流案例： 写到硬盘中
 */
public class Demo {
    /*
     void close() 关闭此输出流并释放与此流有关的所有系统资源。
     void flush()  刷新此输出流，并强制将所有已缓冲的输出字节写入该流中。
     void write(byte[] b) 将 b.length 个字节写入此输出流。
     void write(byte[] b, int off, int len) 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
     void write(int b)  将指定 byte 写入此输出流。
    */
    public static void main(String[] args) throws IOException {
//        File file = new File("\\aa\\vv.text") ;
//        file.createNewFile() ;
        OutputStream ots = new FileOutputStream("b.txt") ;
        ots.write(97);
        ots.write(98);
        ots.write("\r\n".getBytes());
        byte[]bytes = {'a','b','c'} ;
        ots.write(bytes);
        ots.close();
    }
}
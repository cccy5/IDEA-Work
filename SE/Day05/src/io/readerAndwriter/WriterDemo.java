package io.readerAndwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Auther: Administrator
 * @Date: 2020/3/14 21:39
 * @Description: 字符输出流： Writer 是一个抽象类(写)
 */
public class WriterDemo {
    public static void main(String[] args) throws IOException {

        Writer wr = new FileWriter("e.txt") ;
        wr.write("你好");

        wr.close();
    }
}
package com.file;

import java.io.File;
import java.io.IOException;

/**
 * @Auther: Administrator
 * @Date: 2020/3/10 19:19
 * @Description:  文件类的使用 判断是否存在文件夹   不存在则创建
 */
public class FileDemo2  {

    /*
    *  File 三个构造方法
    *        四个获取方法   获取绝对路径  getPath（）  获取名字  获取长度
    *        三个判断   exists判断判断是否存在    isDirectory  isFile 判断是文件还是目录
    *        三个创建一个删除 createNewFile创建一个文件  mkdir()   mkdirs()创建单个多个目录   delete不走回收站直接删除
     *        两个遍历  list  listFiles
    *
    * */
    public static void main(String[] args) {
       String s = "C:\\a\\c\\q\\b.txt" ;
       File f = new File(s)  ;
       boolean b = f.exists() ;
        System.out.println(b);
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(f.exists()!=false){
            System.out.println("存在");
        }
        else {
            System.out.println("不存在该目录");

           try {
               boolean mkdirs = f.mkdirs();
               System.out.println("mkdirs"+mkdirs);
               boolean newFile = f.createNewFile();
                boolean mkdir = f.mkdir();

               System.out.println("newFile:"+newFile);
                System.out.println("mkdir:"+mkdir);
           } catch (IOException e) {
               e.printStackTrace();
            }
       }

    }
}
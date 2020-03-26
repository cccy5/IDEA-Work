package com.date;

import javax.crypto.spec.PSource;

/**
 * @Auther: Administrator
 * @Date: 2020/2/20 18:32
 * @Description:
 */
/* 1、 输入当前系统的毫秒值
    2、  arraycopy方法 吧一个数组里的值复制到另一个数组
    参数序号 | 参数名称    | 参数类型   | 参数含义       |
            | ---- | ------- | ------ | ---------- |
            | 1    | src     | Object | 源数组        |
            | 2    | srcPos  | int    | 源数组索引起始位置  |
            | 3    | dest    | Object | 目标数组       |
            | 4    | destPos | int    | 目标数组索引起始位置 |
            | 5    | length  | int    | 复制元素个数     |
* */
public class SystemDemo {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        System.out.println(System.currentTimeMillis());

    }
}
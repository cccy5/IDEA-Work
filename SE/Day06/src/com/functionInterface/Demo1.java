package com.functionInterface;

/**
 * @Auther: Administrator
 * @Date: 2020/3/26 11:44
 * @Description: 求int数组最大值
 */
public class Demo1 {

    public static void main(String[] args) {
        int arr[] = {1000, 3, 5, 2, 54, 23, 43, 7};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
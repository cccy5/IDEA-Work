package com.cy.day01;

/**
 * @Auther: Administrator
 * @Date: 2020/2/12 21:20
 * @Description:
 */
public class ShuZu {

    public static void main(String[] args) {
    //    compare();//求最值（最大值或者最小值）
    }
    public static void compare() {
        int[] arr = {100, 3, 54, 23, 15, 6};
        int max = arr[0];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
              max = arr[i] ;
            }
        }
        System.out.println(max);
    }

    public  static void sort(){
        int arr[]  = {78,45,1,23,7} ;
        for (int i = 0 ; i < arr.length-1 ;i++){
            for(int y = i+1 ; y<arr.length ; y++){

            }
        }

    }
}
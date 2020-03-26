package collection.shuzu;

import java.util.ArrayList;

/**
 * @Auther: Administrator
 * @Date: 2020/3/22 22:20
 * @Description:
 */
public class test2 {
    public static void main(String[] args) {
        int arr []  = {1,23,4,5,5} ;
        System.out.println(arr);

        ArrayList <Integer> list  =new ArrayList<>() ;
        list.add(1) ;
        list.add(1) ;
        list.add(1) ;
        list.add(1) ;
        list.add(1) ;
        System.out.println(list);
        for (Integer i : list) {
            System.out.print(i+",");
        }
    }
}
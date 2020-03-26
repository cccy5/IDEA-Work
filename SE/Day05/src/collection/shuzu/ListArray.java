package collection.shuzu;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;


/**
 * @Auther: Administrator
 * @Date: 2020/3/14 22:31
 * @Description: 吧List集合放到数组中
 */
public class ListArray {

    public static void main(String[] args) {
        // ont() ; //1、使用toArray()方法
        two();  //遍历进去
    }
    public static void two() {
        ArrayList<String> list = new ArrayList<>();
        list.add("中");
        list.add("哥");
        list.add("发个");
        list.add("g");
        list.add("啊");
        //   System.out.println(list.size());
        String arr[] = new String[list.size()];
        int i = -1;
        for (int a = 0; a < list.size(); a++) {
            i++;
            // System.out.println(i);
            arr[i] = list.get(a);
            System.out.println(arr[i]);
        }
    }


    //1、使用toArray()方法
    private static void ont() {
        ArrayList<String> list = new ArrayList<>();
        list.add("中");
        list.add("哥");
        list.add("发个");
        list.add("g");
        list.add("啊");
        Object[] arr = list.toArray();

        //     System.out.println(objects);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
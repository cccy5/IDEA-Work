package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2020/3/14 22:31
 * @Description: ArrayList中迭代器用法：
 */
public class ArrayListDemo {
    /*
        List 集合常用方法
            add
            get
            set
            remove
            有索引，有序可重复
    */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //使用增强for遍历list
        System.out.println(list);
        System.out.println("=======================");
        for (Integer a : list) {
            System.out.println(a);
        }
        System.out.println("==================================");

        //使用迭代器遍历
        Iterator<Integer> it = list.iterator();
        boolean b = it.hasNext() ;
        System.out.println("b:"+b);

        //判断是否有迭代元素
        while (it.hasNext()!=false){
            System.out.println(it.next());
        }
    }
}
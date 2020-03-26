package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2020/3/14 22:32
 * @Description:  charList用法
 */
public class CharList {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>() ;

        list.add('a') ;
        list.add('b') ;
        list.add('c') ;
        list.add('d') ;
        list.add('e') ;
        list.remove(1) ;
        list.set(2,'g') ;
        Iterator<Character> it = list.iterator() ;
        while (it.hasNext()!=false){
            Character nt = it.next();
            System.out.println(nt);
        }
    }
}
package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Auther: Administrator
 * @Date: 2020/3/15 15:10
 * @Description: set集合的应用
                    set无序  不可重复
 */
public class HashSetDemo {
    /*
    remove
    add
    */
    public static void main(String[] args) {
        Set<String> st = new HashSet<>() ;
        st.add("中") ;
        st.add("国") ;
        st.add("你") ;
        st.add("好") ;

        Iterator<String> iterator = st.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
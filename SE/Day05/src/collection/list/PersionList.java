package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2020/3/14 22:32
 * @Description:  将persion对象添加到list集合中
 */
public class PersionList {
    public static void main(String[] args) {
        Persion p1 = new Persion("张三",78) ;
        Persion p2 = new Persion("张三",79) ;
        Persion p3 = new Persion("张三",7) ;
        Persion p4 = new Persion("张三",75) ;

        List<Persion> list = new ArrayList<>() ;
        list.add(p1) ;
        list.add(p2) ;
        list.add(p3) ;
        list.add(p4) ;
        for (Persion persion : list) {
            System.out.println(persion.getName()+":"+persion.getAge());
        }
        System.out.println("======================================================");
        Iterator<Persion> it = list.iterator();
        while (it.hasNext()){
            Persion next = it.next();
            System.out.println(next.getName()+":"+next.getAge());
        }

    }

}
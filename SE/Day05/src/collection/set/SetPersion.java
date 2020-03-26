package collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: Administrator
 * @Date: 2020/3/15 15:21
 * @Description: 将peision对象放到set集合中
 */
public class SetPersion {
    public static void main(String[] args) {
        Set<Persion> p  = new HashSet<>() ;
        p.add(new Persion("张三",18)) ;
        p.add(new Persion("张三",11)) ;
        p.add(new Persion("张三",12)) ;
        p.add(new Persion("张三",13)) ;
        p.add(new Persion("张三",14)) ;
        p.add(new Persion("张三",15)) ;
        p.add(new Persion("张三",16)) ;
        p.add(new Persion("张三",17)) ;
        p.add(new Persion("张三",18)) ;

        for (Persion persion : p) {
            System.out.println(persion.getName()+":"+persion.getAge());
        }
    }
}
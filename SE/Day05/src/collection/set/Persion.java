package collection.set;

import java.util.Objects;

/**
 * @Auther: Administrator
 * @Date: 2020/3/15 15:19
 * @Description: persion对象类
 */
public class Persion {

    //使用set集合存储对象一定要重新equals和hashcode方法

    private String name ;

    private int age ;

    public Persion() {
    }

    public Persion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
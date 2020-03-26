package collection.list;

/**
 * @Auther: Administrator
 * @Date: 2020/3/14 22:32
 * @Description: Persion对象类
 */
public class Persion {

    private String name ;

    private int  age ;

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
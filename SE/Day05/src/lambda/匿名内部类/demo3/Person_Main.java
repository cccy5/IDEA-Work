package lambda.匿名内部类.demo3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Auther: Administrator
 * @Date: 2020/3/24 21:48
 * @Description:
 */
public class Person_Main {

    public static void main(String[] args) {
        Person arr[]  = {
                new Person(21,"aa"),
                new Person(20,"bb"),
                new Person(19,"cc"),
                new Person(18,"dd"),
                new Person(17,"ee"),
                new Person(16,"ff"),
                new Person(15,"gg")
        } ;
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });

        Arrays.sort(arr,(Person o1, Person o2)->{
            return o1.getAge()-o2.getAge();
        });

        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
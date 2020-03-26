package fanshe;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Auther: Administrator
 * @Date: 2020/3/16 21:10
 * @Description:
 */
public class FanSheDemo {

    public static void main(String[] args) throws Exception {

        Properties pro = new Properties() ;
        ClassLoader classLoader = FanSheDemo.class.getClassLoader();
        InputStream it = classLoader.getResourceAsStream("pro.properties");
        System.out.println(it);
        pro.load(it);

        String className = pro.getProperty("ClassName");
        String method = pro.getProperty("Method");

        Class cls = Class.forName(className);
        Object o = cls.newInstance();

        Method method1 = cls.getMethod(method);

        method1.invoke(o) ;
    }
}
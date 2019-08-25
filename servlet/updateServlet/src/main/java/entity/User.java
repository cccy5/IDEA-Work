package entity;

/**
 * @program: updateServlet
 * @description: y用户
 * @author: MrChen
 * @create: 2019-04-29 19:24
 */
public class User {
    private  int id ;

    private  String name ;

    private  String passeord ;

    private int age ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasseord() {
        return passeord;
    }

    public void setPasseord(String passeord) {
        this.passeord = passeord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
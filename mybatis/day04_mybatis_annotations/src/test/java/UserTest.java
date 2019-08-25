import com.cy.IDAO.IUserDAO;
import com.cy.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @program: day04_mybatis_annotations
 * @description: 用户测试类
 * @author: MrChen
 * @create: 2019-06-15 13:42
 */
public class UserTest {

    private InputStream in ;

    private IUserDAO userDAO ;

    private SqlSession sqlSession ;

    @Before
    public void init() throws  Exception{
        //1.读取配置文件
        in = Resources.getResourceAsStream("sqlMapConfig.xml") ;
        //2.创建sqlSessFacto工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in) ;
        //2.创建sqlSess对象
        sqlSession = sqlSessionFactory.openSession() ;
        //4动态代理userDAO
        userDAO  = sqlSession.getMapper(IUserDAO.class) ;
    }

    /** 
    * @Description: 事务回滚、释放资源 
    * @Param:  
    * @return:  
    * @Author: Mr.chen
    * @Date: 2019/6/15 
    */ 
    @After
    public void destory() throws Exception{
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    /** 
    * @Description: 查询所有的方法 
    * @Param:  
    * @return:  
    * @Author: Mr.chen
    * @Date: 2019/6/15 
    */ 
    @Test
    public void findAll(){
        List<User> users = userDAO.findAll() ;
        for(User user :users){
            System.out.println("每个用户");
            System.out.println(user);
            System.out.println(user.getAccounts());
        }
    }
    /**
    * @Description:保存方法
    * @Param:
    * @return:
    * @Author: Mr.chen
    * @Date: 2019/6/15
    */
    @Test
    public  void save(){
        User user = new User() ;
        user.setUserName("ccc6");
        user.setAddress("京");
        user.setSex("女");
        user.setBithday(new Date());
        userDAO.save(user);
    }
    /** 
    * @Description: 删除用户
    * @Param:  
    * @return:  
    * @Author: Mr.chen
    * @Date: 2019/6/15 
    */ 
    @Test
    public void delete(){
        userDAO.delete(51);
    }

    @Test
    public void update(){
        User user = new User() ;
        user.setUid(52);
        user.setUserName("杭州");
        user.setAddress("50");
        user.setSex("男");
        user.setBithday(new Date());
        userDAO.update(user);
        System.out.println(user);
    }

    @Test
    public void findUserById(){
      User user =  userDAO.getUserById(52) ;
        System.out.println(user);
    }

    @Test
    public void findTotalUser(){
        int count = userDAO.findTotalUser() ;
        System.out.println(count);
    }

    @Test
    public void findUserByName(){
        List <User> users = userDAO.findUserByName("杭");
        for (User user : users){
            System.out.println(user);
        }

    }
}
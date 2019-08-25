import com.cy.mybatis.IDao.IUser;
import com.cy.mybatis.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.io.InputStream;
import java.util.List;

/**
 * @program: day03_01_mybatis_manymany
 * @description: 用户测试类
 * @author: MrChen
 * @create: 2019-06-12 19:28
 */
public class UserTest {

    private IUser userDao ;

    private  InputStream in ;

    private  SqlSession sqlSession ;


    @Before
    public void init() throws  Exception {
         in = Resources.getResourceAsStream("sqlMapConfig.xml");

        SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(in) ;

         sqlSession = sessionFactory.openSession() ;

         userDao  = sqlSession.getMapper(IUser.class) ;
    }


    @After
    public void destory() throws  Exception{

        sqlSession.commit();

        sqlSession.close();

        in.close();
    }

    @Test
    public void findAll(){
        List<User> userList =  userDao.findAll() ;

        for(User u : userList){
            System.out.println("每个用户信息");
            System.out.println(u);
            System.out.println(u.getRoles());
        }





    }
}
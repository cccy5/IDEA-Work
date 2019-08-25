import com.cy.mybatis.IDao.IRole;
import com.cy.mybatis.entity.Role;
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
 * @description: Role测试类
 * @author: MrChen
 * @create: 2019-06-12 21:10
 */
public class RoleTest {

    private InputStream in ;

    private SqlSession sqlSession ;

    private IRole roleDao ;

    @Before
    public void init() throws  Exception{

        in = Resources.getResourceAsStream("sqlMapConfig.xml") ;

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in) ;

        sqlSession = sessionFactory.openSession() ;

        roleDao = sqlSession.getMapper(IRole.class) ;
    }

    @After
    public  void destory() throws Exception{
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    @Test
    public void findAll(){
        List <Role> roleList = roleDao.findAll() ;
        for(Role r : roleList){
            System.out.println("每个角色的信息");
            System.out.println(r);
           System.out.println(r.getUsers());
        }
    }
}
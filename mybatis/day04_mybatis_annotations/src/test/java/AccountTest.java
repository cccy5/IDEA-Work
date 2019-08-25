import com.cy.IDAO.IAccount;
import com.cy.IDAO.IUserDAO;
import com.cy.entity.Account;
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
public class AccountTest {

    private InputStream in ;

    private IAccount accountDAO ;

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
        accountDAO  = sqlSession.getMapper(IAccount.class) ;
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
        List<Account> accounts = accountDAO.findAll() ;
       for (Account account : accounts){
           System.out.println("每一个账号");
           System.out.println(account);
           System.out.println(account.getUser());
       }


    }
    @Test
    public  void findAccountById(){
//        Account account = accountDAO.findAccountById(3) ;
//        System.out.println(account);
    }







}
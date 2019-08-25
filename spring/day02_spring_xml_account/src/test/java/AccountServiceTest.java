import com.cy.entity.Acccount;
import com.cy.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/6/23 15:20
 * @Description:测试类
 */
public class AccountServiceTest {

    @Test
    public  void findAll(){
        //1.获取容器
        ApplicationContext as = new ClassPathXmlApplicationContext("bean.xml")  ;

        IAccountService accountService = as.getBean("accountService",IAccountService.class) ;
        List<Acccount> acccounts = accountService.findAll() ;
        for(Acccount a : acccounts){
            System.out.println(a);
        }
    }
    @Test
    public  void findById(){
        ApplicationContext as = new ClassPathXmlApplicationContext("bean.xml")  ;

        IAccountService accountService = as.getBean("accountService",IAccountService.class) ;

        Acccount acccount = accountService.findAccountById(3) ;
        System.out.println(acccount);
    }
    @Test
    public  void save(){
        ApplicationContext as = new ClassPathXmlApplicationContext("bean.xml")  ;

        IAccountService accountService = as.getBean("accountService",IAccountService.class) ;

        Acccount account = new Acccount() ;
        account.setName("杭州");
        account.setMoney(10000);
        accountService.saveAccount(account);

    }
    @Test
    public  void update(){
        ApplicationContext as = new ClassPathXmlApplicationContext("bean.xml")  ;

        IAccountService accountService = as.getBean("accountService",IAccountService.class) ;
       // Acccount acccount = new Acccount() ;
        Acccount acccount = accountService.findAccountById(3) ;
        acccount.setName("hfjio");
        acccount.setMoney(11);
       // accountService.uptateAccount(5);
        accountService.uptateAccount(acccount);
    }
    @Test
    public  void delete(){
        ApplicationContext as = new ClassPathXmlApplicationContext("bean.xml")  ;

        IAccountService accountService = as.getBean("accountService",IAccountService.class) ;
    }


}
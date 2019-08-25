import com.cy.dao.IAccountService;
import com.cy.dao.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: Administrator
 * @Date: 2019/7/11 19:55
 * @Description:测试类
 */
public class Tes {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml") ;

        IAccountService as = (IAccountService) ac.getBean("accountService") ;

        as.savAccount();
        //as.deleteAccount() ;
        //as.updateAccount(2);
    }
}
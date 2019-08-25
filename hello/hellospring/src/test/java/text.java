import com.cy.spring.hello.spring.Service;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring-context.xml");
       // Service userService = (Service) applicationContext.getBean("userService");
        Service userService = (Service)applicationContext.getBean("userService");
        userService.sy();
    }
}

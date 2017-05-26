import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 56929 on 2017/5/23.
 */
public class RMICLient {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("rmiClient.xml");
        HelloRMIService helloRMIService =  applicationContext.getBean("myRMIClient",HelloRMIService.class);
        System.out.println(helloRMIService.getAdd(3, 4));
    }
}

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 56929 on 2017/5/23.
 */
public class RMIServiceTest {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("rmiServer.xml");
    }
}

import jnshu.BaseService;
import jnshu.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Title:ClientTest
 * Description:
 * Copyright:Copyright(c) 2013
 * Company:boco
 * author:zhangtao
 */
public class ClientTest {
    /**
     *Title:main
     *Description:
     * @param args
     */
    public static void main (String [] args)throws NotBoundException,
            java.net.MalformedURLException,
            RemoteException{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        BaseService baseService = (BaseService) context.getBean("baseService");
        User user = new User();
        System.out.println(baseService.getHelloword("zhangsan"));
        user.setName("bocosoft");
        user.setAge(33);
        try {
//            System.out.println(baseService.getUser(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
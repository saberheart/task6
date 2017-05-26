import java.rmi.Naming;

/**
 * Created by 56929 on 2017/5/23.
 */
public class HelloClient {
    public static void main(String[] args){
        try {
            //在RMI服务注册表中查找名为RHello的对象,并调用其上都的方法
            IHello rhello = (IHello) Naming.lookup("rmi://127.0.0.1:8888/RHello");
            System.out.print(rhello.sayHello("world"));
            System.out.print(rhello.sum(454,5457));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

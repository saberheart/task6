import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by 56929 on 2017/5/23.
 */
public class HelloServer {
    public static void main(String[] args){
        try {
            //创建一个远程对象
            IHello rhello = new HelloImpl();
            //生成远程对象注册表registry实例,并指定的端口为8888(默认是1099)
            LocateRegistry.createRegistry(8888);

            //把远程对象注册到RMI注册服务器上,并命名为RHello
            //绑定的Url标准格式为:rmi://host:port/name(协议名可以省略,下面两种写法都可以)
            Naming.bind("rmi://127.0.0.1:8888/RHello",rhello);
            System.out.print(">>INFO:远程IHello对象绑定成功!");

        }catch (RemoteException e) {
            System.out.print("创建远程对象发生异常");
            e.printStackTrace();
        }catch (AlreadyBoundException e) {
            System.out.print("发生重复绑定对象异常");
        }catch (MalformedURLException e) {
            System.out.print("发生URL畸形异常");
            e.printStackTrace();
        }
    }
}

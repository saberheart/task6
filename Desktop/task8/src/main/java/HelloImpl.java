import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by 56929 on 2017/5/23.
 */
public class HelloImpl extends UnicastRemoteObject implements IHello {
    private static final long serialVersionUID = 1961558474342609777L;
    public HelloImpl() throws RemoteException{
        super();
    }
    @Override
    public String sayHello(String name) {
        return "Hello," +name;
    }
    @Override
    public int sum(int a, int b){
        return a+b;
    }
}

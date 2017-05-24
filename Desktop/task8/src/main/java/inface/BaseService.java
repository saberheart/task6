package inface;

import dao.User;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by 56929 on 2017/5/24.
 */
public interface BaseService extends Remote {
    public String getHelloword(String name) throws RemoteException;
    public String getUser(User user) throws RemoteException;
}

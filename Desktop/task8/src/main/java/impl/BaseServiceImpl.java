package impl;

import dao.User;
import inface.BaseService;

import java.rmi.RemoteException;

/**
 * Created by 56929 on 2017/5/24.
 */
public class BaseServiceImpl implements BaseService {

    @Override
    public String getHelloword(String name) throws RemoteException {
        return "Welcome to boco,"+name+"!";
    }

    @Override
    public String getUser(User user) throws RemoteException {
        return "name:"+user.getName()+"--------->"+"age"+user.getAge();
    }
}

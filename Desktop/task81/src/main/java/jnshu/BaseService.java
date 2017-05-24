package jnshu;

import javax.xml.registry.infomodel.User;

/**
 * Created by 56929 on 2017/5/24.
 */
public interface BaseService {
    public String getHelloword(String name);
    public String getUser(User user) ;
}

/**
 * Created by 56929 on 2017/5/23.
 */
public class HelloRMIServiceImpl implements HelloRMIService {

    @Override
    public int getAdd(int a, int b) {
        return a+b;
    }
}

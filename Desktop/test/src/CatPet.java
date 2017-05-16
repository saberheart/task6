/**
 * Created by 56929 on 2017/5/16.
 */
/**
 * 当一条猫看见了,肚子饿了(有需求),所以去满足自己的需求(实现这个接口)
 */
public class CatPet implements PetRestaurant {

    @Override
    public void buy() {
        System.out.println("我是猫,我要买猫粮");
    }
}

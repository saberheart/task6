/**
 * Created by 56929 on 2017/5/16.
 */

/**
 * 当一条狗看见了,肚子饿了(有需求),所以去满足自己的需求(实现这个接口)
 */
public class DogPet implements PetRestaurant {

    @Override
    public void buy() {
        System.out.println("咱是狗,咱要买狗粮");
    }
}

/**
 * Created by 56929 on 2017/5/16.
 */

/**
 * 然后这时候我出来了,可以卖了(测试类)
 */
public class Boss {
    public static void main(String []args) {
        PetRestaurant dog = new DogPet();
        //将狗实例化(new一条狗出来)
        PetRestaurant cat = new CatPet();
        //将猫实例化(new一只猫出来)
        Waiter w = new Waiter();
        //将服务员实例化(new一个服务员出来)
        w.buy(cat);
        w.buy(dog);
    }
}

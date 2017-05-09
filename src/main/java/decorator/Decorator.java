package decorator;

/**
 * Created by Zephery on 2017/5/9.
 */
public class Decorator {
    public static void main(String args[]) {
        Breakfast breakfast1 = new Toast();
        System.out.println("您点的餐点为：" + breakfast1.getDescription() + "。价格为：" + breakfast1.cost());
        Breakfast breakfast2 = new Toast();
        breakfast2 = new Ham(breakfast2);
        breakfast2 = new Ham(breakfast2);
        System.out.println("您点的餐点为：" + breakfast2.getDescription() + "。价格为：" + breakfast2.cost());
        Breakfast breakfast3 = new Burger();
        breakfast3 = new Ham(breakfast3);
        breakfast3 = new Cheese(breakfast3);
        breakfast3 = new Cheese(breakfast3);
        System.out.println("您点的餐点为：" + breakfast3.getDescription() + "。价格为：" + breakfast3.cost());
    }
}

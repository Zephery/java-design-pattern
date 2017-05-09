package decorator;

/**
 * Created by Zephery on 2017/5/9.
 */
public class Burger extends Breakfast {
    public Burger(){
        description="汉堡";
    }
    @Override
    public Double cost(){
        return 15d;
    }
}

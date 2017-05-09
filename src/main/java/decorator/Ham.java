package decorator;

/**
 * Created by Zephery on 2017/5/9.
 */
public class Ham extends CondimentDecorator {
    public Ham(Breakfast myfood) {
        super(myfood);
    }

    @Override
    public Double cost() {
        return super.cost() + 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ",火腿";
    }
}

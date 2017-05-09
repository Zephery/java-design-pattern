package decorator;

/**
 * Created by Zephery on 2017/5/9.
 */
public class Cheese extends CondimentDecorator {
    public Cheese(Breakfast myfood) {
        super(myfood);
    }

    @Override
    public Double cost() {
        return super.cost() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ",起司";
    }
}

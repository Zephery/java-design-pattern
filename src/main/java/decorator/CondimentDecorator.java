package decorator;

/**
 * Created by Zephery on 2017/5/9.
 */
public abstract class CondimentDecorator extends Breakfast{
    Breakfast myfood;

    public CondimentDecorator(Breakfast myfood){
        this.myfood=myfood;
    }
    @Override
    public String getDescription(){
        return myfood.getDescription();
    }
    @Override
    public Double cost(){
        return myfood.cost();
    }
}

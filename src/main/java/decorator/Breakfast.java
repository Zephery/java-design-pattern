package decorator;

/**
 * Created by Zephery on 2017/5/9.
 */
public abstract class Breakfast {
    public String description="未知";
    public String getDescription(){
        return description;
    }
    public abstract Double cost();

}

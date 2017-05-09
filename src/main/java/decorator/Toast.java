package decorator;

/**
 * Created by Zephery on 2017/5/9.
 */
public class Toast extends Breakfast {
    public Toast(){
        description="吐司";
    }
    public Double cost(){
        return 10d;
    }
}

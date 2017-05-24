package singleton;

/**
 * Created by Zephery on 2017/5/24.
 */
public class SingletonDoubleSyn {
    private volatile static SingletonDoubleSyn instance;
    private SingletonDoubleSyn(){}
    public static SingletonDoubleSyn getInstance(){
        if(instance==null){
            synchronized (SingletonDoubleSyn.class){
                if(instance==null){
                    instance=new SingletonDoubleSyn();
                }
            }
        }
        return instance;
    }
}

package singleton;

/**
 * Created by Zephery on 2017/5/24.
 */
public class SingletonInnerClass {
    private SingletonInnerClass instance;
    private static class SingletonHolder{
        private static final SingletonInnerClass INSTANCE=new SingletonInnerClass();
    }
    private SingletonInnerClass(){}
    public SingletonInnerClass getInstance(){
        return SingletonHolder.INSTANCE;
    }
}

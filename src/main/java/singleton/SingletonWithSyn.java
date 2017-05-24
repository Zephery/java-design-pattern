package singleton;

/**
 * Created by Zephery on 2017/5/24.
 * 这种写法能够在多线程中很好的工作，而且看起来它也具备很
 * 好的lazy loading，但是，遗憾的是，效率很低，99%情况下不需要同步。
 */
public class SingletonWithSyn {
    private SingletonWithSyn instance;

    private SingletonWithSyn() {
    }

    public synchronized SingletonWithSyn getInstance() {
        if (instance == null) {
            instance = new SingletonWithSyn();
        }
        return instance;
    }
}

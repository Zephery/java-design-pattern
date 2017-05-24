package singleton;

/**
 * Created by Zephery on 2017/5/24.
 */
public class SimpleSingleton {
    private SimpleSingleton singleton;

    private SimpleSingleton() {
    }

    public SimpleSingleton getSingleton() {
        if (singleton == null) {
            singleton = new SimpleSingleton();
        }
        return singleton;
    }
}

package haha.xixi;

/**
 * <p>这是IoDH</p>
 */
public class Singleton {
    private Singleton singleton = null;

    private Singleton() {
    }

    private static class SingletonInner {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getSingleton() {
        return SingletonInner.instance;
    }
}

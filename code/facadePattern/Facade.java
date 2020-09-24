package facadePattern;

/**
 * 具体外观类
 * 该类可以在系统中仅仅存在一个：单例
 */
public class Facade implements Abstract {
    private static Facade facade;
    private A a;
    private B b;
    private C c;

    private Facade() {
        this.a = new A();
        this.b = new B();
        this.c = new C();
    }

    public static Facade getInstance() {
        if (facade == null) {
            facade = new Facade();
        }
        return facade;
    }

    @Override
    public void doSome() {
        a.DoA();
        b.DoB();
        c.DoC();
    }
}

package bridgePattern;

/**
 * 具体实现类一
 */
public class ConImplOne implements Implementor {
    @Override
    public void doSome() {
        System.out.println("我是具体实现类1");
    }
}

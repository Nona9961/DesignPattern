package proxyPattern;

/**
 * 真实对象
 */
public class RealMatter implements Abstract {
    @Override
    public void intro() {
        System.out.println("我是真实对象");
    }
}

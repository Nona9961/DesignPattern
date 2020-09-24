package abstractFactoryPattern;

/**
 * 语文
 */
public class Chinese implements AbstractSubject{
    @Override
    public void introduce() {
        System.out.println("我是语文");
    }
}

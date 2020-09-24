package abstractFactoryPattern;

/**
 * 物理
 */
public class Phy implements AbstractSubject {

    @Override
    public void introduce() {
        System.out.println("我是最好玩的物理");
    }
}

package abstractFactoryPattern;

/**
 * 物理工具
 */
public class PhyTools implements AbstractTools {
    @Override
    public void doSome() {
        System.out.println("仪器");
    }
}

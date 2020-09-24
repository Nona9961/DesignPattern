package decoratorPattern;

/**
 * 原类 有介绍的功能
 */
public class Face implements AbstractFace {
    @Override
    public void introduce() {
        System.out.println("我是一张脸");
    }
}

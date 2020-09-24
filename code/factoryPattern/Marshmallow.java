package factoryPattern;

/**
 *  棉花糖产品
 */
public class Marshmallow implements Product{
    @Override
    public void doSome() {
        System.out.println("好吃！");
    }
}

package factoryPattern;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new DiracFactory();
        Factory factory2 = new MarshmallowFactory();
        Product product = factory.createProduct();
        product.doSome();
        product = factory2.createProduct();
        product.doSome();
    }
}

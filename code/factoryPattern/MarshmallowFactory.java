package factoryPattern;
// 棉花糖工厂类
public class MarshmallowFactory implements Factory {
    @Override
    public Product createProduct() {
        // 初始化过程
        return new Marshmallow();
    }
}

package factoryPattern;
// 狄拉克工厂类
public class DiracFactory implements Factory {
    @Override
    public Product createProduct() {
        return new Dirac();
    }
}

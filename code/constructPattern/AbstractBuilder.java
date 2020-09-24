package constructPattern;

/**
 * 抽象builder类，负责定义初始化产品需要的方法：初始化product和返回product
 */
public abstract class AbstractBuilder {
    protected Product product = new Product();

    public abstract void setType();

    public abstract void setName();

    public abstract void setGender();

    public abstract void setAtk();

    public abstract void setDef();

    public abstract boolean isMale();
    //    public Product construct() {
//        this.setType();
//        this.setName();
//        // ...
//        return product;
//    }
    public Product getInstance() {
        return this.product;
    }
}

package bridgePattern;

/**
 * 抽象类，组合其他类并且声明业务方法
 */
public abstract class Abstraction {
    protected Implementor implementor;    // 组合抽象实现类

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;     // setter注入
    }

    public abstract void doOther();     // 业务方法声明
}

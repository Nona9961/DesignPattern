package prototypeManager;

/**
 * 抽象原型
 */
public interface AbstractPrototype extends Cloneable {
    AbstractPrototype clone();
    // 业务方法
    void display();
}

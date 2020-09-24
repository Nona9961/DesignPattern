package adapterParrten;

/**
 * 暴露给客户端的接口，声明了客户端需要的方法
 * 如果是类的话适配器继承，如果是接口的话适配器实现
 * 如果全部都是接口的话，适配器可以多实现完成类适配器模式
 */
public interface Target {
    void saySomething();
    int add();
}

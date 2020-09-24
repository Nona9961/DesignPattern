package mediator;

/**
 * 抽象同事接口（就是业务类）
 * 需要定义自己的业务方法：funcMyself，它仅仅处理自己的内容
 * 和定义调用中介者的方法：funcMedia，它会调用中介者中对应的方法
 */
public interface AbstractColl {
    void funcMyself();

    void funcMedia() throws Exception;
}

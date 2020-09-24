package bridgePattern;

/**
 * 具体类，偷懒只写一个了
 */
public class RefineAbstraction extends Abstraction {
    @Override
    public void doOther() {
        implementor.doSome();
    }
    // 其他业务方法
}

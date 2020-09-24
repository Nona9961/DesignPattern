package chainOfResponsibilityPattern;

public abstract class Handler {
    protected Handler successor; // 维护的下一个处理者

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void doSome(String request);    // 处理请求的类
}

package chainOfResponsibilityPattern;

/**
 * 最终处理类，处理前面都无法处理的东西
 */
public class ConcreteHandler_End extends Handler {
    @Override
    public void doSome(String request) {
        System.out.println("无法处理");
    }
}

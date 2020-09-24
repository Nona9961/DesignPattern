package chainOfResponsibilityPattern;

public class Client {
    public static void main(String[] args) {
        Handler one, two, three;
        one = new ConcreteHandler();
        two = new ConcreteHandler_Succ();
        three = new ConcreteHandler_End();

        // 构建职责链
        one.setSuccessor(two);
        two.setSuccessor(three);

        one.doSome("No,I only find o");
        one.doSome("Wow~");
        one.doSome("ow~");
    }
}

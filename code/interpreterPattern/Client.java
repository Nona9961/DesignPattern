package interpreterPattern;

public class Client {
    public static void main(String[] args) {
        ExpressionHandler handler = new ExpressionHandler();
        handler.handler("234-99+0.5+7-34+99.5 - 88+0-90.7776");
        System.out.println(handler.getResult());
    }
}

package abstractFactoryPattern;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new PhyFactory();
        factory.createSubject().introduce();
        factory.createTools().doSome();
    }
}

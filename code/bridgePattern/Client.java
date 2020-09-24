package bridgePattern;

public class Client {
    public static void main(String[] args) {
        Abstraction abstraction = new RefineAbstraction();
        Implementor implementor = new ConImplOne();

        abstraction.setImplementor(implementor);

        abstraction.doOther();
    }
}

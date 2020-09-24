package facadePattern;

public class Client {
    public static void main(String[] args) {
        Facade instance = Facade.getInstance();
        Facade instance2 = Facade.getInstance();
        instance.doSome();
        instance2.doSome();
        System.out.println(instance == instance2);
    }
}

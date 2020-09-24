package prototype;

import java.io.Serializable;

public class Client implements Serializable {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("周报");
        prototype.printSome();
        System.out.println("----------------------------------");
        ConcretePrototype clone = prototype.clone();
        clone.setName("日报");
        clone.setAge(19);
        clone.printSome();
    }
}

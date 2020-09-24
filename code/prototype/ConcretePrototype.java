package prototype;

import lombok.Data;

/**
 * java中的抽象原型类就是Object
 * 具体原型类，
 */
@Data
public class ConcretePrototype implements Cloneable {
    private String name;
    private int age;

    @Override
    public ConcretePrototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype) super.clone();
    }

    public void printSome() {
        System.out.println("**********" + getName() + "**********");
        System.out.println("**********          **********");
        System.out.println("**********          **********");
        System.out.println("**********" + getAge() + "**********");

    }
}

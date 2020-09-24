package observerPattern;

import lombok.Data;

/**
 * 具体观察者类，做出相应回答
 */
@Data
public class ConcreteObserver implements AbstractObserver {
    private String name;
    private int age;

    public ConcreteObserver() {
        this.name = "任博";
        this.age = 4;
    }

    @Override
    public void update() {
        System.out.println("年仅" + age + "岁的" + name + "说了不该说的话");
    }
}

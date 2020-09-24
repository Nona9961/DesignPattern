package strategyPattern;

public class ChildrenStr implements AbstractStrategy {
    @Override
    public double calculate(double price) {
        System.out.println("Welcome,My lovely kids.");
        return price - 10;
    }
}

package strategyPattern;

public class VIPStr implements AbstractStrategy {
    @Override
    public double calculate(double price) {
        System.out.println("Thanks for your incoming!");
        System.out.println("Your score has increased!");
        return price * 0.5;
    }
}

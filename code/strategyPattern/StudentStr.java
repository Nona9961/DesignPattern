package strategyPattern;

/**
 * 学生策略类
 */
public class StudentStr implements AbstractStrategy {
    @Override
    public double calculate(double price) {
        System.out.println("Wish you have a nice play,students!");
        return price * 0.8;
    }
}

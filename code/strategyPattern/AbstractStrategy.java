package strategyPattern;

/**
 * 抽象策略类 需要定义一个方法用来封装算法
 */
public interface AbstractStrategy {
    double calculate(double price);
}

package strategyPattern;

import lombok.Data;

/**
 * 环境类，调用具体策略类的类
 */
@Data
public class Context {
    private double price;
    private AbstractStrategy strategy;

    public double getDiscount() {
        return strategy.calculate(price);
    }
}

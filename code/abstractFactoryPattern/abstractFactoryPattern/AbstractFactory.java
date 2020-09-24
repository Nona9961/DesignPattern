package abstractFactoryPattern;

/**
 * 产品族抽象工厂类，这里定义多个工厂创建方法
 */
public interface AbstractFactory {
    AbstractSubject createSubject();
    AbstractTools createTools();
}

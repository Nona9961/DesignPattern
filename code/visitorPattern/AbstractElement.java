package visitorPattern;

/**
 * 抽象元素接口 仅仅声明一个业务方法
 */
public interface AbstractElement {
    void accept(AbstractVisitor visitor);
}

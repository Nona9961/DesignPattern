package visitorPattern;

/**
 * 抽象访问者类
 */
public abstract class AbstractVisitor {
    public abstract void visit(Apple apple);
    public abstract void visit(Book book);
}

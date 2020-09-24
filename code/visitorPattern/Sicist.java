package visitorPattern;

public class Sicist extends AbstractVisitor {
    @Override
    public void visit(Apple apple) {
        System.out.println("吃了苹果");
    }

    @Override
    public void visit(Book book) {
        System.out.println("做了笔记");
    }
}

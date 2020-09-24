package visitorPattern;

public class Chief extends AbstractVisitor {

    @Override
    public void visit(Apple apple) {
        System.out.println("做了佳肴");
    }

    @Override
    public void visit(Book book) {
        System.out.println("看不懂");
    }
}

package visitorPattern;

public class Book implements AbstractElement {
    @Override
    public void accept(AbstractVisitor visitor) {
        visitor.visit(this);
    }
}

package visitorPattern;

public class Apple implements AbstractElement {
    @Override
    public void accept(AbstractVisitor visitor) {
        visitor.visit(this);
    }
}

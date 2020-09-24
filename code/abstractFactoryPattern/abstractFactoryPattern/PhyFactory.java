package abstractFactoryPattern;

public class PhyFactory implements AbstractFactory {
    @Override
    public AbstractSubject createSubject() {
        return new Phy();
    }

    @Override
    public AbstractTools createTools() {
        return new PhyTools();
    }
}

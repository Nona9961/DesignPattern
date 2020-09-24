package abstractFactoryPattern;

public class ChineseFactory implements AbstractFactory {
    @Override
    public AbstractSubject createSubject() {
        return new Chinese();
    }

    @Override
    public AbstractTools createTools() {
        return new ChineseTools();
    }
}

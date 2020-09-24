package abstractFactoryPattern;

public class ChineseTools implements AbstractTools {
    @Override
    public void doSome() {
        System.out.println("字典");
    }
}

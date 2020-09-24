package factoryPattern;

/**
 * 狄拉克产品
 */
public class Dirac implements Product {

    private final String name = "Dirac";
    private final String symbol = "<|>";

    @Override
    public void doSome() {
        System.out.println(name + "符号就是" + symbol);
    }
}

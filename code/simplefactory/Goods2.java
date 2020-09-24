package simplefactory;

public class Goods2 implements Goods {
    private String name = "游戏";
    @Override
    public void doSome() {
        System.out.println("完了"+name);
    }
}

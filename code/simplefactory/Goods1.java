package simplefactory;

public class Goods1 implements Goods {

    private  String  name = "荔枝";
    @Override
    public void doSome() {
        System.out.println("吃了"+name);
    }
}

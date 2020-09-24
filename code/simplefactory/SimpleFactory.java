package simplefactory;

public class SimpleFactory {
    private static Goods goods = null;

    public static Goods createGoods(String name) {

        if (name == "游戏") goods = new Goods2();
        if (name == "荔枝") goods = new Goods1();
        return goods;
    }
}

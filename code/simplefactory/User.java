package simplefactory;

public class User {
    public static void main(String[] args) {
        Goods goods =  SimpleFactory.createGoods("哈哈");
        System.out.println("goods = " + goods);
        if (goods != null){
            goods.doSome();
        }
    }
}

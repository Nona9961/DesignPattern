package strategyPattern;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        AbstractStrategy strategy = new VIPStr();
        AbstractStrategy strategyStu = new StudentStr();
        context.setPrice(100d);
        context.setStrategy(strategy);
        System.out.println(context.getDiscount());
        context.setStrategy(strategyStu);
        System.out.println(context.getDiscount());
    }
}

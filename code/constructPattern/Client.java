package constructPattern;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.construct(new LancerBuilder());
        System.out.println(product);
    }
}

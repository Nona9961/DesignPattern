package visitorPattern;

public class Client {
    public static void main(String[] args) {
        Container container = new Container();
        container.add(new Apple());
        container.add(new Book());
        container.accept(new Chief());
        container.accept(new Sicist());
    }
}

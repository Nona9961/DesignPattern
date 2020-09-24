package adapterParrten;

public class Client {

    public static void main(String[] args) {
        Target t = new Adapter();
        t.saySomething();
        System.out.println(t.add());
    }
}

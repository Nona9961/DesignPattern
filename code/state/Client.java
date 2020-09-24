package state;

public class Client {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.handle();
        ctx.handle();
        ctx.handle();
    }
}

package proxyPattern;

public class Client {
    public static void main(String[] args) {
        Abstract matter = new Proxy();
        matter.intro();
    }
}

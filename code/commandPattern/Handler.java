package commandPattern;

/**
 * 处理类，即B类
 */
public class Handler {
    private String name;
    private final int score = 1;

    public Handler(String name) {
        this.name = name;
    }

    public void display(String str) {
        System.out.println(name + str + score);
    }
}

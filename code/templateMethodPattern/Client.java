package templateMethodPattern;

public class Client {
    public static void main(String[] args) {
        TemplateXXX xx = new TemplateImpl("111+000-999+333");
        xx.templateMethod();
    }
}

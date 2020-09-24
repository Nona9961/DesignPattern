package adapterParrten;

/**
 * 适配器，用来兼容两个本无关系的类
 */
public class Adapter implements Target {
    private Adaptee adaptee;   // 表示包裹这个适配者

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public Adapter() {
        // 默认包裹这个adaptee
        this.adaptee = new Adaptee();
    }

    @Override
    public void saySomething() {
        adaptee.writeSomething();
    }

    @Override
    public int add() {
        return adaptee.wrongTake();
    }
}

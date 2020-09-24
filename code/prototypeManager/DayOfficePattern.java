package prototypeManager;

public class DayOfficePattern implements AbstractPrototype {
    @Override
    public AbstractPrototype clone() {
        // 克隆方法
        AbstractPrototype abstractPrototype = null;
        try {
            abstractPrototype = (AbstractPrototype) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return abstractPrototype;
    }

    @Override
    public void display() {
        // 这里写业务方法
        System.out.println("日报模板");
    }
}

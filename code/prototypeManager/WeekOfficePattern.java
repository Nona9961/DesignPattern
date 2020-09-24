package prototypeManager;

public class WeekOfficePattern implements AbstractPrototype {
    @Override
    public AbstractPrototype clone() {
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
        System.out.println("周报模板");
    }
}

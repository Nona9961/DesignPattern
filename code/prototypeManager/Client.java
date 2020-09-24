package prototypeManager;

public class Client {
    public static void main(String[] args) {
        PrototypeManager manager = PrototypeManager.getManager();
        AbstractPrototype day = manager.getPrototype("day");
        day.display();
        AbstractPrototype week = manager.getPrototype("week");
        week.display();
        AbstractPrototype day1 = manager.getPrototype("day");
        System.out.println(day == day1);
        System.out.println(day.getClass() == day1.getClass());

        AbstractPrototype year = manager.getPrototype("year");
        System.out.println(year);
    }
}

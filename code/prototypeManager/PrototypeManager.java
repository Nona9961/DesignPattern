package prototypeManager;

import java.util.HashMap;

/**
 * 原型管理器
 */
public class PrototypeManager {
    private HashMap<String, AbstractPrototype> map = new HashMap();
    private static PrototypeManager prototypeManager = new PrototypeManager();

    private PrototypeManager() {
        map.put("day", new DayOfficePattern());
        map.put("week", new WeekOfficePattern());
    }

    public void addPrototype(String name, AbstractPrototype prototype) {
        map.put(name, prototype);
    }

    public AbstractPrototype getPrototype(String name) {
        // 偷懒没写，可以写个try-catch处理空指针异常
        AbstractPrototype clone = null;
        try {
            clone = map.get(name).clone();
        } catch (Exception e) {
            // log.error("没有这样的模板！")
            e.printStackTrace();
        }
        return clone;

    }

    public static PrototypeManager getManager() {
        return prototypeManager;
    }
}

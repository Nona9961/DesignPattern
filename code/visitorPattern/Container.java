package visitorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 数据结构类
 */
public class Container {
    private List<AbstractElement> list = new ArrayList<>();

    public void add(AbstractElement element) {
        list.add(element);
    }

    public void accept(AbstractVisitor visitor) {
        Iterator<AbstractElement> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }
}

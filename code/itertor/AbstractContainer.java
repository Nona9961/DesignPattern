package itertor;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器类、抽象聚合类，声明操作容器元素的方法
 * 此外，还需要声明返回迭代器的方法
 */
public abstract class AbstractContainer {
    protected List<Object> list = new ArrayList<>();

    public void add(Object obj) {
        list.add(obj);
    }

    public void remove(Object obj) {
        list.remove(obj);
    }

    public List getList(){
        return this.list;
    }

    public Object get(int i) {
       return list.get(i);
    }

    public abstract AbstractIterator iterator();
}

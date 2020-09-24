package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象中介者，需要有其他类的引用和他们的业务方法
 *
 */
public abstract class AbstractMediator {
    protected List<AbstractColl> list = new ArrayList<>();

    public void register(AbstractColl coll){
        list.add(coll);
    }
    public abstract void operation(int i) throws Exception;
}

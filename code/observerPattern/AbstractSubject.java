package observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标类，维护观察者，要求给予通知方法
 */
public abstract class AbstractSubject {
    protected List<AbstractObserver> list = new ArrayList<>();

    public void attach(AbstractObserver observer){
        list.add(observer);
    }
    public void detach(AbstractObserver observer){
        list.remove(observer);
    }

    public abstract void notifyObservers();
}

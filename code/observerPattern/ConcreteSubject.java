package observerPattern;


/**
 * 具体目标类
 */
public class ConcreteSubject extends AbstractSubject {

    @Override
    public void notifyObservers() {
        for (AbstractObserver abstractObserver : list) {
            abstractObserver.update();
        }
    }
}

package observerPattern;

public class Client {
    public static void main(String[] args) {
        AbstractObserver observer = new ConcreteObserver();
        AbstractSubject subject = new ConcreteSubject();
        subject.attach(observer);

        // something is happen
        subject.notifyObservers();
    }
}

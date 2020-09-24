package mediator;

public class Client {
    public static void main(String[] args) throws Exception {
        AbstractMediator mediator = new Mediator();
        AbstractColl coll =new Coll(mediator);
        mediator.register(coll);
        coll.funcMyself();
        coll.funcMedia();
    }
}

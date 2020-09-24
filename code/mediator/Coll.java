package mediator;

public class Coll implements AbstractColl {
    private AbstractMediator mediator;

    public Coll(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void funcMyself() {
        System.out.println("自己的方法");
    }

    @Override
    public void funcMedia() throws Exception {
        mediator.operation(0);
    }
}

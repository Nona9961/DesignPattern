package state;

public class NormalState extends AbstractState {

    public NormalState(Context ctx) {
        super(ctx);
    }

    @Override
    public void handle() {
        System.out.println("正常人真好");
        ctx.setAge(-1);
        stateCheck();
    }
}

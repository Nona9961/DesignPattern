package state;

public class SbState extends AbstractState {
    public SbState(Context ctx) {
        super(ctx);
    }

    @Override
    public void handle() {
        System.out.println("我是任博，嘿嘿嘿嘿嘿嘿嘿嘿嘿嘿嘿嘿");
        ctx.setAge(1);
        stateCheck();
    }
}

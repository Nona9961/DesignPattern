package state;


import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf;

/**
 * 抽象状态类 声明业务方法和需要的属性
 */
public abstract class AbstractState {
    protected String name;
    protected Context ctx;

    public AbstractState(Context ctx) {
        this.ctx = ctx;
    }

    public abstract void handle();

    public void stateCheck() {
        if (ctx.getAge() < 0) {
            System.out.println(name + "你是正常人,但你现在是任博了!");
            ctx.setState(new SbState(ctx));
        } else if (ctx.getAge() >= 0) {
            System.out.println("你是任博！给你个机会");
            ctx.setState(new NormalState(ctx));
        }
    }
}

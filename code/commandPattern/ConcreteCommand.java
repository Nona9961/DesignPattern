package commandPattern;

/**
 * 具体命令类，维护一个对应处理类的引用
 */
public class ConcreteCommand implements AbstractCommand {
    private Handler handler;

    public ConcreteCommand() {
        handler = new Handler("Nona");
    }

    @Override
    public void execute() {
        handler.display("996");
    }
}

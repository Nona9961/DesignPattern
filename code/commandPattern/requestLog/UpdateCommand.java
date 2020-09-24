package commandPattern.requestLog;

public class UpdateCommand extends Command {
    public UpdateCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.update(args);
    }

    @Override
    public void execute() {
        configOperator.update(args);
    }
}

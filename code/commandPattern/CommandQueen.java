package commandPattern;

import java.util.ArrayList;

/**
 * 命令队列
 */
public class CommandQueen {
    private ArrayList<AbstractCommand> commands = new ArrayList<>();

    public void addCommand(AbstractCommand command){
        commands.add(command);
    }

    public void removeCommand(AbstractCommand command){
        commands.remove(command);
    }

    public void execute(){
        for (AbstractCommand command : commands) {
            command.execute();
        }
    }
}

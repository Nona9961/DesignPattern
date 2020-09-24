package commandPattern.requestLog;

import java.util.ArrayList;

/**
 * 请求发送者
 */
public class ConfigSettingWindow {
    private ArrayList<Command> commands = new ArrayList<>();
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(String args) {
        command.execute(args);
        commands.add(command);
    }

    public void save() {
        LogUtils.writeCommands(commands);
    }

    public void recover() {
        ArrayList list;
        list = LogUtils.readCommands();

        for (Object o : list) {
            ((Command) o).execute();
        }
    }
}

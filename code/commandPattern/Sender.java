package commandPattern;

/**
 * 请求发送类 A类
 */
public class Sender {
//    private AbstractCommand command;
//
//    public void setCommand(AbstractCommand command) {
//        this.command = command;
//    }
//
//    public void send(){
//        command.execute();
//    }
    private CommandQueen commandQueen;

    public void setCommandQueen(CommandQueen commandQueen) {
        this.commandQueen = commandQueen;
    }
        public void send(){
        commandQueen.execute();
    }

}

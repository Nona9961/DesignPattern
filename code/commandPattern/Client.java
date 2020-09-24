package commandPattern;

public class Client {
    public static void main(String[] args) {
        CommandQueen queen = new CommandQueen();    // 新增命令队列
        AbstractCommand command = new ConcreteCommand();
        Sender sender = new Sender();

        queen.addCommand(command);  // 将command放入队列中
        sender.setCommandQueen(queen);  // 发送者维持对队列的引用
        sender.send();
    }
}

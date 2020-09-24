package commandPattern;

/**
 * 抽象命令接口，仅仅需要一个方法用来转送委托
 */
public interface AbstractCommand {
    void execute();
}

package commandPattern.requestLog;

import java.io.Serializable;

/**
 * 抽象命令类，有配置内容的增删改的内容
 */
public abstract class Command implements Serializable {
    protected String name;  // 命令名称
    protected String args;  // 命令参数
    protected ConfigOperator configOperator;    // 维持对接收者对象的引用

    public Command(String name) {
        this.name = name;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    public void setConfigOperator(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }

    public abstract void execute(String args);
    public abstract void execute();
}

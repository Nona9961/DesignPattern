package state;

import lombok.Data;

/**
 * 环境类，原类，维护一个状态类的引用
 */
@Data
public class Context {
    private AbstractState state;
    private int age;

    public Context() {
        age = 1;
        state = new NormalState(this);
    }

    public void handle() {
        state.handle();
    }
}

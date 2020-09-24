package commandPattern.requestLog;

import java.io.Serializable;

/**
 * 配置操作类，操作配置的类
 */
public class ConfigOperator implements Serializable {
    public void insert(String args) {
        System.out.println("增加新节点：" + args);
    }

    public void delete(String args) {
        System.out.println("删除节点：" + args);
    }

    public void update(String args) {
        System.out.println("修改节点：" + args);
    }
}

package flyWeightPattern;

/**
 * 抽象享元
 * 仅仅定义公共方法和获得内部状态的方法
 *
 */
public interface AbstractFriend {
    String getName(); // 获得内部状态的方法

    void engage(People people);  // 业务方法
}

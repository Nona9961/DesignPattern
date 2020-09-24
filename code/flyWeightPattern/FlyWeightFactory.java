package flyWeightPattern;

import java.util.HashMap;

/**
 * 享元工厂，主要完成享元池的功能
 */
public class FlyWeightFactory {
    private static HashMap<String,AbstractFriend> map = new HashMap<>();
    private static FlyWeightFactory factory = new FlyWeightFactory();

    private FlyWeightFactory() {
        map.put("th15_5b",new FriendOne());
    }

    public static FlyWeightFactory getInstance(){
        return factory;
    }

    public AbstractFriend getFriend(String name){
        return map.get(name);
    }

    // 还可以继续实现向享元池里面新增享元对象
}

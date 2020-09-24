package flyWeightPattern;

public class FriendOne implements AbstractFriend {
    @Override
    public String getName() {
        return "Clown Piece";   // 内部属性 name="Clown piece"的等价写法
    }

    @Override
    public void engage(People people) {
        System.out.println(people.getName() + "开始向" + getName() + "宣誓");    // 这里的name是外部状态
    }
}

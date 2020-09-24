package adapterParrten;

/**
 * 适配者类，被适配器包裹提供方法
 */
public class Adaptee {
    public void writeSomething(){
        System.out.println("本来是写下来的东西，现在是说出来的");
    }

    public int wrongTake(){
        System.out.println("错了");
        return 0;
    }

    public void noUse(){
        System.out.println("不会用的方法");
    }
}

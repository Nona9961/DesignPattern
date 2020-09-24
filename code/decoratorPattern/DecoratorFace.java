package decoratorPattern;

/**
 * 装饰器抽象类
 */
public abstract class DecoratorFace implements AbstractFace {
    private AbstractFace face;


    public DecoratorFace(AbstractFace face) {
        this.face = face;
    }

    @Override
    public void introduce() {
        face.introduce();
    }
}

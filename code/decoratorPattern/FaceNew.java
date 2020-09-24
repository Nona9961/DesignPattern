package decoratorPattern;

public class FaceNew extends DecoratorFace {
    public FaceNew(AbstractFace face) {
        super(face);
    }

    @Override
    public void introduce() {
        super.introduce();
        addDes();
    }

    private void addDes() {
        System.out.println("这个是嘴巴");
    }
}

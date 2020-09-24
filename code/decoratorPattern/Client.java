package decoratorPattern;

public class Client {
    public static void main(String[] args) {
        AbstractFace face, facenew;
        face = new Face();
        facenew = new FaceNew(face);
        facenew.introduce();
    }
}

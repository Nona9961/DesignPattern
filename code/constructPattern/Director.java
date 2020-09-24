package constructPattern;

public class Director {
    public Product construct(AbstractBuilder builder) {
        Product product = null;
        builder.setAtk();
        if (builder.isMale()) {
            // 男人才有防御
            builder.setDef();
        }
        builder.setGender();
        builder.setName();
        builder.setType();
        product = builder.getInstance();
        return product;
    }
}

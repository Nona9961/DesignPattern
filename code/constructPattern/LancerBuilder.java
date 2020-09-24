package constructPattern;

public class LancerBuilder extends AbstractBuilder {
    @Override
    public void setType() {
        product.setType("Lancer");
    }

    @Override
    public void setName() {
        product.setName("KQL");
    }

    @Override
    public void setGender() {
        product.setGender("male");
    }

    @Override
    public void setAtk() {
        product.setAtk(100);
    }

    @Override
    public void setDef() {
        product.setDef(100);
    }

    @Override
    public boolean isMale() {
        return true;
    }
}

package interpreterPattern;

/**
 * 数值解释器：终结符的解释器
 */
public class ValueExpression implements AbstractExpression {
    private double val;

    public ValueExpression(double val) {
        this.val = val;
    }

    @Override
    public double interpret(Context ctx) {
        return val;
    }
}

package interpreterPattern;

/**
 * 非终结符 expression:= value | operation
 */
public class Expression implements AbstractExpression {

    private AbstractExpression expression;

    public Expression(AbstractExpression expression) {
        this.expression = expression;
    }

    @Override
    public double interpret(Context ctx) {
        return expression.interpret(ctx);
    }
}

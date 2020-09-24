package interpreterPattern;

/**
 * 非终结符： operation:= expression '+' expression | expression '-' expression
 */
public class Operation implements AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;
    private boolean flag;   // true:plus false:minus

    public Operation(AbstractExpression left, AbstractExpression right, boolean flag) {
        this(left, right);
        this.flag = flag;
    }

    public Operation(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
        this.flag = true;
    }

    @Override
    public double interpret(Context ctx) {
        if (flag){
            return left.interpret(ctx) + right.interpret(ctx);
        }else {
            return left.interpret(ctx) - right.interpret(ctx);
        }
    }
}

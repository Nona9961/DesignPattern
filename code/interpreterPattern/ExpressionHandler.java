package interpreterPattern;

import java.util.Stack;

/**
 * 表达式处理类
 */
public class ExpressionHandler {
    private double result;
    private AbstractExpression node;
    private Context ctx = new Context();

    public void handler(String str) {
        AbstractExpression left, right;
        AbstractExpression valueExpression;
        str = str.replace("+", " + ");
        str = str.replace("-", " - ");
        str = str.replaceAll("\\s+", " ");
        String[] words = str.split(" ");
        Stack stack = new Stack();
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("+")) {
                left = (AbstractExpression) stack.pop();
                valueExpression = new ValueExpression(Double.parseDouble(words[++i]));
                right = new Expression(valueExpression);
                stack.push(new Operation(left, right));
            } else if (words[i].equals("-")) {
                left = (AbstractExpression) stack.pop();
                valueExpression = new ValueExpression(Double.parseDouble(words[++i]));
                right = new Expression(valueExpression);
                stack.push(new Operation(left, right, false));
            } else {
                valueExpression = new ValueExpression(Double.parseDouble(words[i]));
                stack.push(new Expression(valueExpression));
            }
        }
        this.node = (AbstractExpression) stack.pop();
    }

    public double getResult() {
        double interpret = node.interpret(ctx);
        this.result = interpret;
        return this.result;
    }
}

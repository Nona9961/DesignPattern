package interpreterPattern;

/**
 * 抽象表达式类
 * 唯一方法（函数式接口），聚合上下文环境进来
 */
public interface AbstractExpression {
    double interpret(Context ctx);
}

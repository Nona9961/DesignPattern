package templateMethodPattern;

import interpreterPattern.ExpressionHandler;

public class TemplateImpl extends TemplateXXX {
    public TemplateImpl(String str) {
        super(str);
    }

    @Override
    public double cal(String str) {
        ExpressionHandler handler = new ExpressionHandler();
        handler.handler(str);
        return handler.getResult();
    }
}

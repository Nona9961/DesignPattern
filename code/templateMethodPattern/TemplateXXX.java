package templateMethodPattern;

import interpreterPattern.ExpressionHandler;

/**
 * XXX的抽象模板类，定义以下事件
 * 1. 引入解释器
 * 2. 写出需要计算的结果
 * 3. 是否计算
 * 4. 将结果返回或者返回不计算
 */
public abstract class TemplateXXX {
    private String str;

    public TemplateXXX(String str) {
        this.str = str;
    }

    public final void templateMethod() {
        String v = null;
        insertInterpreter();
        if (isCal()) {
            v = cal(str) + "";
        } else {
            v = "不计算";
        }
        backResult(v);
    }

    public void insertInterpreter() {
        System.out.println("开始计算啦！");
    }

    public boolean isCal() {
        return true;
    }

    public abstract double cal(String str);

    public void backResult(String str) {
        System.out.println(str);
    }
}

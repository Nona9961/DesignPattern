package chainOfResponsibilityPattern;

/**
 * 具体处理类 继承抽象类并且进行业务逻辑处理
 *
 */
public class ConcreteHandler extends Handler {

    @Override
    public void doSome(String request) {
        if (request.startsWith("N")){
            // 处理以N开头的字符串
            System.out.println(request.substring(1));
        }else {
            successor.doSome(request);  // 交由下一个处理者处理
        }
    }
}

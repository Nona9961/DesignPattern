package chainOfResponsibilityPattern;

/**
 * 具体处理者，在另一个之后
 */
public class ConcreteHandler_Succ extends Handler{
    @Override
    public void doSome(String request) {
        if (request.startsWith("W")){
            System.out.println(request+"你是第二节点处理的");
        }else{
            successor.doSome(request);
        }
    }
}

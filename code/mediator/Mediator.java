package mediator;

/**
 * 中介者类 维护引用 写相互调用的业务方法
 */
public class Mediator extends AbstractMediator {


    @Override
    public void operation(int i) throws Exception {
        if (i >= list.size()) {
            throw new Exception("没那么多");
        }
        list.get(i).funcMyself();
    }
}

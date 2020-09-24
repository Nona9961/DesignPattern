package compositePattern;

/**
 * leaf节点，实现AbstractFiles接口
 */
public class MyFiles implements AbstractFiles {
    private String name;

    public MyFiles(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFiles file) {
        throw new NotSupportException("files没有新增节点功能");
    }

    @Override
    public void remove(int i) {
        throw new NotSupportException("files没有删除节点功能");

    }

    @Override
    public AbstractFiles get(int i) {
        throw new NotSupportException("files没有获得节点功能");
    }

    @Override
    public void operation() {
        System.out.println("在" + name + "执行了方法");
    }
}

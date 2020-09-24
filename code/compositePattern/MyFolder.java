package compositePattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * container节点，包含下一级节点，递归调用子节点的业务方法
 */
public class MyFolder implements AbstractFiles {
    private ArrayList<AbstractFiles> filesList = new ArrayList<>();
    private String name;

    public MyFolder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFiles file) {
        filesList.add(file);
    }

    @Override
    public void remove(int i) {
        filesList.remove(i);
    }

    @Override
    public AbstractFiles get(int i) {
        return filesList.get(i);
    }

    @Override
    public void operation() {
        // 递归调用子节点的业务方法
        Iterator<AbstractFiles> iterator = filesList.iterator();
        while(iterator.hasNext()){
            iterator.next().operation();
        }
    }
}

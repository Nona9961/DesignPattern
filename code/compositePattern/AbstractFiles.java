package compositePattern;

/**
 * 文件抽象类，既可能是leaf节点的file，也可能是container节点的folder
 * file: impl operation()
 * folder: impl add(),remove(),get(),operation()
 */
public interface AbstractFiles {
    void add(AbstractFiles file);

    void remove(int i);

    AbstractFiles get(int i);

    void operation();

}

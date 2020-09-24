package itertor;

/**
 * 迭代器接口：需要实现以下4个方法
 * 1. 重置为第一个元素
 * 2. 下一个元素
 * 3. 是否存在下一个元素
 * 4. 当前元素
 * ----------------以下是双向迭代器实现的方法
 * 5. 重置为最后一个元素
 * 6. 上一个元素
 * 7. 是否存在上一个元素
 */
public interface AbstractIterator {
    boolean first();
    void next();
    boolean hasNext();
    Object currentItem();
    // ----------------------------
    boolean last();
    void previous();
    boolean hasPrevious();
}

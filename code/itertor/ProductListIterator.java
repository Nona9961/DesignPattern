package itertor;

import java.util.List;

/**
 * ProductList的具体迭代器类
 */
public class ProductListIterator implements AbstractIterator {
    private ProductList productList;
    private List list;
    private int cursor;  // 游标

    public ProductListIterator(ProductList productList) {
        // 默认正向开始
        this(productList, true);
    }

    public ProductListIterator(ProductList productList, boolean flag) {
        this.productList = productList;
        list = productList.getList();
        cursor = flag ? -1 : list.size();
    }


    @Override
    public boolean first() {
        cursor = -1;
        return true;
    }

    @Override
    public void next() {
        if (cursor < list.size() - 1) {
            cursor++;
        }
    }

    @Override
    public boolean hasNext() {
        if (cursor < list.size() - 1) {
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return list.get(cursor);
    }

    @Override
    public boolean last() {
        cursor = list.size();
        return true;
    }


    @Override
    public void previous() {
        if (cursor > 0) {
            cursor--;
        }
    }

    @Override
    public boolean hasPrevious() {
        if (cursor > 0) {
            return true;
        }
        return false;
    }
}

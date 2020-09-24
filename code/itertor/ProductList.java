package itertor;

import java.util.List;

/**
 * 具体聚合类
 */
public class ProductList extends AbstractContainer {


    @Override
    public AbstractIterator iterator() {
        return new ProductListIterator(this);
    }
}

package itertor;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        AbstractContainer container = new ProductList();
        container.add("a");
        container.add("ab");
        container.add("abc");
        container.add("abcd");
        AbstractIterator iterator = container.iterator();
        while (iterator.hasPrevious()) {
            iterator.previous();
            System.out.println(iterator.currentItem());
        }
        iterator.first();
        while (iterator.hasNext()) {
            iterator.next();
            System.out.println(iterator.currentItem());
        }
        iterator.last();
        while (iterator.hasPrevious()) {
            iterator.previous();
            System.out.println(iterator.currentItem());
        }
        List list = new ArrayList();
        list.add("1");
        list.add("3");
        Iterator iterator1 = list.iterator();
        System.out.println(iterator1.hasNext());
        Object next = iterator1.next();
        System.out.println(next);
    }
}

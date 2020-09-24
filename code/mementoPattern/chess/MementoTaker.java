package mementoPattern.chess;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人类
 */
public class MementoTaker {
    private int index = -1;
    private List<Memento> list = new ArrayList<>();

    public void addMemento(Memento memento) {
        if (index != list.size() - 1) {
            list = list.subList(0, index + 1);
        }
        list.add(memento);
        index++;
    }

    public void removeMemento(Memento memento) {
        list.remove(memento);
        index--;
    }

    public Memento getMemento(int i) {
        if (i < list.size()) {
            index = i;
            return list.get(i);
        }
        return null;
    }

    @Override
    public String toString() {
        return "MementoTaker{" +
                "list=" + list +
                '}';
    }
}

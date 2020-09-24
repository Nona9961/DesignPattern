package mementoPattern.chess;

import lombok.Data;
import lombok.ToString;

/**
 * 备忘录类
 * 仅仅Chess类可见
 */
@Data
@ToString
class Memento {
    private String color;
    private int row;
    private int col;

    public Memento(String color, int row, int col) {
        this.color = color;
        this.row = row;
        this.col = col;
    }
}

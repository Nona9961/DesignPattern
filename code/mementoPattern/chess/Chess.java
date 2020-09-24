package mementoPattern.chess;

import lombok.Data;

/**
 * 原类：下棋
 */
@Data
public class Chess {
    private String color;
    private int row;
    private int col;

    public void putChess() {
        System.out.println(color + "颜色的棋子，下在(" + row + "," + col + ")");
    }

    // 与备忘录相关的方法
    public Memento save() {
        return new Memento(this.color, this.row, this.col);
    }

    public void restore(Memento memento) {
        this.color = memento.getColor();
        this.row = memento.getRow();
        this.col = memento.getCol();
    }
}

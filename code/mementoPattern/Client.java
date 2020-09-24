package mementoPattern;

import mementoPattern.chess.Chess;
import mementoPattern.chess.MementoTaker;

public class Client {
    public static void main(String[] args) {
        MementoTaker taker = new MementoTaker();
        Chess chess = new Chess();
        chess.setColor("白");
        chess.setRow(2);
        chess.setCol(2);
        display(taker, chess);
        chess.setCol(6);
        display(taker, chess);
        chess.setCol(7);
        chess.setRow(0);
        display(taker, chess);
        redo(taker, chess, 0);
        chess.setColor("黑");
        display(taker, chess);
        System.out.println(taker);
    }

    public static void display(MementoTaker taker, Chess chess) {
        taker.addMemento(chess.save());
        chess.putChess();
    }

    public static void redo(MementoTaker taker, Chess chess, int i) {
        chess.restore(taker.getMemento(i));
    }
}

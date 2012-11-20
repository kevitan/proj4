/*
    BoardClass.java
    Implements the actual board.
*/

package eecs285.proj4;

public class BoardClass {
    public PointClass board[][];

    public BoardClass() {
        board = new PointClass[19][19];
        for(int i = 0; i < 19; i ++) {
            for(int j = 0; j < 19; j++) {
                board[j][i] = new PointClass();
            }
        }
    }

    public boolean updateBoard(int x, int y, ColorEnum color) {
        if(board[y][x].getOccupant() == null && !board[y][x].ko) {
            board[y][x].addOccupant(new StoneClass(x, y, color));
            return true;
        }
        else return false;
    }
}

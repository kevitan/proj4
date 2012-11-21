/*
   Project 4: Go285
   @author Shannon Pawloski, Kevin Tan, David Rushdoony, Michael Noonan
   @date nov 18, 2012
    BoardClass.java
    Implements the actual board.
*/

package eecs285.proj4.Go285;

public class BoardClass {
    public PointClass board[][];

    public BoardClass() {
        board = new PointClass[19][19];
        for(int i = 0; i < 19; i ++) {
            for(int j = 0; j < 19; j++) {
                board[j][i] = new PointClass(i, j);
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

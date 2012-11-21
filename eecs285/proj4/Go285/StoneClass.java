/*
    StoneClass.java
    Implements a stone, which is a playing piece on the board.
*/

package eecs285.proj4.Go285;

public class StoneClass {
    private int x;
    private int y;
    private ColorEnum color;
    
    StoneClass(int x, int y, ColorEnum color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    int numLiberties() {
       int n = 0;
       return n;
    }
}

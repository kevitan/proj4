/*
    GameClass.java
    Implements the game, which contains all of the necessary componenets
    to run the game.
*/

package eecs285.proj4.Go285;

public class GameClass {
    private PlayerClass player1;
    private PlayerClass player2;
    
    public static BoardClass board;

    static {
        board = new BoardClass();
    }

    public GameClass() {
        player1 = new PlayerClass(ColorEnum.BLACK);
        player2 = new PlayerClass(ColorEnum.WHITE);
    }

    void run() {
        
    }
}

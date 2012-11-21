/*
    PlayerClass.java
    Implements the player class.
    @Author Michael Noonan, Shannon Pawloski, David Rushdoony, Kevin Tan
    @Date November 20, 2012
*/

package eecs285.proj4.Go285;

import java.util.Vector;

public class PlayerClass {
    private Vector<FormationClass> formations;
    private ColorEnum color;
    private int score;
    private boolean pass;

    public PlayerClass(ColorEnum color) {
        this.color = color;
        formations = new Vector<FormationClass>();
        score = 0;
        pass = false;
    }
}

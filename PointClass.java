/*  Project 4: Go285 - a go game for 2 players
    PointClass.java
    @Author Michael Noonan, Shannon Pawloski, David Rushdoony, Kevin Tan
    @Date Nov 18 2012
    Implements a single point on the Go board.
*/

package eecs285.proj4;

import java.awt.geom.*;

public class PointClass {
    private ColorEnum color;
    private StoneClass occupant;
    private int x, y;
    public boolean ko;

    public PointClass(int x, int y) {
        color = ColorEnum.NONE;
        occupant = null;
        ko = false;
        this.x = x;
        this.y = y;
    }

    public StoneClass getOccupant() {
        return occupant;
    }

    public void addOccupant(StoneClass occupant) {
        this.occupant = occupant;
    }
    public void removeOccupant() {
        occupant = null;
    }
}

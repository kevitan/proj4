/*
    PointClass.java
    Written by 
    Implements a single point on the Go board.
*/

package eecs285.proj4;

public class PointClass {
    private ColorEnum color;
    private StoneClass occupant;
    public boolean ko;

    public PointClass() {
        color = ColorEnum.NONE;
        occupant = null;
        ko = false;
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

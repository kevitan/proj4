/*
    FormationClass.java
    Implements a formation, which is a collection of adjacent stones of the 
    same color.
*/

package eecs285.proj4;

import java.util.Vector;

public class FormationClass {
    private Vector<StoneClass> stones;
    
    FormationClass() {
        stones = new Vector<StoneClass>();
    }

    int numLiberties() {
        int n = 0;
        for(int i = 0; i < (int) stones.size(); i++) {
            n += stones.get(i).numLiberties();
        }
        return n;
    }
}

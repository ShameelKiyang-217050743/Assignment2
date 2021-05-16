package za.ac.cput.Assignment2;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Shameel kiyang 217050743
 */
class SetATest {
    Set<String> sets = new HashSet<>();
    @Test
    public void addToSet(){

        //This Test will pass if value1 has been successfully added to the set
        sets.add("Object");
        assertEquals(1,sets.size());
    }
    @Test
    public void removeFromSet(){
        fillSet(sets,10);
        sets.remove("Object0");
        assertEquals(9,sets.size());

    }

    @Test
    public void findInSet(){
        //This test passes if the value in the parenthesis is successfully found in the set
        fillSet(sets,10);
        assertEquals(true,sets.contains("Object5"));
    }




    private void fillSet(Set<String> sets, int i) {
        for (int x = 0; x<i; x++){
            sets.add("Object"+x);
        }
    }
}
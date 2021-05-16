package za.ac.cput.Assignment2;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Shameel kiyang 217050743
 */
class CollectionATest {
    Collection<String> collections = new LinkedList<>();


    @Test
    public void addToCollection(){
        collections.add("number");

        // this test passes and returns "true" if it contains the value which has been added
        assertEquals(true,collections.contains("number"));
    }

    @Test
    public void removeFromCollection(){
        fillCollection(collections,5);
        //this test passes if 5 "numbers" have been added to the collection
        assertEquals(5,collections.size());
        collections.remove("number0");
        //this test passes if one "number" has been removed from the collection, the size should go from 5 to 4
        assertEquals(4,collections.size());

    }
    @Test
    public void findInCollection(){

        fillCollection(collections,5);
        //This test passes after 5 values are added to the collection and the specified value is contained within the collection
        assertEquals(true,collections.contains("number1"));

    }




    private void fillCollection(Collection<String> collections, int i) {
        for (int x = 0; x<i; x++){
            collections.add("number"+x);
        }
    }
}
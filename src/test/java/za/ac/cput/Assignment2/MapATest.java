package za.ac.cput.Assignment2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


import static org.junit.jupiter.api.Assertions.*;

class MapATest {
    Map<Integer,String> maps = new HashMap<>();

    @Test
    public void addToMap(){
        // here i am simply adding, since i am just adding once the size of the map should be equal to 1 as i have demonstrated in the assertion
        maps.put(1,"num1");
        assertEquals(1,maps.size());

    }
    @Test
    public void removeFromMap(){
        // assertion below passes when there are 5 values successfully added to the hashmap
        fillMap(maps,5);
        assertEquals(5,maps.size());
        // assertion bellow passes if a value has been removed from the hashmap
        maps.remove(0);
        assertEquals(4,maps.size());

    }

    @Test
    public void findInMap(){
        fillMap(maps,10);
        //here i am searching the value next to index 4, this passes if the value is successfully found
        assertEquals("num4",maps.get(4));
    }


    private void fillMap(Map<Integer,String> maps, int i) {
        for (int x = 0; x<i; x++){
            maps.put(x,"num"+x);
        }
    }
    
}
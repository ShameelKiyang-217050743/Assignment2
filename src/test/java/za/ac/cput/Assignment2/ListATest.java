package za.ac.cput.Assignment2;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Shameel kiyang 217050743
 */
 class ListATest {

    @Test
    public void addToList(){
        //creating List (Array)
        ArrayList<String> lists = new ArrayList<>();
        assertEquals(0,lists.size());
        //This Test will pass if value1 has been successfully added to the array
        lists.add("value1");
        assertEquals(1,lists.size());
    }
  @Test
     public void removeFromList(){
      //creating List (Array)
      ArrayList<String> lists = new ArrayList<>();
    // here i am attempting to add multiple values to my array
      fillList(lists,10);
      //i will now attempt to remove a value and the test should pass if i was successful
      lists.remove(0);
      assertEquals(9,lists.size());
  }
  @Test
  public void findValue(){
      ArrayList<String> lists = new ArrayList<>();
      fillList(lists,10);
      // here i am checking to see if a specific value is in a certain position in the array
      assertEquals("Value5",lists.get(5));

     }

     private void fillList(ArrayList<String> lists, int i) {
        for (int x = 0; x<i; x++){
            lists.add("Value"+x);
        }
     }

 }


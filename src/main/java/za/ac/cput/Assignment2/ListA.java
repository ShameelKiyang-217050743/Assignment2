package za.ac.cput.Assignment2;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Shameel kiyang 217050743
 */

public class ListA {
    ArrayList<String> lists = new ArrayList<>();

    public void addToList(){
        fillList(lists,10);
        System.out.println(lists+" values have been added to the list");
    }

    public void removeFromList(){

        lists.remove(0);
        System.out.println(lists+"- a single index has been removed");
    }

    public void findInList(){
        System.out.println(lists.get(0)+" the value in the 1st position has been indexed");
    }

    private void fillList(ArrayList<String> lists, int i) {
        for (int x = 0; x<i; x++){
            lists.add("Value"+x);
        }
    }

    public static void main(String[] args) {
        ListA l = new ListA();
        l.addToList();
        l.removeFromList();
        l.findInList();
    }
    }




package za.ac.cput.Assignment2;


import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Shameel kiyang 217050743
 */
public class SetA {
    Set<String> sets = new HashSet<>();

    public void addToSet(){
        fillSet(sets,10);
        System.out.println(sets+" objects have been added to the set");
    }

    public void removeFromSet(){

        sets.remove("Object0");
        System.out.println(sets+ " one object has been removed from the set");

    }
    public void findInSet(){

        System.out.println("is Object5 in the set?"+ sets.contains("Object5"));

    }

    private void fillSet(Set<String> sets, int i) {
        for (int x = 0; x<i; x++){
            sets.add("Object"+x);

        }
    }
}

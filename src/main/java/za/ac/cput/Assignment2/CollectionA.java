package za.ac.cput.Assignment2;


import java.util.*;
/**
 *
 * @author Shameel kiyang 217050743
 */
public class CollectionA {
    Collection<String> collections = new LinkedList<>();

    public void addToCollection(){
        fillCollection(collections,5);
        System.out.println(collections);
    }

    public void removeFromCollection(){
        collections.remove("number0");
        System.out.println(collections);

    }
    public void findInCollection(){
        System.out.println("is number2 contained within the set? :"+collections.contains("number2"));
    }



    private void fillCollection(Collection<String> collections, int i) {
        for (int x = 0; x<i; x++){
            collections.add("number"+x);
        }
    }

    public static void main(String[] args) {
        CollectionA c = new CollectionA();
        c.addToCollection();
        c.removeFromCollection();
        c.findInCollection();
    }
}















/**   public static void main(String[] args) {
 ListA l = new ListA();
 l.addToList();
 l.removeFromList();
 l.findInList();

 SetA s = new SetA();
 s.addToSet();
 s.removeFromSet();
 s.findInSet();

 MapA m = new MapA();
 m.addToMap();
 m.removeFromMap();
 m.findInMap();
 }*/
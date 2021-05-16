package za.ac.cput.Assignment2;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Shameel kiyang 217050743
 */
public class MapA {
    Map<Integer,String> maps = new HashMap<>();

    public void addToMap(){
        fillMap(maps,5);
        System.out.println(maps);

    }

    public void removeFromMap(){
        maps.remove(0);
        System.out.println(maps+" num0 has been removed");
    }

    public void findInMap(){
        System.out.println("the value searched for is: "+maps.get(1));

    }

    private void fillMap(Map<Integer,String> maps, int i) {
        for (int x = 0; x<i; x++){
            maps.put(x,"num"+x);
        }
    }
    public static void main(String[] args) {
        MapA m = new MapA();
        m.addToMap();
        m.removeFromMap();
        m.findInMap();
    }
}

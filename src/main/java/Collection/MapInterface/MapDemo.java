package Collection.MapInterface;

import java.util.HashMap;
import java.util.Map;

//Map does not inherit collection interface
public class MapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put(101, "deepraj");
        map.put(102, "deep");
        map.put(103, "sde");
        map.put(104, 22);
        map.put(null, null);
        map.put(null, null); //multiple null keys not allowed
        map.put(12, null); // multiplr null values allowed
        System.out.println(map);
        map.put(104, 23); //value updates for the for same key used again

        System.out.println(map);
        System.out.println(map.get(102));
        System.out.println(map.containsKey(103));
        System.out.println(map.containsValue("deepr"));
        System.out.println(map.isEmpty());
        map.remove(102);
        System.out.println(map);
        map.replace(103, "deeprajgawand");
        System.out.println(map);
        map.clear();
        System.out.println(map);


    }
}

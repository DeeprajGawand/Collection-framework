package Collection.TreeMap;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap tm = new TreeMap();

        tm.put(102, "Deepraj");
        tm.put(101, "by");
        tm.put(9, "java");
        tm.put(1, "failed");


//        tm.put("Deepraj", 102);
//        tm.put("by", 101);
//        tm.put("java", 9);
//        tm.put("failed", 1);

        System.out.println(tm);
        System.out.println(tm.ceilingEntry(102)); // returns the entry for that key if key not present then
        //increasing number of the key will be returned

        System.out.println(tm.containsKey(102));

        System.out.println(tm.firstEntry());//returns first entry

        System.out.println(tm.floorEntry(10)); //provide the particular or lesser entry

        System.out.println(tm.get(1011));

        System.out.println(tm.higherEntry(909));

        System.out.println(tm.keySet());

        System.out.println(tm.pollFirstEntry());//removes first entry

        System.out.println(tm);

        System.out.println(tm.size());

        tm.clear();

        System.out.println(tm);
       // tm.comparator(); // used for user define sorting

    }
}

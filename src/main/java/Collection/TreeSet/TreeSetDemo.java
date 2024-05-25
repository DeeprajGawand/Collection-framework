package Collection.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet t = new TreeSet();
        t.add(10);
        t.add(30);
        t.add(20);
        t.add(60);
        t.add(60);
        t.add(50);
        t.add(40);
       // t.add(null); // does not allow null value give null pointer exception
       // t.add("deepraj"); cannot provide different data type value

        System.out.println(t);
    }
}

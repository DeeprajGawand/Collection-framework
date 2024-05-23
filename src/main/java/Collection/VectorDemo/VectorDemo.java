package Collection.VectorDemo;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add(10);
        v.addElement(20);
        v.add("deepraj");


        System.out.println(v.elementAt(1));
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println( v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.remove(1));
        System.out.println(v);
        v.removeAllElements();
        System.out.println(v);
    }
}

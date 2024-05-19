package Collection.Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo1 {
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add(100);
        v.add("deepraj");
        v.add(10.5);

        System.out.println(v);
        Enumeration e  =v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}

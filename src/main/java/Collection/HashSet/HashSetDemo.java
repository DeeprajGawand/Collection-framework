package Collection.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {

        ArrayList ar = new ArrayList();
        ar.add("fullstack");
        ar.add("sde");

        HashSet hs = new HashSet(ar);

        hs.add("deepraj");
        hs.add(10);
        hs.add(10);
        hs.add(null);
        hs.add(null);
        hs.add("gawand");
        hs.addAll(ar);

        System.out.println(hs);

        Iterator it  =hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}

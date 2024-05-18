package Collection.IteratorandlistIterator;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {

        List l = new ArrayList();
        l.add("deepraj ");
        l.add(10);
        l.add("hwloo");

        System.out.println(l);

        Iterator itr  =l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        Set s = new HashSet();
        //cannot use listIterator in set
         ListIterator itrr =l.listIterator(l.size());

        while (itrr.hasPrevious()){
            System.out.println(itrr.previous());
        }
    }
}

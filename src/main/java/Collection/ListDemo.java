package Collection;


import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(100);
        l.add(100); //duplicate values allowed
        l.add(200);
        l.add(null); //
        l.add(null); // duplicate null values allowed

        List l1 = new ArrayList();
        l1.add(600);
        l1.addAll(l);



        System.out.println(l);
        System.out.println(l1);
        System.out.println(l1.contains(100));
        System.out.println(l1.get(0));
//       l1.clear();
        System.out.println(l1);
        System.out.println(l1.isEmpty());
        System.out.println( l1.indexOf(200));
        System.out.println( l1.remove(1));
        System.out.println(l);

        Iterator itr = l.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}

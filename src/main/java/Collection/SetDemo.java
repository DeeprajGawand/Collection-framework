package Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {

        Set s = new HashSet();
        s.add(100);
        s.add(100);
        s.add(200);
        s.add(null);
        System.out.println( s.size());
        System.out.println(s.isEmpty());
        System.out.println(s);


        Set s1 = new HashSet();
      s1.add(500);
      s1.addAll(s);
        System.out.println(s1);

       Iterator ite =   s1.iterator();
       while (ite.hasNext()){
           System.out.println(ite.next());
       }

    }
}

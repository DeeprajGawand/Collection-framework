package Collection.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(10);
        al.add(null);
        al.add(null);
        al.add(10);
        al.add("deepraj");

        ArrayList al2 = new ArrayList();
        al2.addAll(al);

        System.out.println(al);
        System.out.println(al2);

        System.out.println(al.isEmpty());

        al.clear();
        System.out.println(al);
    }
}

package Collection.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.add("deepraj");
        l.add("105");
        l.add(105);
        l.add(127.5);

        System.out.println(l);

        l.addFirst(1077);
        l.addLast(1088);

        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        l.removeFirst();
        l.removeLast();
        System.out.println(l);

    }
}

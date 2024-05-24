package Collection.Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("Deepraj");
        s.push(100);
        s.push("gawand");
        s.push("aaditi");
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.search("Deepraj"));
        System.out.println(s.empty());
    }
}

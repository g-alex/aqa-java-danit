package hw_8.task3.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        System.out.println("Try method isEmpty");
        System.out.println(deque.isEmpty());

        System.out.println("Try method add");
        System.out.println(deque.add("Butterfly"));
        System.out.println(deque);

        System.out.println("Try method addFirst");
        deque.addFirst("Alligator");
        deque.addFirst("Eagle");
        System.out.println(deque);

        System.out.println("Try method offerLast");
        System.out.println(deque.offerLast("Bear"));
        System.out.println(deque.offerLast("Dolphin"));
        System.out.println(deque);

        System.out.println("Try method getFirst");
        System.out.println(deque.getFirst());

        System.out.println("Try method peekLast");
        System.out.println(deque.peekLast());

        System.out.println("Try method removeFirst");
        System.out.println(deque.removeFirst());
        System.out.println(deque);

        System.out.println("Try method poolLast");
        System.out.println(deque.pollLast());
        System.out.println(deque);

        System.out.println("Try method remove with arg");
        System.out.println(deque.remove("Bear"));
        System.out.println(deque);

        System.out.println("Try method remove without arg");
        System.out.println(deque.remove());
        System.out.println(deque);

        System.out.println("Try method push");
        deque.push("Cow");
        System.out.println(deque);

        System.out.println("Try method pop");
        System.out.println(deque.pop());
        System.out.println(deque);

        System.out.println("Try method size");
        System.out.println(deque.size());

        System.out.println("Try method clear");
        deque.clear();
        System.out.println(deque.isEmpty());
    }
}

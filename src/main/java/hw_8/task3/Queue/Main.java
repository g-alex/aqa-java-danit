package hw_8.task3.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> queue= new LinkedList<>();

        System.out.println("Try method isEmpty");
        System.out.println(queue.isEmpty());

        System.out.println("Try method offer");
        queue.offer("Vasiok");
        queue.offer("Petya");
        System.out.println(queue);

        System.out.println("Try method add");
        queue.add("Vasilii");
        queue.add("Masha");
        System.out.println(queue);

        System.out.println("Try method size");
        System.out.println(queue.size());

        System.out.println("Try method element");
        System.out.println(queue.element());

        System.out.println("Try method peek");
        System.out.println(queue.peek());

        System.out.println("------------------");
        System.out.println(queue);
        System.out.println("Try method remove without arg");
        System.out.println(queue.remove());
        System.out.println(queue);

        System.out.println("------------------");
        System.out.println(queue);
        System.out.println("Try method remove with arg");
        System.out.println(queue.remove("Vasilii"));
        System.out.println(queue);

        System.out.println("Try method poll");
        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println("Try method clear");
        queue.clear();
        System.out.println(queue);
        }
}

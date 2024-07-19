package lesson32;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
         Queue<String> queue = new LinkedList<>();
         queue.add("A");
         queue.add("B");
         queue.add("C");
         queue.add("D");
        System.out.println(queue);

        Deque<String> deque = new LinkedList<>();
        deque.push("A");
        deque.push("B");
        deque.push("C");
        deque.push("D");
        System.out.println(deque);
    }
}

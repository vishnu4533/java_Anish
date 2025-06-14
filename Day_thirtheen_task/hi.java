import java.util.*;

//collections - Queue

// public class hi {
//     public static void main(String[] args) {
//         Queue<Integer> queue = new PriorityQueue<Integer>();
//         queue.add(5);
//         queue.add(4);
//         queue.add(3);
//         queue.add(2);
//         queue.add(1);
//         System.out.println(queue);
//     }
// }

// public class hi {
//     public static void main(String[] args) {
//         Queue<Integer> queue = new LinkedList<Integer>();
//         queue.offer(5);
//         queue.offer(4);
//         queue.offer(3);
//         queue.add(3);
//         queue.add(2);
//         queue.add(1);
//         System.out.println(queue);
//         System.out.println(queue.poll());
//         System.out.println(queue);
//         System.out.println("The Head is: " + queue.peek());
//         System.out.println(queue);
//         System.out.println("The remove element is: " + queue.remove());
//         System.out.println(queue);
//         System.out.println("The head elements is: " + queue.element());
//         System.out.println(queue);
//     }
// }


                //collections - Deque

public class hi {
    public static void main(String[] args) {
        ArrayDeque<String>queue = new ArrayDeque<String>(); 
        queue.add("day");
        queue.addFirst("Each");
        queue.addLast("Your");
        queue.addFirst("make");
        queue.add("Masterpiece");
        // queue.add(1);
        System.out.println(queue);
        queue.removeFirst();
        queue.removeLast();
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
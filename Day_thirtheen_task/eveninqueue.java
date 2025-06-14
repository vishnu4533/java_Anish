import java.util.*;
public class eveninqueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);
        // queue.add(4);
        // queue.add(5);
        // queue.add(6);
        // queue.add(7);
        // queue.add(8);
        // queue.add(9);
        // queue.add(10);
        for (int i = 1; i <= 10; i++) {
            queue.add(i);
        }
        System.out.println(queue);

        Object arr[] = queue.toArray();
        for (Object a : arr) {
            System.out.println(a);
        }
        System.out.println("Even Numbers: ");
        for (Object a : arr) {
            if ((Integer)a % 2 == 0) {
                System.out.println(a);
            }
        }
    }
}

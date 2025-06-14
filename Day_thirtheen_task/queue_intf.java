import java.util.*;
public class queue_intf {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        // System.out.println(queue.element() + " " + queue.poll() + " " + queue.element() + " " + queue.poll()  + " " + queue.element() + " " + queue.poll()  + " " + queue.element() + " " + queue.poll() );
        // System.out.println(queue.element() + " " + queue.poll() );
        // System.out.println(queue.element() + " " + queue.poll() );  
        // System.out.println(queue.element() + " " + queue.poll() );  
        // System.out.println(queue.poll());
        // System.out.println(queue);
        // System.out.println(queue.poll());
        // System.out.println(queue);
        // System.out.println(queue);
        // System.out.println("The remove element is: " + queue.remove());
        // System.out.println(queue);
        // System.out.println("The head elements is: " + queue.element());
        // System.out.println(queue);
        Iterator <String> itr = queue.iterator();
            while(itr.hasNext()){
                System.out.println(queue.peek());
                System.out.println(queue.poll() + " ");
            }
            System.out.println("\n" + queue.peek());
    }
    
}

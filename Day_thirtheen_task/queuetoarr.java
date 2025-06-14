import java.util.*;
public class queuetoarr {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        // System.out.println(queue);

        // Integer[] arr = new Integer[queue.size()];
        // queue.toArray(arr);
        // System.out.println(Arrays.toString(arr));
        Object arr[] = queue.toArray();
        System.out.println("From Array: ");
        for (Object a :arr){
            System.out.println(a);
        }
    
    }
    
}

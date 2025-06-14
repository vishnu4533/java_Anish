import java.util.*;
public class stringdecoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String name = sc.next();
        name.toUpperCase();

        char[] arr = name.toCharArray();
        for (char c : arr) {
            System.out.printf("%d ", c - 64);
        }
        sc.close();
        
    }
}

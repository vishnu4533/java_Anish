
import java.util.Scanner;

public class sumarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =n; i < n; i++) 
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
            
        }
        System.out.println("sum");
    }
}

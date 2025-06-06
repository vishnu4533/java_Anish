package Day_four_task;
import java.util.Scanner;
public class maxmininarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index value  : ");
        int e = sc.nextInt();
        int[] arr = new int[e];
        System.out.println("Enter the elements : ");
        for(int j = 0 ; j < e ; j++) {
            arr[j] = sc.nextInt(); 
        }
        int max = arr[0];
        int min = arr[0]; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum element in the array is: " + max);
        System.out.println("Minimum element in the array is: " + min);
        sc.close();
    }
}


package Day_five_task;

import java.util.Scanner;
public class sumoftdarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index value:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] [] arr = new int[n] [m];
        int sum = 0;
        System.out.println("Enter the elements:");
        for (int i=0; i < n; i++){
            for (int j=0; j < m; j++) {
                arr [i][j] = sc.nextInt();
            }
        }
        for (int i=0; i < n; i++){
            sum =0;
            for (int j=0; j < m; j++) {
                sum += arr[i][j];
            }
            System.out.println("The sum of the elements in the 2D array is: " + sum);
        }
        
        
        
        sc.close();
    }
}

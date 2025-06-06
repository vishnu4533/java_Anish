package Day_five_task;
import java.util.Scanner;
public class sumoftwotdarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter the index value:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] [] arr1 = new int[n] [m];
        System.out.println("Enter the elements:");
        for (int i=0; i < n; i++){
            for (int j=0; j < m; j++) {
                arr1 [i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the index value for the second array:");
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        int[][] arr2 = new int[n2][m2];
        System.out.println("Enter the elements for the second array:");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        
        int rows = arr1.length;
        int cols = arr1[0].length;
        
        int[][] sum = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        System.out.println("Sum of the two 2D arrays:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
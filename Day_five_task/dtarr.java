package Day_five_task;
import java.util.Scanner;
public class dtarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index value:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] [] arr = new int[n] [m];
        System.out.println("Enter the elements:");
        for (int i=0; i < n; i++){
            for (int j=0; j < m; j++) {
                arr [i][j] = sc.nextInt();
            }
        }

        for (int i=0; i < n; i++){
            for (int j=0; j < m; j++) {
                System.out.println(arr[i][j]+ "are the elements");
            }
        }
        sc.close();

    }
}

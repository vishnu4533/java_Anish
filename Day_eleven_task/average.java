import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of values: ");
        int sum = 0;
        int e = sc.nextInt();
        int[] arr = new int[e];
        int n = arr.length;
        System.out.println("Enter " +e+  " values: ");
        for(int j = 0 ; j < e ; j++) {
            arr[j] = sc.nextInt(); 
        }
        for (int i = 0; i < n; i++){
            sum += arr[i];
        }


        double average = (double) sum/n;
        System.out.println("the average of the give is: " + average);


        sc.close();
    }
    
}

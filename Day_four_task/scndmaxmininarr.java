package Day_four_task;

import java.util.Scanner;

public class scndmaxmininarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index value  : ");
        int e = sc.nextInt();
        int[] arr = new int[e];
        System.out.println("Enter the elements : ");
        for(int j = 0 ; j < e ; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();


    }

}

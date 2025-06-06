package Day_four_task;

import java.util.Scanner;
public class findelmninarr {
    
    static void elmfound() {
        Scanner sc = new Scanner(System.in);
       int found = 0;
        System.out.println("Enter the index value  : ");
        int e = sc.nextInt();
        int[] arr = new int[e];
        System.out.println("Enter the elements : ");
        for(int j = 0 ; j < e ; j++) {
            arr[j] = sc.nextInt(); 
        }
        System.out.println("Enter the elements to find in the array: ");
        int element = sc.nextInt();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == element) {
                found = 1;
                System.out.println("Element " + element+ " found at index: " + i);
                break;
            } else {
                found = 0;
            }
            
        }
        if (found == 0) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found in the array.");
        }
        sc.close();
        
    }
    public static void main(String[] args) {
        elmfound();
        
    }

}


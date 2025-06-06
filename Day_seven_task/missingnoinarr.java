//package Day_seven_task;
//
//public class missingnoinarr {
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5, 6, 8, 9, 10};
//        int n = arr.length;
//        int total = (n + 1) * (n + 2) / 2;
//        for (int i = 0; i < n; i++) {
//            total -= arr[i];
//        }
//        System.out.println("The missing number is: " + total);
//    }
//}

//package Day_seven_task;
//import java.util.*;
//public class missingnoinarr {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int total = (n + 1) * (n + 2) / 2;
//        for (int i = 0; i < n - 1; i++) {
//            if (arr[i + 1 ] == arr[i] + 1) {
//                continue;
//            } else {
//                System.out.println("The missing number is: " + (arr[i] + 1));
//            }
//        }
//    }
//}

package Day_seven_task;
import java.util.*;

public class missingnoinarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean foundMissing = false;
        for (int i = 0; i < n - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff > 1) {
                for (int j = 1; j < diff; j++) {
                    System.out.println("The missing number is: " + (arr[i] + j));
                    foundMissing = true;
                }
            }
        }
        if (!foundMissing) {
            System.out.println("No missing numbers in the sequence.");
        }
        sc.close();
    }
}
package Day_six_task;
import java.util.Scanner;
public class frequenciesofelementsinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index value  : ");
        int e = sc.nextInt();
        int[] arr = new int[e];
        System.out.println("Enter the elements : ");
        for(int j = 0 ; j < e ; j++) {
            arr[j] = sc.nextInt(); 
        }
        int[] frequency = new int[arr.length];
        boolean[] counted = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!counted[i]) {
                frequency[i] = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        frequency[i]++;
                        counted[j] = true;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (!counted[i]) {
                System.out.println("The frequency of the Element "+ arr[i] + " is : " + frequency[i]);
            }
        }
        sc.close();
    }
}




/*
public class frequenciesofelementsinarray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int cpy[] = new int[7];
        for (int i = 0; i < arr.length; i++) {
            cpy[arr[i]]++;
        }
        
        for (int i = 0; i < cpy.length; i++) {
            if (cpy[i] > 1) {
                System.out.println(i + "");
            }
        }

        }
}
*/
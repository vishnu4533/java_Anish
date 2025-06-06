package Day_four_task;
import java.util.Scanner;
import java.util.Arrays;
public class staticarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        System.out.println("The character is: " + a);   
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("The elements of the array are: " + Arrays.toString(arr));
        System.out.println("The length of the array is: " + arr.length);
        sc.close();
    }
    
}

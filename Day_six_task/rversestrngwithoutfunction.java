package Day_six_task;
import java.util.Scanner;
public class rversestrngwithoutfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        String reversedStr = "";
        
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedStr += charArray[i];
        }
        
        System.out.println("Reversed String: " + reversedStr);
        sc.close();
    }
}

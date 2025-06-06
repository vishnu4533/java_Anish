package Day_six_task;

import java.util.Scanner;

public class stringispalidrome { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word: "); 
        String str = sc.nextLine(); 
        String reverse = ""; 
        int strLength = str.length(); 

        for (int i = (strLength - 1); i >= 0; --i) { 
            reverse = reverse + str.charAt(i); 
        } 

        if (str.toLowerCase().equals(reverse.toLowerCase())) { 
            System.out.println(str+ " is Palindrome"); 
        } else { 
            System.out.println(str + " Not a Palindrome"); 
        }
        sc.close(); 
    } 
}

import java.util.*;
public class panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Paragraph:");
        String sen = sc.nextLine();
        sen = sen.toLowerCase();
        boolean[] alpha = new boolean[26];
        int index = 0;  
        for (int i = 0; i < sen.length(); i++) {
            char ch = sen.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                index = ch - 'a';
                alpha[index] = true;
            }
        }
        boolean isPangram = true;
        for (int i = 0; i < 26; i++) {
            if (!alpha[i]) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The Paragraph is a pangram.");
        } else {
            System.out.println("The Paragraph is not a pangram.");
        }
        sc.close();
    }
}
//File
//File Reader
//File Writer
//bufferedReader
//BufferedWriter
//FileInputStream
//FileOutputStream  
//printWriter
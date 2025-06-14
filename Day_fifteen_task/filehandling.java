import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// public class filehandling {
//     public static void main(String[] args) {
//         try{
//             File f = new File("example.docx");
//             if(f.createNewFile()){
//                 System.out.println("file is created");
//             }
//             else{
//                 System.out.println("Not created");
//             }
//         }
//         catch(IOException e){
//             System.out.println("An error creating file" + e);
//         }
//     }

// }

                    // filewriter

// public class filehandling {
//     public static void main(String[] args) {
//         try{
//             FileWriter f = new FileWriter("example.docx");
//             f.write("this is my file handling\nWelcome");
//             f.close();
//         }
//         catch(IOException e){
//             System.out.println("An error creating file" + e);
//         }
//     }
// }

// public class filehandling {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number to for a multiplication table you want: ");
//         int table = sc.nextInt();
//         String s = "This is " +  table + " table.";
//         try{
//             FileWriter obj = new FileWriter("example.txt", true);
//             obj.write("\n" +s + "\n");
//             for (int i = 1; i <= 10; i++){
//                 obj.write(table + " x " + i + " = " + table*i + "\n" );
//             }
//             obj.close();
//         }
//         catch(IOException e){
//             System.out.println("An error creating file" + e);
//         }
//         sc.close();
//     }
// }




public class filehandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to for a multiplication table you want: ");
        ArrayList
        int table = sc.nextInt();
        String s = "This is " +  table + " table.";
        try{
            FileWriter obj = new FileWriter("example.txt", true);
            obj.write("\n" +s + "\n");
            for (int i = 1; i <= 10; i++){
                obj.write(table + " x " + i + " = " + table*i + "\n" );
            }
            obj.close();
        }
        catch(IOException e){
            System.out.println("An error creating file" + e);
        }
        sc.close();
    }
}




import java.util.Scanner;
public class Simple_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operator;
        int a,b,result;
        System.out.println(" ENTER THE OPERATOR ( + , - , * , / )");
        operator = sc.next().charAt(0);
        System.out.println("ENTER THE FIRST OPERAND");
        a = sc.nextInt();
        System.out.println("ENTER THE SECOND OPERAND");
        b = sc.nextInt();
        switch (operator) {
            case '+' :
            result = a+b;
             System.out.println(a  + " + " + b + " = " + result);
             break;

             case '-' :
             result = a-b;
             System.out.println(a  + " - " + b + " = " + result);
             break;

             case '*' :
             result = a*b;
             System.out.println(a  + " * " + b + " = " + result);
             break;

             case '/' :
             result = a/b;
             System.out.println(a  + " / " + b + " = " + result);
             break;

             default :
             System.out.println("ENTER A VALID OPERATOR ");

        }
        sc.close();
    }
    
}

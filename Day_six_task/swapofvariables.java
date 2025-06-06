package Day_six_task;
/* 
public class swapofvariables {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        while (a != b) {
            a = b;
            b = a;
            System.out.println("After swapping: a = " + a + ", b = " + b);
            break;
        }
    }
}
a=5;
b=10;
a=a+b
b=a-b;
a=a-b;
public class swapofvariables {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        while (a != b) {
            a = a+b;
            b = a-b;
            a = a-b;
            System.out.println("After swapping: a = " + a + ", b = " + b);
            break;
        }
        
    }
}
*/

public class swapofvariables {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        while (a != b) {
            a = a^b;
            b = a^b;
            a = a^b;
            System.out.println("After swapping: a = " + a + ", b = " + b);
            break;
        }
        
    }
}


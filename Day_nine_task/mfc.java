package Day_nine_task;

public class mfc {
    static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        //double result = add(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
        int sum = add(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.println("the sum is " + sum);
        //System.out.println("The sum is: " + result);  
    }

}

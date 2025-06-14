class Innerthroe {
    double divide (double a, double b){
        if (b == 0){
            throw new ArithmeticException("can't divide 0");
        } else 
        return a/b;
    }

    
}

public class throe {
    public static void main(String[] args) {
        Innerthroe divi = new Innerthroe();
        try {
            System.out.println(divi.divide(10, 1));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}

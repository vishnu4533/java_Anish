public class Exceptioonhandling {
    public static void main(String[] args) {
        int a = 10;
        int[]  b = new int[5];
        try{
            b[a] = 100;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("catch 2: " + e);
        }
        catch (Exception e){
            System.out.println("catch 3: " + e);
        }
        finally {
            System.out.println("Hi!");
        }
    }
}

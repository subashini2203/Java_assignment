package ExceptionHandling;

public class Throw {
    public static void test() throws ArithmeticException{
        
        throw new ArithmeticException("Division by zero");
    }
    public static void main(String[] args) {
        try{
            test();
        }catch(ArithmeticException e)
    {
            System.out.println("Caught an exception: " + e.getMessage());

        } 
    }
}
    


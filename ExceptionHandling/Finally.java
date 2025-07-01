public class Finally {
 
       public static void main(String[] args) {
        try {
            System.out.println("Inside try block.");
            int result = 10 / 0; // This will throw ArithmeticException
        } finally {
            System.out.println("Inside finally block.");
        }
    }
    
}

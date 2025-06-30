public class MultiCatch {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            try{
            int result=a/b; 
            } 
            finally  {
                System.out.println("ArithmeticException caught: Division by zero is not allowed.");
            }   // This will throw an ArithmeticException
            
            int[] numbers={1,2,3}; // This will throw an ArrayIndexOutOfBoundsException
        
            System.out.println(numbers[5]); // index 5 is out of bounds for length 3
            
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){ // Catching multiple exceptions in a single catch block
                                                                        
            System.out.println("Exception caught: " + e.getMessage());
        }
        
    }
    
}

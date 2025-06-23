public class MultiCatch {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            int result=a/b;     // This will throw an ArithmeticException
            
            int[] numbers={1,2,3}; // This will throw an ArrayIndexOutOfBoundsException
           
            System.out.println(numbers[5]); 
            
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            // Catching multiple exceptions in a single catch block
            System.out.println("Exception caught: " + e.getMessage());
        }
        
    }
    
}

package ExceptionHandling;
import java.util.Scanner;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class Custom {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("Enter a number between 1 and 10:");
           int age=scanner.nextInt();
           if(age<18)
           {
               throw new InvalidAgeException("your age should be above 18.");
           }
        }
        catch(InvalidAgeException e){
            System.out.println("Custom Exception: " + e);
        }
        catch(Exception e){
            System.out.println("An error occurred: " + e);
        }
       
           
        
    }
    
}

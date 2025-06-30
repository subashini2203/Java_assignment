import java.util.Scanner;

class EmptyStringException extends Exception{
    public EmptyStringException(String message) {
        super(message);
    }
}
public class StringEmpty {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string:");
    String userInput = scanner.nextLine();
    try{
        
          if(userInput.isEmpty()) {
            EmptyStringException obj=new EmptyStringException( "String cannot be empty.");
        throw obj;
    }else{
        System.out.println("You entered: " + userInput);
    }}
    catch(EmptyStringException e){
        System.out.println("Custom Exception: " + e.getMessage());
    }
}
   







    
}

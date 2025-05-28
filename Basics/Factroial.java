
import java.util.Scanner;

public class Factroial {
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int result = 1; 
        int i = 1;     

     
        while (i <= n) {
             result = result * i;
            i++; 
        }

        
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
    


    


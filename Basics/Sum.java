
import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=Scan.nextInt();
        System.out.println("Enter the second number");
        int num2=Scan.nextInt();
       int sum=num1+num2;
         int difference=num1-num2;
         int product=num1*num2;
         int quotient=num1/num2;
         System.out.println("sum:"+sum);
         System.out.println("difference:"+difference);
         System.out.println("product:"+product);
         System.out.println("quotient:"+quotient);


    }
}

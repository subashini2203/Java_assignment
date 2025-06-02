import java.util.Scanner;

public class NumberCount {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int PositiveCount=0;
        int NegativeCount=0;
        int ZeroCount=0;
        System.out.println("How many Number will you enter?");
        int totalNumber=scanner.nextInt();
        for(int i=1;i<=totalNumber;i++){
        
        System.out.println("Enter number"+i+":");
        int number=scanner.nextInt();
        if(number>0){
            PositiveCount++;
        }
        else if(number<0){
            NegativeCount++;
        }
        else{
            ZeroCount++;
        }

        }
        System.out.println("Positive numbers: " + PositiveCount);
        System.out.println("Negative numbers: " + NegativeCount);
        System.out.println("Zero numbers: " +ZeroCount);

        scanner.close();
    }
}

    
    

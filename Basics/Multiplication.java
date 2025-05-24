import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        System.out.println("multiplication table of "+number+":");
        for(int i=1;i<=10;i++){
            int result=number*i;
            System.out.println(number+"x"+i+"="+result);
        }
        


    }
    
}

public class FibonacciNumber {
    public static void main(String[] args){
        int n=5;
        int first=0,second=1;
        System.out.println("Fibonacci series up to  " +n+ " term:");
        for(int i=1;i<=n;i++){
            System.out.println(first+" ");
            int next=first+second;
            first=second;
            second=next;

        }
    }
    
}

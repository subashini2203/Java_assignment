public class Finally {
    public static void main(String[] args) {
        // int result=10/0;
         
        try {
            System.out.println("try block"); 
            int result=10/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    
        int  result=5;
        // finally {
        //     System.out.println("This block are finally.");
        // }
        System.out.println("program completed");
    }
}
       
    


public class Throws{
    //  this method return int value
   
    public static int demo(){ 
          int result=0;
             
        try{
          
            System.out.println("try block");
          result=10/0;
           
            
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("This block is finally");
           
        }
         return result;
    }
       public static void main(String[] args){
        // calling demo method
        int result=demo();
        System.out.println("result: " + result);
    }
}


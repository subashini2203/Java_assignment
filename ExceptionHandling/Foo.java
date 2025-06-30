public class Foo {
    // This method throws an exception
    public static void foo() throws Exception{
        System.out.println("foo method called");
       
        int result=10/0; // ArithmeticException
    }
    public static void main(String[] args){
        try{
            //  calling foo method
            foo();
        }catch(Exception e){
            
            System.out.println("Exception caught:"+e.getMessage()); // Catching the exception thrown by foo method
        }

        }
    }

    


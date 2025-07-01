public class Return {
    public static void main(String[] args) {
        System.out.println("Returned value: " + testMethod());
    }

    public static int testMethod() {
        try {
            System.out.println("Inside try block.");
            return 100; // Return statement inside try
        } finally {
            System.out.println("Inside finally block.");
        }
    }
}
    


public class Immutabality {
    public static void main(String[] args) {
        String original = "Hello";

        // Try to concatenate a new string
        String modified = original.concat(" World");

        System.out.println("Original String: " + original);
       
        System.out.println("Modified String: " + modified);
    }
}
    


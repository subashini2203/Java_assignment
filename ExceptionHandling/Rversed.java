public class Rversed {
    
    public static void main(String[] args) {
        String input = "hello";  // Original string
        String reversed = "";    // To store the reversed string

        // Loop through the string from end to start
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);  // Append each character in reverse order
        }

        // Print the reversed string
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
    


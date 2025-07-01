public class Vowel {
    
    public static int countVowels(String str) {// Method to count vowels
        int count = 0;
        str = str.toLowerCase(); // Convert string to lowercase

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    // Main method to test
    public static void main(String[] args) {
        String input = "Education";
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
    }
}

    


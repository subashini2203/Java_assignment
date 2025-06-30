package Exception_Handling;
public class StringImmute{
    public static void main(String[] args) {
        String original="hello";
        String modifier="world";
        String modified=original.concat(modifier);
        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + modified);

//        String s = "Java";
// s.concat(" Programming");
// System.out.println(s); // Output: Java

// String s2 = s.concat(" Programming");
// System.out.println(s2); // Output: Java Programming
    
    }
}
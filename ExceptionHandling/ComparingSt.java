public class ComparingSt {
    

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");

        // Reference comparison
        System.out.println(s1 == s2);

        // Content comparison
        System.out.println(s1.equals(s2));
    }
}

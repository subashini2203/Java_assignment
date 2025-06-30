public class TwoString {
    public static void main(String[] args){
        String str1="Java";
        String str2=new String("Java");
        if(str1==str2){
            System.out.println("Both strings are same using == operator");
        } else {
            System.out.println("Both strings are different using == operator");
        }
        if(str1.equals(str2)){
            System.out.println("Both strings are same using equals() method");
        } else {
            System.out.println("Both strings are different using equals() method");
        }
    }
    
}

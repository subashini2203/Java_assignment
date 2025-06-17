package Exception_Handling;

public class CompareString {
    public static void main(String[] args){

    
    String str1="java";
    String str2=new String("java");
    if(str1==str2){
        System.out.println("Both strings are equal using '==' operator.");
    } else {
        System.out.println("Strings are not equal using '==' operator.");
    }
    if(str1.equals(str2)){
        System.out.println("Both strings are equal using 'equals()' method.");
    } else {
        System.out.println("Strings are not equal using 'equals()' method.");
    }
}
}
    
    


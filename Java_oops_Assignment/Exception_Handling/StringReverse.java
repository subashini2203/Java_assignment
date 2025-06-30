package Exception_Handling;

public class StringReverse {
    public static void main(String[] args) {
        String input="hello";
        String reversed="";
        for(int i=input.length()-1;i>=0;i=i-1){
            reversed=reversed+input.charAt(i);
        }
        System.out.println("Reversed String:"+reversed);
        
    }
    
}

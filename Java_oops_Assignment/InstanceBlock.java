class demo{
    static{
        System.out.println("Static block of demo class");
    }
    
    {
        System.out.println("Instance block of demo class");
    }
    demo(){
        System.out.println("Constructor of demo class");
    }
}
public class InstanceBlock {
    public static void main(String[] args) {
        System.out.println("Main method started");
        demo d1 = new demo();
        demo d2 = new demo();
        System.out.println("Main method ended");
    }
    
}

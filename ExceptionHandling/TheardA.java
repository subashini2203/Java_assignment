class A extends Thread {
    public void run() {
        System.out.println("Thread is running...");
}
}
class B extends Thread {
    public void run() {
        System.out.println("Thread B is running...");
    }

}


public class TheardA {
    public static void main(String[] args) {
        A a1 = new A(); 
        B b1 = new B(); 
        a1.start();
        b1.start();
    }
}



    


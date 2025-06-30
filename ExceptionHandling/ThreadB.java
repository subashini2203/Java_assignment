class A extends Thread {
    public void run() {
    for (int i = 0; i < 5; i++) {
        System.out.println("Thread A is running... " );
    }
}
}
class B extends Thread {
    public void run() {
    for (int i = 0; i < 5; i++) {
        System.out.println("Thread B is running... " );
    }
    }
}
public class ThreadB {
    public static void main(String[] args) {
        A a1 = new A(); 
        B b1 = new B(); 
        a1.start();
        b1.start();
    
}
}

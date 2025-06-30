class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
        try {
            Thread.sleep(1000); // Timed Waiting
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread(); // New
        System.out.println("State after creation: " + t.getState());
        t.start(); // Runnable
        System.out.println("State after start: " + t.getState());
        Thread.sleep(100); // Give time for thread to enter sleep
        System.out.println("State during sleep: " + t.getState());
        t.join(); // Wait for thread to finish
        
        System.out.println("State after termination: " + t.getState());
    }
}